package com.phptravel.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.phptravel.util.Utility;

public class MenuPages {
	WebDriver driver; 
	By managetours = By.xpath("//ul[@id='Tours']/li[1]");
	By tourextras = By.xpath("//ul[@id='Tours']/li[2]");
	By cars = By.xpath("//ul[@id='Cars']/li[1]");
	By carsextras = By.xpath("//ul[@id='Cars']/li[2]");
	By managehotels = By.xpath("//ul[@id='Hotels']/li[1]");
	By addroom = By.xpath("//ul[@id='Hotels']/li[2]");
	By managerooms = By.xpath("//ul[@id='Hotels']/li[3]");
	By hotelsextras = By.xpath("//ul[@id='Hotels']/li[4]");
	
	
	
	public MenuPages(WebDriver driver)
	{
		this.driver = driver;
	}
	public ManageToursPage manageTours()
	{
		driver.findElement(managetours).click();
		 Utility.waitForPageLoaded(driver);
		return new ManageToursPage(driver);
	}
}
