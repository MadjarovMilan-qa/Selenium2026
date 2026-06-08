package automationexerciseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {

        public RegisterPage(WebDriver driver, WebDriverWait wait) {
            this.driver = driver;
            this.wait = wait;
        }



    //----sign up

    public WebElement getSignupLoginMenuButton() {
        return driver.findElement(By.cssSelector("a[href='/login']"));
    }
    public WebElement getSignUpNameInput() {
        return driver.findElement(By.cssSelector("[data-qa='signup-name']"));
    }
    public WebElement getSignUpEmailInput() {
        return driver.findElement(By.cssSelector("[data-qa='signup-email']"));
    }
    public WebElement getSignUpButton() {
        return driver.findElement(By.cssSelector("[data-qa='signup-button']"));
        }


    //----radio button
        public WebElement getTitleRadioButton (String gender){
            if (gender.equals("female")){
                return driver.findElement(By.id("id_gender2"));}
            else if (gender.equals("male")){
                return driver.findElement(By.id("id_gender1"));}
            return null;
        }
    //----kredencijali 1

        public WebElement getNameInput (){
            return driver.findElement(By.id("name"));
        }
        public WebElement getEmailInput (){
            return driver.findElement(By.id("email"));
        }
        public WebElement getPasswordInput (){
            return driver.findElement(By.id("password"));
        }

    //-----dropdown metode d.m.yy

        public void selectDay(String day){
            Select select = new Select( driver.findElement(By.id("days")));
            select.selectByValue(day);
        }
        public void selectMonth(String months){
            Select select = new Select( driver.findElement(By.id("months")));
            select.selectByValue(months);
        }
        public void selectYear(String year){
            Select select = new Select( driver.findElement(By.id("years")));
            select.selectByValue(year);

    //---boxevi

        }
        public WebElement newsLetterCheckBox(){
            return driver.findElement(By.id("newsletter"));
        }
        public WebElement specialOffersCheckBox(){
            return driver.findElement(By.id("optin"));
        }

    //---kredencijali    2

        public WebElement getFirstNameInput(){
            return driver.findElement(By.id("first_name"));
        }
        public WebElement getLastNameInput(){
            return driver.findElement(By.id("last_name"));
        }
        public WebElement getCompanyInput(){
            return driver.findElement(By.id("company"));
        }
        public WebElement getAddress1Input(){
            return driver.findElement(By.id("address1"));
        }
        public WebElement getAddress2Input(){
            return driver.findElement(By.id("address2"));
        }
    //----zemlja
        public void selectCountry(String country) {
            Select select = new Select(driver.findElement(By.id("country")));
            select.selectByValue(country);
        }

    //---kredencijali 3

        public WebElement getStateInput(){
            return driver.findElement(By.id("state"));
        }
        public WebElement getCityInput(){
            return driver.findElement(By.id("city"));
        }
        public WebElement getZipCodeInput(){
            return driver.findElement(By.id("zipcode"));
        }
        public WebElement getMobileNumberInput(){
            return driver.findElement(By.id("mobile_number"));
        }
    //---dugme

        public WebElement CreateAccoutButton(){
            return driver.findElement(By.cssSelector("[data-qa='create-account']"));

            }
        }






