/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Domaci2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //validni kredencijali

       // driver.findElement(By.id("user-name")).sendKeys("standard_user");
       // driver.findElement(By.id("password")).sendKeys("secret_sauce");
       // driver.findElement(By.id("login-button")).click();

        //nevalidni kredencijali

       // driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
      // driver.findElement(By.id("password")).sendKeys("secret_sauce");
      //  driver.findElement(By.id("login-button")).click();

      //koriscnje asertacija


        String validUsername = "standard_user";
        String validPassword = "secret_sauce";
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys(validUsername);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(validPassword);
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        Thread.sleep(5000);
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        username.clear();
        password.clear();
        String validUsername2 = "locked_out_user";
        String validPassword2 = "secret_sauce";
        WebElement username2 = driver.findElement(By.id("user-name"));
        username2.sendKeys(validUsername2);
        WebElement password2 = driver.findElement(By.id("password"));
        password2.sendKeys(validPassword2);
        login.click();
        Thread.sleep(5000);
        driver.quit();



    }
}

 */


