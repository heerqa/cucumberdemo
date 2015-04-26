package com.project.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppDetailsPage {

	static final Logger logger = Logger.getLogger(AppDetailsPage.class);
	WebDriver driver;
	
	@FindBy(css="h1")
	WebElement appname;
	
	@FindBy(linkText="Edit")
	WebElement edit;
	
	@FindBy(linkText="Back")
	WebElement back;
	
	public AppDetailsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickEdit(){
		logger.info("click on edit button");
		edit.click();
		
	}
	public String getAppName(){
		logger.info("get app name");
		return appname.getText();
		
	}
	public void clickBack(){
		logger.info("click on back button");
		back.click();
		
	}
	

}
