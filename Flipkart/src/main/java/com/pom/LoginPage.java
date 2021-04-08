package com.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	

	

	WebDriver driver;

	@FindBy(name="q")
	private WebElement SearchTextfield;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SearchButton;
	
	@FindBy(xpath="//a[@class='s1Q9rs']")
	private List<WebElement> allphones;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement popup;

	public WebElement getPopup() {
		return popup;
	}



	public List<WebElement> getAllphones() {
		return allphones;
	}

	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	
	public WebElement getSearchTextfield() {
		return SearchTextfield;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}
	
	
	public void clickOnNext(int i)
	{
		driver.findElement(By.xpath("//a[text()='"+i+"']")).click();
	}
	
}
