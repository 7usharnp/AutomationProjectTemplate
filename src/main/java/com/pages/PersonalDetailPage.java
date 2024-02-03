package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonalDetailPage {
    private WebDriver driver;

    //Webdriver
    private By resetPwd = By.xpath("//*[@id='block-can-theme-content']/div/section[1]/div[3]/a");
    private By resetPwdPopupTitle = By.xpath("/html/body/div[2]/div[2]/form/div[1]/div/div/p/span");
    private By companyNameInptfield = By.id("edit-field-current-company");
    private By currentLocationField = By.id("edit-field-current-location");
    private By currentDesignationInptField = By.id("edit-field-current-designation");
    private By dobInptfield = By.id("edit-field-date-of-birth");
    private By maleRadioBtn = By.xpath("//div[@id='edit-field-gender']/div/label");
    private By femaleRadioBtn = By.xpath("//div[@id='edit-field-gender']/div[2]/label");
    private By otherRadioBtn = By.xpath("//div[@id='edit-field-gender']/div[3]/label");
    private By marriatalStatus = By.id("edit-field-marital-status");
    private By officeLocation = By.id("edit-field-cybage-location");
    private By linkedinIdInputField = By.id("edit-field-linkedin-profile");
    private By twitterInputField = By.id("edit-field-twitter-profile");
    private By facebookInputField= By.id("edit-field-facebook-profile");
    private By editProfileIcon = By.xpath("//*[@id=\"block-can-theme-content\"]/div/section[1]/div[1]/a/img");
  private By updateProfilePopup = By.xpath("//img[@alt='Upload image']");

    //constructor
    public PersonalDetailPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void clickResetPwdLink(){
        driver.findElement(resetPwd).click();

    }


    public boolean checkPwdResetPopup() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(resetPwdPopupTitle));
        return driver.findElement(resetPwdPopupTitle).isDisplayed();
    }

    public PersonalDetailPage_updateProfilePicPage userClicksOnEditProfileIcon() {
        driver.findElement(editProfileIcon).click();
        return new PersonalDetailPage_updateProfilePicPage(driver);
    }

    public HeaderSection moveToHeaderSection() {
        return new HeaderSection(driver);
    }

    public FooterSection moveToFooterSection() {
        return new FooterSection(driver);
    }

    public void enterCompanyName(String companyName) {
        driver.findElement(companyNameInptfield).clear();
        driver.findElement(companyNameInptfield).sendKeys(companyName);
    }

    public void enterCurrentLocation(String location) {
        driver.findElement(currentLocationField).clear();
        driver.findElement(currentLocationField).sendKeys(location);
    }

    public void enterCurrentDesignation(String designation) {
        driver.findElement(currentDesignationInptField).clear();
        driver.findElement(currentDesignationInptField).sendKeys(designation);
    }

    public void enterDob(String dob) {
        driver.findElement(dobInptfield).sendKeys(dob);
    }

    public void selectGender(String gender) {
        if (gender.equals("Male")) {
            if (!driver.findElement(maleRadioBtn).isSelected()) {
                driver.findElement(maleRadioBtn).click();
            }
        } else if (gender.equals("Female")) {
            if (!driver.findElement(femaleRadioBtn).isSelected()) {
                driver.findElement(femaleRadioBtn).click();
            }
        } else if (gender.equals("Other")) {
            if (!driver.findElement(otherRadioBtn).isSelected()) {
                driver.findElement(otherRadioBtn).click();
            }
        }
    }


    public void SelectMaritalStatus(String status) {
        Select dropDownStatus = new Select(driver.findElement(marriatalStatus));


        if (status.equals("Married")) {
            dropDownStatus.selectByVisibleText("Married");
        } else if (status.equals("Single")) {
            dropDownStatus.selectByVisibleText("Single");
        }
    }

   public void SelectCybageOfficeLocation(String location){
        Select locationDropdown = new Select(driver.findElement(officeLocation));
        if(location.equals("PUNE")){
            locationDropdown.selectByVisibleText("PUNE");
        }if(location.equals("HYDERABAD")){
            locationDropdown.selectByVisibleText("HYDERABAD");
       }if(location.equals("GANDHINAGAR")){
           locationDropdown.selectByVisibleText("GANDHINAGAR");
    }
   }

   public void enterLinkedInId(String linkedinId){
        driver.findElement(linkedinIdInputField).sendKeys(linkedinId);
   }

    public void enterTwitterId(String twitterId){
        driver.findElement(twitterInputField).sendKeys(twitterId);
    }

    public void enterFacebookId(String facebookId){
        driver.findElement(facebookInputField).sendKeys(facebookId);
    }

    public boolean checkEditProfilePopup()  {

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(updateProfilePopup));
       return driver.findElement(updateProfilePopup).isDisplayed();
    }
}
