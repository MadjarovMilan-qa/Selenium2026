
/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class DomaciTabovi {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");
        js.executeScript("window.open()");

        ArrayList<String> listaTabova = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(listaTabova.get(1));
        driver.navigate().to("https://www.wikipedia.com/");
        System.out.println("www.wikipedia.com " + driver.getTitle());
        driver.switchTo().window(listaTabova.get(2));
        driver.navigate().to("https://www.github.com/");
        System.out.println("www.github.com " + driver.getTitle());
        driver.switchTo().window(listaTabova.get(3));
        driver.navigate().to("https://www.reddit.com/");
        System.out.println("www.reddit.com " + driver.getTitle());
        driver.switchTo().window(listaTabova.get(4));
        driver.navigate().to("https://www.bbc.com/");
        System.out.println("www.bbc.com " + driver.getTitle());
        driver.switchTo().window(listaTabova.get(5));
        driver.navigate().to("https://www.joberty.com/");
        System.out.println("www.joberty.com " + driver.getTitle());

        for(int i = 0; i < listaTabova.size(); i++){
            driver.switchTo().window(listaTabova.get(i));
            if(!driver.getCurrentUrl().equals("https://www.github.com/" + "https://www.reddit.com/")){
                driver.close();
            }
        }

    }
}

 */
