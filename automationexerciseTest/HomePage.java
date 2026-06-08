package automationexerciseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
         //-----------Dodata metoda za uklanjanje reklama - clickElementJS - (prebaci u BasePage)

        public void clickWomenCategoryJS() {
            WebElement element = getWomenCategoryButton();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        }

            public void clickElementJS(WebElement element) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", element);
            }
            //-----------------------

        //---------Women Catagory


public WebElement getWomenCategoryButton(){
        return driver.findElement(
            By.xpath("//a[@href='#Women']"));
}
    public WebElement getDressCategoryButton() {
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(
             By.xpath("//a[@href='/category_products/1']"))));
}
    public WebElement getWomansDressButton() {
        return driver.findElement(
                By.xpath("//a[@href='/product_details/3']"));
    }
    public WebElement getAddToCartButton() {
        return driver.findElement(By.cssSelector(".btn.btn-default.cart"));
    }


//-----------Man Category


public WebElement getMenCategoryButton() {
        return driver.findElement(
                By.xpath("//a[@href='#Men']"));
    }
    public WebElement getTshirtsCategoryButton() {
        return    wait.until(ExpectedConditions.visibilityOf(driver.findElement(
                By.xpath("//a[@href='/category_products/3']"))));
    }
    public WebElement getMansTshirtsButton() {
        return driver.findElement(
                By.xpath("//a[@href='/product_details/2']"));
    }
    public WebElement getToCartButton() {
        return driver.findElement(By.cssSelector(".btn.btn-default.cart"));
    }


//-------------ProductQuantity

        public WebElement getProductQuantity(){
            return driver.findElement(By.cssSelector("input#quantity"));
    }


//-------------Subscription

    public WebElement getSubscriptionBox(){
        return driver.findElement(By.cssSelector("input#susbscribe_email"));
    }

//------------Review/Contact us

    public WebElement getReviewNameInput() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getReviewEmailInput() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getReviewTextInput() {
        return driver.findElement(By.id("review"));
    }

    public WebElement getSendReviewButton() {
        return driver.findElement(By.id("button-review"));
    }

//-----------Arrow/Scroll up

    public WebElement getScrollUpArrow(){
        return driver.findElement(By.id("scrollUp"));
    }
    public WebElement getSubscriptionText() {
        return driver.findElement(By.xpath("//h2[text()='Subscription']"));
    }
    public WebElement getTopHeader() {
        return driver.findElement(By.xpath("//h2[contains(text(), 'Full-Fledged')]"));


    }
    }