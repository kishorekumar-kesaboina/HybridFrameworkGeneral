package com.phptravel.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	public static void waitForPageLoaded(WebDriver driver) {

		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript(
						"return document.readyState").equals("complete");
			}
		};

		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			//wait.until(expectation);
		} catch (Throwable error) {
			//assertFalse("Timeout waiting for Page Load Request to complete.",
					//true);
		}
	}

}
