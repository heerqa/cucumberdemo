package com.project.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.STRwColActionTypeImpl;

import com.project.common.CommonMethods;

public class CompanyProfile {
	static final Logger logger = Logger.getLogger(CompanyProfile.class);
	
	WebDriver driver;
	public CompanyProfile(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		}
	
	
	
	 
	@FindBy(id="company_name")
	WebElement compName;
	
	@FindBy(id="company_payment_methods_attributes_0_email")
	WebElement email;
	
	@FindBy(id="company_address_attributes_street")
	WebElement address;
	
	@FindBy(id="company_address_attributes_zip_code")
	WebElement zipcode;
	
	@FindBy(id="company_address_attributes_city")
	WebElement city;
	
	@FindBy(id="company_address_attributes_country")
	WebElement country;
	
	@FindBy(id="company_address_attributes_phone")
	WebElement phone;
	

	

	public String getCompName() {
		return compName.getAttribute("value");
	}


	public void setCompName(String strcompName) {
		compName.clear();
		compName.sendKeys(strcompName);
	}

	public String getZipcode() {
		return zipcode.getAttribute("value");
	}


	public void setZipcode(String strzipcode) {
		zipcode.clear();
		zipcode.sendKeys(strzipcode);
	}


	public String getEmail() {
		return email.getAttribute("value");
	}


	public void setEmail(String stremail) {
		email.clear();
		email.sendKeys(stremail);
	}


	public String getAddress() {
		return address.getAttribute("value");
	}


	public void setAddress(String straddress) {
		address.clear();
		address.sendKeys(straddress);
		
	}


	public String getCity() {
		return city.getAttribute("value");
	}


	public void setCity(String strcity) {
		city.clear();
		city.sendKeys(strcity);
	}


	public String getCountry() {
		String selectedOption=new Select(country).getFirstSelectedOption().getText();
		
		return selectedOption;
	}


	public void setCountry(String strcountry) {
		new Select(country).selectByVisibleText(strcountry);
	}


	public String getPhone() {
		return	phone.getAttribute("value");
	}


	public void setPhone(String strtphone) {
		phone.clear();
		phone.sendKeys(strtphone);
	}

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
		logger.info("edited the company name");
		
	}
	
	
}
