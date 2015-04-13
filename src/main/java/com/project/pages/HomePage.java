package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.log4j.Logger;



import com.project.common.CommonMethods;

public class HomePage {
	static final Logger logger = Logger.getLogger(HomePage.class);

	WebDriver driver;
	
	@FindBy(linkText = "Company")
	WebElement company;

	@FindBy(css = "div.alert.alert-info")
	WebElement successMsg;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCompany() throws Throwable {
		logger.info("clickCompany method is running");
		company.click();
		logger.info("click on Company link");
		
		Thread.sleep(4000);
	
	}

	public String getSuccessMsg() {

		return successMsg.getText();

	}

}
