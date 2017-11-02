package com.phptravel.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.phptravel.pages.HomePage;
import com.phptravel.pages.LoginPage;
import com.phptravel.pages.ManageToursPage;
import com.phptravel.util.Utility;

public class VerifyManageTours {
	WebDriver driver;
	@BeforeTest
	public void launchApp()
	{   
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		  //System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		 // System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
		//driver=new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get("http://phptravels.net/supplier");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void testApp()
	{
		LoginPage login = new LoginPage(driver);
		HomePage home = login.doLogin("supplier@phptravels.com", "demosupplier");
		 Utility.waitForPageLoaded(driver);
		if(home!=null)
		{
			ManageToursPage mtp = home.Tours().manageTours();
			if(mtp.verifyPageTitle("Manage Tours"))
			{
				System.out.println("Page connectd successfully");
				home.logOut();
				Utility.waitForPageLoaded(driver);
				driver.close();
			}
		}
		else
		{
			System.out.println("Failed to Login");
		}
	}
//	@AfterTest
//	public void closeApp()
//	{
//		driver.quit();
//	}
	
	
}
