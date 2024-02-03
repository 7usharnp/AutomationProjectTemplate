package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalDetailPage_updateProfilePicPage {

   private WebDriver driver;

    //locators
    private By submitBtn = By.xpath("//form/div/div/div[2]/input");
    private By emptyFormValidationMsg = By.xpath("//div/div[2]/div/div/div[2]");
    private By uploadImageInput = By.xpath("//*[contains(@id, 'edit-field-profile-image')]");


    //constructor
    public PersonalDetailPage_updateProfilePicPage(WebDriver driver) {
        this.driver=driver;
    }


    public void submitEmptyPopupForm() {
        driver.findElement(submitBtn).click();
    }

    public String checkEmptyFormValidation() {
      return  driver.findElement(emptyFormValidationMsg).getText();
    }

    public void uploadImage(String s) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(uploadImageInput).sendKeys(s);
        driver.findElement(submitBtn).click();
        ;
    }
}
