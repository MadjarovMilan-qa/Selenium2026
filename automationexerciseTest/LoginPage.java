package automationexerciseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage  {
    private WebDriver driver;



    public LoginPage(WebDriver driver) {
        this.driver = driver;


    }




    public WebElement getLoginLink() {
        return driver.findElement(By.xpath("//a[@href='/login']"));
    }
    public void clickLoginLink(){
        getLoginLink().click();
    }


    public WebElement getEmailLoginInput() {
        return driver.findElement(By.xpath("//*[@data-qa='login-email']"));
    }

    public WebElement getPasswordLoginInput() {
        return driver.findElement(By.xpath("//*[@data-qa='login-password']"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath("//*[@data-qa='login-button']"));
    }

   public void inputEmail(String email){
        getEmailLoginInput().clear();
        getEmailLoginInput().sendKeys(email);
   }
   public void inputPassword(String password){
        getPasswordLoginInput().clear();
        getPasswordLoginInput().sendKeys(password);
   }
   public void clickLoginButton(){
        getLoginButton().click();
    }

}
