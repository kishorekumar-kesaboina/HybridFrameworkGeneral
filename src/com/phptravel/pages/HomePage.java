package com.phptravel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.phptravel.util.Utility;

public class HomePage {
	WebDriver driver;
	Actions action;
	By myacc_navigationtoggle = By.xpath("//nav[@role='navigation']/div[3]/ul[2]/li[2]/a");
	By logout = By.xpath("//a[contains(text(),'Log Out')]");
	By tours = By.xpath("//ul[@id='social-sidebar-menu']/li[2]");
	By cars = By.xpath("//ul[@id='social-sidebar-menu']/li[3]");
	By hotels = By.xpath("//ul[@id='social-sidebar-menu']/li[1]");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public MenuPages Tours()
	{
		driver.findElement(tours).click();
		return new MenuPages(driver);
	}
	public MenuPages Cars()
	{
		driver.findElement(cars).click();
		return new MenuPages(driver);
	}
	public MenuPages Hotels()
	{
		driver.findElement(hotels).click();
		return new MenuPages(driver);
	}
	public LoginPage logOut()
	{
		action.moveToElement(driver.findElement(myacc_navigationtoggle)).build().perform();
		
		driver.findElement(logout).click();
		 Utility.waitForPageLoaded(driver);
		return new LoginPage(driver);
	}
}
