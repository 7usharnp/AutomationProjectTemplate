package com.pages;

import com.qa.util.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends Actions {
    private WebDriver driver;
    private By submitFormBtn = By.xpath("//*[@id=\"edit-actions-submit\"]");
    private By sendToValidationMsg =By.xpath("//form/div[2]/div");
    private By YourMsgValidationMsg =By.xpath("//div[5]/div[2]");
    private By dropdown =By.name("select");
    private By msgInputBox =By.name("message");
    private By nameInpt =By.name("name");
    private By thankyouMsg = By.xpath("//a[contains(@class, 'thankyou-popup-button')]");


    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public String getTitleOfThePageForContactUsPage() {
       return getTitleOfThePage();
    }

    public void submitForm() {
        click(submitFormBtn);
    }

    public String getSendToInputFieldValidationMsg() {
       return getText(sendToValidationMsg);
    }

    public String getYourMsgInputFieldValidationMsg() {
        return getText(YourMsgValidationMsg);
    }

    public void selectFromDropdown(String expected) {
      selectOption( dropdown,expected);
    }

    public void EnterMessage(String msg) {
        sendKeys(msgInputBox,msg);
    }

    public boolean checkSuccessMessage() {
       return isDisplayed(thankyouMsg);
    }

    public void enterName(String name) {
        sendKeys(nameInpt,name);
    }
}
