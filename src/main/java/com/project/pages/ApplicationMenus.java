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
		if (CommonMethods.ifElementPresent(By.linkText("My Apps"))) {
			driver.findElement(By.linkText("My Apps")).click();
					
		}
		
		
	}
	
	public boolean isMyAppDisplayed() throws Throwable{
		boolean present= false;
		if (CommonMethods.ifElementPresent(By.linkText("My Apps"))) {
			present=true;
					
		}
		return present;
	}


}
