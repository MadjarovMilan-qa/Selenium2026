/*
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.bing.com");
       // driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/form/div[1]/div/textarea")).sendKeys("ITBootcamp");
       // Thread.sleep(5000);
       // driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/form/div[1]/div/textarea")).sendKeys(Keys.ENTER);
       // driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/ol[1]/li[2]/div[1]/div/div[2]/div/div[1]/div/div/div[5]/div/div/div[1]/div/h2/a"));

        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/form/div[1]/div/textarea")).sendKeys("wikipedia");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/form/div[1]/div/textarea")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);

    }
}

 */
