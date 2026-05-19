/*
public class Selenium10 {
    import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

    public class Selenium10 {
        WebDriver driver;

        @BeforeClass
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://practicetestautomation.com/");
        }

        @BeforeMethod
        public void pageSetUp() {
            WebElement practiceButton = driver.findElement(By.id("menu-item-20"));
            practiceButton.click();
            WebElement testLoginPageButton = driver.findElement(By.linkText("Test Login Page"));
            testLoginPageButton.click();
        }

        @Test(priority = 1)
        public void userCanLogIn() {
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement submitButton = driver.findElement(By.id("submit"));

            usernameField.clear();
            usernameField.sendKeys("student");
            passwordField.clear();
            passwordField.sendKeys("Password123");
            submitButton.click();

            WebElement logOutButton = driver.findElement(By.linkText("Log out"));
            Assert.assertTrue(logOutButton.isDisplayed());
            WebElement loggedInMessage = driver.findElement(By.className("has-text-align-center"));
            Assert.assertTrue(loggedInMessage.isDisplayed());
        }

        @Test(priority = 2)
        public void userCanLogOut() {
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement submitButton = driver.findElement(By.id("submit"));

            usernameField.clear();
            usernameField.sendKeys("student");
            passwordField.clear();
            passwordField.sendKeys("Password123");
            submitButton.click();

            WebElement logOutButton = driver.findElement(By.linkText("Log out"));
            logOutButton.click();

            WebElement loginForm = driver.findElement(By.id("login"));
            Assert.assertTrue(loginForm.isDisplayed());
        }

        @AfterMethod
        public void clearCookies() {
            driver.manage().deleteAllCookies();
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }

    }

}

 */
