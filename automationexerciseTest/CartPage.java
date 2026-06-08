package automationexerciseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CartPage {
    private WebDriver driver;
    private WebDriverWait wait;


    public CartPage (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public List<WebElement> getProductListAddedToCart(){

        return driver.findElements(By.cssSelector("btn btn-default add-to-cart"));
    }
    public WebElement ViewCart (){
        return driver.findElement(By.linkText("View Cart"));
    }
    public WebElement ContinueShoppingButton(){
        return driver.findElement(By.xpath("//*[@class='col-sm-6']/a"));
    }
    public WebElement getProceedToRegisterButton(){
      return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='text-center']/a")));
    }
    public WebElement getQuantity (){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class='cart_quantity']/button")));
    }

    public WebElement getViewCartPopUpButton() {
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//u[text()='View Cart']")));
    }
    public List<WebElement> getRemoveFromCartButtons(){
        return driver.findElements(By.className("cart_quantity_delete"));
    }



}

