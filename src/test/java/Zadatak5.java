/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException {
        // Ulogovati se na wordpress i proverite da li ste ulogovani na vas nalog

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.wordpress.com");

        WebElement loginButton = driver.findElement(By.linkText("log in"));
        loginButton.click();
        Thread.sleep(5000);
    }
}

 */