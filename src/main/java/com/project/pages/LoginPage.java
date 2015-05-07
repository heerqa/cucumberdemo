package com.project.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	static final Logger logger = Logger.getLogger(LoginPage.class);
	WebDriver driver;
	
	WebElement titleLoginPage;
	
	@FindBy(id="user_email")
	WebElement email;
	
	@FindBy(id="user_password")
	WebElement password;
	
	@FindBy(id="admin_email")
	WebElement adminemail;
	
	@FindBy(id="admin_password")
	WebElement adminpassword;
	
	
	@FindBy(name="commit")
	WebElement submitBtn;
	
		
	
	public void setEmail(String strEmail) {
		email.sendKeys(strEmail);
	}



	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
		
	}
	

	public void setAdminEmail(String strEmail) {
		adminemail.sendKeys(strEmail);
	}



	public void setAdminPassword(String strPassword) {
		adminpassword.sendKeys(strPassword);
		
	}

	
	 
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Get Page title
	
	public String getLoginPageTitle(WebDriver driver){
		
		return driver.getTitle();
	}
	
	
	
	//Click on submit button
	public void clickSubmitBtn(){
		submitBtn.click();
	}
	
	
	public void login(String strEail, String strPass) throws Throwable{
		logger.info("Login method is called");
		setEmail(strEail);
		logger.info("enter email");
		
		setPassword(strPass);
		logger.info("enter password");
		
		
		clickSubmitBtn();
		logger.info("click submit button");
		
		
		Thread.sleep(4000);
	}
	
	public void adminLogin(String strEail, String strPass) throws Throwable{
		logger.info("Login method is called");
		setAdminEmail(strEail);
		logger.info("enter email");
		
		setAdminPassword(strPass);
		logger.info("enter password");
		
		
		clickSubmitBtn();
		logger.info("click submit button");
		
		
		Thread.sleep(4000);
	}





}
