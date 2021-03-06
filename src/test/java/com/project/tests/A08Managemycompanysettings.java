package com.project.tests;

import java.util.Random;

import org.apache.log4j.Logger;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;

import com.project.common.BrowserUtils;
import com.project.common.CommonMethods;
import com.project.common.EnvSetUP;
import com.project.pages.CompanyProfile;
import com.project.pages.HomePage;
import com.project.pages.LoginPage;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class A08Managemycompanysettings {

	static final Logger logger = Logger.getLogger(A08Managemycompanysettings.class);
	//test data to be used for all the test in this class
	Random rand = new Random();
	int num=rand.nextInt((99999 - 11111) + 1) + 11111;
	
	final String newname="newname"+CommonMethods.uniqueval();
	final String strnewemail="email"+CommonMethods.uniqueval()+"@someemail.com";
	final String straddress= "addresss"+CommonMethods.uniqueval();
	final String strzipString=String.valueOf(num);
	final String strcityname= "city"+CommonMethods.uniqueval();
	final String strphone="88889"+String.valueOf(num);
	final String strcountry="India";

	public A08Managemycompanysettings() throws Throwable{};
	
	
	
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	CompanyProfile companyProfile;


	
	@Given("^User is on Home page$")
	public void user_is_on_Home_page() throws Throwable {
		String strEail = EnvSetUP.getInstance().getproperties("emailownner");
		String strPass = EnvSetUP.getInstance().getproperties("password");
		driver=BrowserUtils.getInstance().getDriver();
		loginPage = new LoginPage(driver);
		loginPage.login(strEail, strPass);
		System.out.println("---------------------------Home_page()");	
		

		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getSuccessMsg().contains(
				"Signed in successfully"));
	 
	}

	@When("^user click on Company link$")
	public void user_click_on_Company_link() throws Throwable {
		homePage= new HomePage(driver);
		homePage.clickCompany();
	    
	}

	@When("^user changs all the field and click save button$")
	public void user_changs_all_the_field_and_click_save_button() throws Throwable {
		CompanyProfile companyProfile= new CompanyProfile(driver);
		
		
	

		companyProfile.setCompName(newname);
		companyProfile.setEmail(strnewemail);
		companyProfile.setAddress(straddress);
		companyProfile.setZipcode(strzipString);
		companyProfile.setCity(strcityname);
		companyProfile.setCountry(strcountry);
		companyProfile.setPhone(strphone);
		
		Thread.sleep(4000);
		companyProfile.clickSave();
	 
	 
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		homePage=new HomePage(driver);
		Assert.assertTrue(homePage.getSuccessMsg().contains("Company was updated successfully"));
	   
	}

	@When("^open the company page$")
	public void open_the_company_page() throws Throwable {
		homePage=new HomePage(driver);
		homePage.clickCompany();
	}

	@Then("^all the field should be populated as per update$")
	public void all_the_field_should_be_populated_as_per_update() throws Throwable {
	  companyProfile= new CompanyProfile(driver);
	    logger.info(companyProfile.getCountry());
	    Assert.assertEquals(newname, companyProfile.getCompName());
	    Assert.assertEquals(strnewemail, companyProfile.getEmail());
	    Assert.assertEquals(straddress, companyProfile.getAddress());
	    Assert.assertEquals(strzipString, companyProfile.getZipcode());
	    Assert.assertEquals(strcityname, companyProfile.getCity());
	    Assert.assertEquals(strcountry, companyProfile.getCountry());
	    Assert.assertEquals(strphone, companyProfile.getPhone());
	    
	}
	


}
