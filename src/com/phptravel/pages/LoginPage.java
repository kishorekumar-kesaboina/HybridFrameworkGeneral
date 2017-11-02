package com.phptravel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.phptravel.util.Utility;



public class LoginPage {
   WebDriver driver; 
   By username = By.name("email");
   By password = By.name("password");
   By signinbutton = By.xpath("//span[text()='Login']");
   
   public LoginPage(WebDriver driver)
   {
	   this.driver = driver;
   }
   
   public HomePage doLogin(String un,String pwd)
   {
	   driver.findElement(username).sendKeys(un);
	   driver.findElement(password).sendKeys(pwd);
	   driver.findElement(signinbutton).click();
	   Utility.waitForPageLoaded(driver);
	   return new HomePage(driver);
   }
}
