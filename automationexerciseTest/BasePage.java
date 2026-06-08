package automationexerciseTest;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;
    public RegisterPage registerPage;
    public LoginPage loginPage;
    public HomePage productPage;
    public CartPage cartPage;
    public NavigationPage navigationPage;
    public CheckoutPage checkoutPage;
    public ContactUsPage contactUsPage;




    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        loginPage = new LoginPage(driver);
        productPage = new HomePage(driver, wait);
        cartPage = new CartPage(driver, wait);
        navigationPage = new NavigationPage(driver, wait);
        contactUsPage = new ContactUsPage(driver, wait);
        registerPage = new RegisterPage(driver, wait);

    }

    //----afterMethod
   @AfterClass
   public void tearDown(){
      driver.quit();
    }
}



