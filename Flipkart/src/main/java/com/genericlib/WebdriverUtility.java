package com.genericlib;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebdriverUtility 
{
	/**
	 * To perform MouseHover
	 * @param driver
	 * @param path
	 * @return
	 */

	public WebElement mouseaction(WebDriver driver, WebElement path)
	{
		Actions act=new Actions(driver);
		act.moveToElement(path).click(path).build().perform();
		return path;
	}
	public void waitforElementToBeClickable(WebDriver driver , WebElement element) {
		 WebDriverWait wait = new WebDriverWait(driver,AutoConstant.explicitlyWaitWiat);
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}	
}


