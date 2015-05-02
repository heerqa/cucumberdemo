package com.project.tests;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.project.common.BrowserUtils;
import com.project.common.CommonMethods;
import com.project.pages.CompanyProfile;
import com.project.pages.CompanyTeamPage;
import com.project.pages.NewCompanyUserPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class A10Addotheruserslikedeveloperorfinance {
	
	static final Logger logger = Logger.getLogger(A10Addotheruserslikedeveloperorfinance.class);
	WebDriver driver;
	NewCompanyUserPage newCompanyUserPage;
	CompanyTeamPage companyTeamPage;
	final String strname="dev"+CommonMethods.uniqueval();
	final String stremail="devemail"+CommonMethods.uniqueval()+"@nonexxxistence.com";
	
	public A10Addotheruserslikedeveloperorfinance() throws Throwable{
		
	}
	

@When("^user click on New User button$")
public void user_click_on_New_User_button() throws Throwable {
	driver=BrowserUtils.getInstance().getDriver();
	companyTeamPage=new CompanyTeamPage(driver);
	companyTeamPage.clickNewUserBtn();
}

@Then("^New User page is displayed$")
public void new_User_page_is_displayed() throws Throwable {
	  newCompanyUserPage=new NewCompanyUserPage(driver);
	  Assert.assertEquals("New User", newCompanyUserPage.getPageName());
}

@When("^User enters all the fields$")
public void user_enters_all_the_fields() throws Throwable {
	 newCompanyUserPage=new NewCompanyUserPage(driver);
	 newCompanyUserPage.setName(strname);
	 newCompanyUserPage.setEmail(stremail);
	 newCompanyUserPage.setRole("Developer");
	 
}

@When("^user click on send an invitation button$")
public void user_click_on_send_an_invitation_button() throws Throwable {
	 newCompanyUserPage=new NewCompanyUserPage(driver);
	 newCompanyUserPage.clickSendInvitationBtn();
}

@Then("^the user is displayed on Compnay Team section$")
public void the_user_is_displayed_on_Compnay_Team_section() throws Throwable {
	companyTeamPage=new CompanyTeamPage(driver);
   Assert.assertTrue(companyTeamPage.getLatestUserName().contains(strname));
   Assert.assertTrue(companyTeamPage.getLatestRole().contains("Developer"));
}

@Then("^remove the newly added user$")
public void remove_the_newly_added_user() throws Throwable {
	companyTeamPage=new CompanyTeamPage(driver);
	companyTeamPage.clickRemoveBtn();
	   

}

@When("^User enters all the fields and select finance$")
public void user_enters_all_the_fields_and_select_finance() throws Throwable {
	 newCompanyUserPage=new NewCompanyUserPage(driver);
	 newCompanyUserPage.setName(strname);
	 newCompanyUserPage.setEmail(stremail);
	 newCompanyUserPage.setRole("Finance");
}

@Then("^the user is displayed on Compnay Team section as finance$")
public void the_user_is_displayed_on_Compnay_Team_section_as_finance() throws Throwable {
		companyTeamPage=new CompanyTeamPage(driver);
	   Assert.assertTrue(companyTeamPage.getLatestUserName().contains(strname));
	   Assert.assertTrue(companyTeamPage.getLatestRole().contains("Finance"));
}




}
