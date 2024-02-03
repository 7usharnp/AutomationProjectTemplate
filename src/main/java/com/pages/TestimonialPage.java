package com.pages;

import org.openqa.selenium.WebDriver;

public class TestimonialPage {

    private WebDriver driver;

    public TestimonialPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getTestimonialPageTitle(){
        return driver.getTitle();
    }
}
