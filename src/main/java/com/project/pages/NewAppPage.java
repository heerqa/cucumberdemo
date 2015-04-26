package com.project.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAppPage {
	
	static final Logger logger = Logger.getLogger(NewAppPage.class);
	WebDriver driver;
	
	@FindBy(css="h1")
	WebElement appname;
	
	@FindBy(id="app_platform")
	WebElement plateform;

	@FindBy(id="app_store_id")
	WebElement storeId;

	@FindBy(id="app_name")
	WebElement name;
	
	@FindBy(id="app_orientation")
	WebElement orientation;
	
	@FindBy(name="commit")
	WebElement createApp;
	
	public NewAppPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void setPlateform(String strplateform){
		logger.info("select the plateform");
		 new Select(plateform).selectByVisibleText(strplateform);
	}
	
	public void setStoreID(String strStoreId){
		logger.info("enter the store id");
		storeId.clear();
		storeId.sendKeys(strStoreId);
	
	}
	
	public void setName(String strName){
		
		logger.info("enter the app name");
		name.clear();
		name.sendKeys(strName);
	}
	
	public void setOrientation(String strOrientation){
		logger.info("select the orientation");
		new Select(orientation).selectByVisibleText(strOrientation);
	}
	
	public void clickCreateApp(){
		logger.info("click on create app button");
		createApp.click();
	}
	
	public String getPageName(){
		logger.info("get page name");
		return appname.getText();
		
	}
}
