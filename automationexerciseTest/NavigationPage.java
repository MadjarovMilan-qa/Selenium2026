package automationexerciseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationPage extends BasePage {


    public NavigationPage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;

    }

    public WebElement getHomeButton(){
        return driver.findElement(By.cssSelector("a[href='/']"));
    }
    public WebElement getProductsButton(){
        return driver.findElement(By.cssSelector("a[href='/products']"));
    }
    public WebElement getCartButton(){
        return driver.findElement(By.cssSelector("a[href='/view_cart']"));
    }
    public WebElement getSignupLoginButton(){
        return driver.findElement(By.cssSelector("a[href='/login']"));
    }
    public WebElement getTestCasesButton(){
        return driver.findElement(By.cssSelector("a[href='/test_cases']"));
    }
    public WebElement getAPITestingButton(){
        return driver.findElement(By.cssSelector("a[href='/api list']"));
    }
    public WebElement getVideoTutorialsButton(){
        return driver.findElement(By.cssSelector("a[href='https://www.youtube.com/c/AutomationExercise']"));
    }
    public WebElement getContactUsButton (){
        return driver.findElement(By.cssSelector("a[href='/contact_us']"));
    }
//-----------------------------------
    public void clickHomeButon(){
        getHomeButton().click();
    }
    public void clickProductsButton(){
        getProductsButton().click();
    }
    public void clickCartButton(){
        getCartButton().click();
    }
    public void clickSignupButton(){
        getSignupLoginButton().click();
    }
    public void clickTestCasesButton(){
        getTestCasesButton().click();
    }
    public void clickAPITestingButton(){
        getAPITestingButton().click();
    }
    public void clickVideoTutorialsButton(){
        getVideoTutorialsButton().click();
    }
    public void clickContactUsButton(){
        getContactUsButton().click();
    }




}
