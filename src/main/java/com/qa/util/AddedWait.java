package com.qa.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddedWait {

	
	private WebDriver driver;

	public AddedWait(WebDriver driver) {
		this.driver = driver;
	}
	
//	public void waitTillElementLocated(WebDriver driver, WebElement element) {
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
//		driver.findElement(element).click();
//	}
	
	
}
