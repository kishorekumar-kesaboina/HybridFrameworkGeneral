package com.phptravel.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ManageToursPage {
WebDriver driver;
	public ManageToursPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public boolean verifyPageTitle(String ExpectedTitle)	
	{
		
		//Assert.assertTrue(driver.getTitle().equals(ExpectedTitle));
		if(driver.getTitle().equals(ExpectedTitle))
		{
		System.out.println("actualpage title is :" +driver.getTitle());
			return true;
		}
		else
		{
			return false;
		}
	}
}
