package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Actions {
private WebDriver driver;
 private WebDriverWait wait;


 public Actions (WebDriver driver) {
  this.driver = driver;
  this.wait = new WebDriverWait(driver, 10);
 }

 public void click(By locator) {
  wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
 }
 public void sendKeys(By locator, String text) {
  wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).clear();
  wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
 }
 public String getText(By locator) {
  return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
 }
public boolean isDisplayed(By locator) {
try {
 return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
 } catch (Exception e) {
return false;
 }
 }

 public String getTitleOfThePage(){
  return driver.getTitle();
 }

 public  void selectOption( By locator, String optionText) {
  WebElement dropdown = driver.findElement(locator);
  Select select = new Select(dropdown);
  select.selectByVisibleText(optionText);
 }
}