package com.project.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.common.CommonMethods;
import com.thoughtworks.selenium.webdriven.commands.IsElementPresent;

public class ApplicationMenus {
	static final Logger logger = Logger.getLogger(ApplicationMenus.class);
	WebDriver driver;
	
	/*@FindBy(linkText = "My Apps")
	WebElement myApp;
	*/
	public ApplicationMenus(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickMyApp() throws Throwable{
		logger.info("Click on MyApp link on home page");
		if (CommonMethods.ifElementPresent(By.linkText("Published Apps"))) {
			driver.findElement(By.linkText("Published Apps")).click();
					
		}
		
		
	}
	
	public void clickEarning() throws Throwable{
		logger.info("Click on Earning link on home page");
		if (CommonMethods.ifElementPresent(By.linkText("Earnings"))) {
			driver.findElement(By.linkText("Earnings")).click();
					
		}
		
		
	}
	
	public boolean isMyAppDisplayed() throws Throwable{
		boolean present= false;
		if (CommonMethods.ifElementPresent(By.linkText("Published Apps"))) {
			present=true;
					
		}
		return present;
	}
	
	public boolean isEarningDisplayed() throws Throwable{
		boolean present= false;
		if (CommonMethods.ifElementPresent(By.linkText("Earnings"))) {
			present=true;
					
		}
		return present;
	}

	public void clickDemoConnection() throws Throwable{
		logger.info("Click on MyApp link on home page");
		if (CommonMethods.ifElementPresent(By.linkText("Demo Connections"))) {
			driver.findElement(By.linkText("Demo Connections")).click();
					
		}
		
		
	}
	
	public boolean isDemoConnectionDisplayed() throws Throwable{
		boolean present= false;
		if (CommonMethods.ifElementPresent(By.linkText("Demo Connections"))) {
			present=true;
					
		}
		return present;
	}
	
	public boolean isCompanyDisplayed() throws Throwable{
		boolean present= false;
		if (CommonMethods.ifElementPresent(By.linkText("Company"))) {
			present=true;
					
		}
		return present;
	}

}
