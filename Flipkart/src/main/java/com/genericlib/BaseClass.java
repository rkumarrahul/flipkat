package com.genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{

	public WebDriver driver;
	public ExcelUtility elib=new ExcelUtility();
	
	@BeforeMethod
	public void OpenApp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		FileUtility f=new FileUtility();
		driver.get(f.readDataFromProperty("url"));
	}
	
	@AfterMethod
	public void CloseApp()
	{
		//driver.quit();
	}
}
