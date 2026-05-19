/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.navigate().to("https://google.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(listaTabova.get(0));
        driver.navigate().to("https://Linkedin.com/");
        driver.switchTo().window(listaTabova.get(1));
        driver.navigate().to("https://facebook.com/");
        driver.switchTo().window(listaTabova.get(2));
        driver.navigate().to("https://youtube.com/");
        driver.switchTo().window(listaTabova.get(3));
        driver.navigate().to("https://weatherchanel.com/");
        driver.switchTo().window(listaTabova.get(4));
        driver.navigate().to("https://youtube.com/");
       /*
        driver.close();
        driver.switchTo().window(listaTabova.get(5));
        driver.close();
        driver.switchTo().window(listaTabova.get(4));
        driver.close();
        driver.switchTo().window(listaTabova.get(3));
        driver.close();
        driver.switchTo().window(listaTabova.get(2));
        driver.close();
        driver.switchTo().window(listaTabova.get(1));

        */
/*
        for (int i=0; i<listaTabova.size(); i++) {
            driver.switchTo().window(listaTabova.get(i));
            if(!driver.getCurrentUrl().equals("https://www.google.com/")){
                driver.close();
            }
        }
        }
        }
*/









