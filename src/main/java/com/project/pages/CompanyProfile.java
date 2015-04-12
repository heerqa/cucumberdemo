package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.project.common.CommonMethods;

public class CompanyProfile {
	
	WebDriver driver;
	
	public CompanyProfile(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(id="company_name")
	WebElement compName;
	
	@FindBy(name="commit")
	WebElement saveBtn;
	
	public void clickSave(){
		saveBtn.click();
	}
	
	
	public void editCompName() throws Throwable{
		String newname="name"+CommonMethods.uniqueval();
		compName.clear();
		compName.sendKeys(newname);
		saveBtn.click();
	}
		

}
