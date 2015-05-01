package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EarningPage extends PageObject {
	
	WebDriver driver;
	
	public EarningPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css="h3")
	WebElement pageName;
	
	@FindBy(css="th")
	WebElement columnMonth;
	
	@FindBy(xpath="//th[2]")
	WebElement columnEarning;
	
	public String getPageName(){
		
		return pageName.getText();
	}
	
	public String getColumnMethods(){
		
		return columnMonth.getText();
	}
	
	public String getColumnEarning(){
		
		return columnEarning.getText();
	}


}
