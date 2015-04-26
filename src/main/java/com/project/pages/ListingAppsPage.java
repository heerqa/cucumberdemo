package com.project.pages;

import org.apache.log4j.Logger;
import org.apache.regexp.recompile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingAppsPage {

	static final Logger logger = Logger.getLogger(ListingAppsPage.class);
	
	WebDriver driver;
	
	@FindBy(linkText="New App")
	WebElement newApp;
	
	@FindBy(css="h3.col-md-10")
	WebElement pageName;
	
	
	public ListingAppsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickNewApp(){
		
		logger.info("Click on New APP button");
		newApp.click();
	}
	
	public String getListedApp(String strlinktext){
		
		return driver.findElement(By.linkText(strlinktext)).getText();
	}
	
	public void clickListedApp(String strlinktext){
		
		logger.info("click on recent app");
		
		driver.findElement(By.linkText(strlinktext)).click();
	}

	public String getPageName(){
		
		return pageName.getText();
	}
}
