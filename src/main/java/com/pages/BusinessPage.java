package com.pages;

import org.openqa.selenium.WebDriver;

public class BusinessPage {
    private WebDriver driver;

    public BusinessPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getBusinessPageTitle(){
        return driver.getTitle();
    }


}
