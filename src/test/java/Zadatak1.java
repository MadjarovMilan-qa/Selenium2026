/*
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak1 {
    public static void main(String[] args) {
        //Zadatak 1
//Pokrenite browser, idite na Linkedin sajt, uradite refresh, idite na Joberty sajt
//vratite se nazad i odstampajte poslednji URL na kom se nalazite
//na kraju zatvorite driver
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.navigate().to("https://www.Linkedin.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();
        driver.navigate().to("https://www.Joberty.com/");
        driver.navigate().back();
        System.out.println("https://www.Joberty.com/");
        driver.quit();

    }
}

 */