package com.pages;

import com.qa.util.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUsPage extends Actions {
   private WebDriver driver;
  private By count = By.xpath("/html/body/div/main/div/div/div/div/div[2]/article/div/div/div[2]/div/div/div/div[1]/div/div[1]/h2");
    public AboutUsPage(WebDriver driver) {
        super(driver);
    }

    public String getAboutUsPageTitle(){
       return getTitleOfThePage();
    }

    public String getGlobalOfficeAccountsCount() {
      return  getText(count);
    }
}
