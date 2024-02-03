package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private  By createAccountButton = By.xpath("//input[@value='CREATE ACCOUNT']");
    private By  username = By.xpath("//input[@id='edit-name']");
    private By pass = By.xpath("//input[@id='edit-pass']");
    private By submitBtn = By.cssSelector("#edit-submit");
    private By emailInputfieldValidationMsg = By.xpath("//*[@id='user-login-form']/div/div[2]/div/div/strong");
    private By forgotPassword = By.xpath("//a[contains(text(),'Forgot Password?')]");
   // private By popupEmail = By.xpath("//*[@id=\"edit-name--T5zEghyD2iE\"]");
    private By popupEmail = By.cssSelector(".img-responsive");
    private By pwdFiledValidationMsg = By.xpath("//*[@id='user-login-form']/div/div[3]/div/div/strong");

    public String getLandingPageTitle() {
        return driver.getTitle();
    }

    public void UserClicksOnCreateAccountLink(){
        driver.findElement(createAccountButton).click();
    }


    public void enterUsername(String uname) {
        driver.findElement(username).sendKeys(uname);
    }

    public void enterPassword(String password){
          driver.findElement(pass).sendKeys(password);
    }

    public void Login(String uname, String password){
        driver.findElement(username).sendKeys(uname);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(submitBtn).click();
    }

    public  PersonalDetailPage clickSubmitBtn(){
        driver.findElement(submitBtn).click();
        return new PersonalDetailPage(driver);

    }

    public void userClicksForgotPasswordLink() {
        driver.findElement(forgotPassword).click();
    }

    public Boolean clicksOnPopupEmailInputField() {
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(popupEmail));
       return driver.findElement(popupEmail).isDisplayed();
    }

    public String checkEmailIdInputFieldValidatinMessage() {
         return driver.findElement(emailInputfieldValidationMsg).getText();
    }

    public void clickLoginEmptyForm() {
        driver.findElement(submitBtn).click();
    }

    public String getErrorValidationMsgForPwdField() {
        return driver.findElement(pwdFiledValidationMsg).getText();
    }
}
