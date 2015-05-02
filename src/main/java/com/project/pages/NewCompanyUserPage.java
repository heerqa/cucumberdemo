package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewCompanyUserPage {
	WebDriver driver;
	
	public NewCompanyUserPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="h1")
	WebElement pageName;
	
	@FindBy(id="user_name")
	WebElement name;
	
	@FindBy(id="user_email")
	WebElement email;
	
	@FindBy(id="user_role")
	WebElement role;
	
	@FindBy(name="commit")
	WebElement sendinvitaitonbtn;
	
	public void setName(String strname){
		name.clear();
		name.sendKeys(strname);
	}
	
	public void setEmail(String stremail){
		email.clear();
		email.sendKeys(stremail);
	}
	
	public void setRole(String strrole){
		
		new Select(role).selectByVisibleText(strrole);
	}

	public void clickSendInvitationBtn(){
		sendinvitaitonbtn.click();
	}
	
	public String getPageName(){
		return pageName.getText();
	}
}
