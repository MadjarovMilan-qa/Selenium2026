import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Selenium9 {
    WebDriver driver;
    WebDriverWait wait;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://practicetestautomation.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @BeforeMethod
    public void pageSetUp() {
        WebElement practiceButon = driver.findElement(By.id("menu-item-20"));
        practiceButon.click();
        WebElement testLoginPageButton = driver.findElement(By.linkText("Test Login Page"));
        testLoginPageButton.click();
    }

    @Test(priority = 1)
    public void userCanLogIn() throws InterruptedException {
        WebElement userNameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        userNameField.clear();
        userNameField.sendKeys("student");
        passwordField.clear();
        passwordField.sendKeys("Password123");
        submitButton.click();
        Thread.sleep(3000);
       WebElement logOutButton = driver.findElement(By.linkText("Log out"));
       Assert.assertTrue(logOutButton.isDisplayed());
       WebElement loggedInMessage = driver.findElement(By.className("has-text-align-center"));
       Assert.assertTrue(loggedInMessage.isDisplayed());
    }
    @Test(priority = 2)
    public void userCanLogOut() throws InterruptedException {
        WebElement userNameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));

        Thread.sleep(3000);
        userNameField.clear();
        userNameField.sendKeys("student");
        userNameField.click();
        passwordField.clear();
        passwordField.sendKeys("Password123");
        passwordField.click();


        WebElement loggedOutButton = driver.findElement(By.linkText("log out"));
        Thread.sleep(3000);
        loggedOutButton.click();

        WebElement loginForm = driver.findElement(By.id("login"));
        Assert.assertTrue(loginForm.isDisplayed());
    }
    @Test(priority = 3)
    public void NegativeUsernameTest() {
        WebElement userNameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        userNameField.clear();
        userNameField.sendKeys("incorrectUser");
        passwordField.clear();
        passwordField.sendKeys("Password123");
        submitButton.click();
        WebElement logoutButton = driver.findElement(By.linkText("Log out"));
        Assert.assertTrue(logoutButton.isDisplayed());
        WebElement loggedInMessage = driver.findElement(By.name("login"));
        Assert.assertTrue(loggedInMessage.isDisplayed());

    }
    @Test(priority = 4)
    public void NegativePasswordTest() {
        WebElement userNameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        userNameField.clear();
        userNameField.sendKeys("student");
        passwordField.clear();
        passwordField.sendKeys("incorrectPassword");
        submitButton.click();
       // WebElement logoutButton = driver.findElement(By.linkText("Log out"));
       // Assert.assertTrue(logoutButton.isDisplayed());
        //WebElement loggedInMessage = driver.findElement(By.name("login"));
        //Assert.assertTrue(loggedInMessage.isDisplayed());
    }




        @AfterMethod
        public void clearCookies() {
        driver.manage().deleteAllCookies();
        }
        @AfterClass
        public void closeBrowser() {
       driver.quit();
        }
    }

