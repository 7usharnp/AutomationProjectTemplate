package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderSection {

    private WebDriver driver;


    //Locators
    By homeLnk = By.xpath("//*[@id='block-mainmenu']/ul[1]/li[1]/a");
    By aboutUsLnk = By.xpath("//*[@id='block-mainmenu']/ul[1]/li[2]/a");
    By businessHeaderLnk= By.xpath("//*[@id='block-mainmenu']/ul[1]/li[4]/a");
    By testimonialHeaderLnk = By.xpath("//*[@id='block-mainmenu']/ul[1]/li[5]/a");
    By ContactHeaderLnk = By.xpath("//*[@id=\"block-mainmenu\"]/ul[1]/li[6]/a");


    //Methods
    public HeaderSection(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage userClicksHome() {
         driver.findElement(homeLnk).click();
         return new HomePage(driver);
    }

    public AboutUsPage clickAboutUsHeaderLink() {
        driver.findElement(aboutUsLnk).click();
        return new AboutUsPage(driver);
    }

    public BusinessPage clickBusinessLnkHeader() {
        driver.findElement(businessHeaderLnk).click();
        return new BusinessPage(driver);
    }

    public TestimonialPage clickTestimonialLnkHeader() {
       driver.findElement(testimonialHeaderLnk).click();
       return new TestimonialPage(driver);
    }

    public ContactUsPage clickContactLink() {
        driver.findElement(ContactHeaderLnk).click();
        return new ContactUsPage(driver);
    }
}
