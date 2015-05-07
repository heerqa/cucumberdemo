package com.project.tests;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.project.common.BrowserUtils;
import com.project.common.EnvSetUP;
import com.project.pages.ApplicationMenus;
import com.project.pages.DemoConnectionPage;
import com.project.pages.HomePage;
import com.project.pages.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class B05ReadEditdemoconnections {
	
	Random rand = new Random();
	int newnum=rand.nextInt((99 - 11) + 1) + 11;
	final String strnum=String.valueOf(newnum);
	
	WebDriver driver;
	
	HomePage homePage;
	ApplicationMenus applicationMenus;
	DemoConnectionPage demoConnectionPage;
	@Given("^User is logged in as super admin$")
	public void user_is_logged_in_as_super_admin() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		driver.get(EnvSetUP.getInstance().getproperties("adminurl"));
		String strEail = EnvSetUP.getInstance().getproperties("superadmin");
		String strPass = EnvSetUP.getInstance().getproperties("superadminpassword");
	
		LoginPage loginPage = new LoginPage(driver);
		loginPage.adminLogin(strEail, strPass);
		
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getSuccessMsg().contains(
				"Signed in successfully"));
	}

	@When("^user click on Demo Connection tab$")
	public void user_click_on_Demo_Connection_tab() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		applicationMenus= new ApplicationMenus(driver);
		applicationMenus.clickDemoConnection();
	}

	@When("^edit all the fields$")
	public void edit_all_the_fields() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		demoConnectionPage= new DemoConnectionPage(driver);
		demoConnectionPage.setChatbooster_appId(strnum);
		demoConnectionPage.setChatbooster_AppSignature(strnum);
		demoConnectionPage.setChatbooster_userId(strnum);
		demoConnectionPage.setChatbooster_userSignature(strnum);
		demoConnectionPage.clickUpdateChartBoostbtn();
		
		demoConnectionPage.setApplift_id(strnum);
		demoConnectionPage.setApplift_account_auth_token(strnum);
		demoConnectionPage.setApplift_secret(strnum);
		demoConnectionPage.setAppnext_pid(strnum);
		demoConnectionPage.clickUpdateAppLift();
		
		demoConnectionPage.setFlurry_apiAccessCode(strnum);
		demoConnectionPage.setFlurry_apiKey(strnum);
		demoConnectionPage.setFlurry_space(strnum);
		demoConnectionPage.clickUpdateFlurrybtn();
		
		demoConnectionPage.setVungle_apiAccessCode(strnum);
		demoConnectionPage.setVungle_appId(strnum);
		demoConnectionPage.setVungle_key(strnum);
		demoConnectionPage.clickVungle_updatebtn();
		
		demoConnectionPage.setPlayhaven_place(strnum);
		demoConnectionPage.setPlayhaven_secret(strnum);
		demoConnectionPage.setPlayhaven_token(strnum);
		demoConnectionPage.clickPlayhaven_updatebtn();
		
		demoConnectionPage.setNativex_appId(strnum);
		demoConnectionPage.clickNativex_updatebtn();
		
		demoConnectionPage.setAppnext_pid(strnum);
		demoConnectionPage.clickAppnext_updatebtn();
	}

	@When("^user click on Demo Connection tab again$")
	public void user_click_on_Demo_Connection_tab_again() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		applicationMenus= new ApplicationMenus(driver);
		applicationMenus.clickDemoConnection();
	}

	@Then("^updated values should be present on demo connection page$")
	public void updated_values_should_be_present_on_demo_connection_page() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		demoConnectionPage= new DemoConnectionPage(driver);
		Thread.sleep(4000);
	    Assert.assertEquals(strnum, demoConnectionPage.getApplift_id());
	    Assert.assertEquals(strnum, demoConnectionPage.getApplift_account_auth_token());
	    Assert.assertEquals(strnum, demoConnectionPage.getApplift_secret());
	    
	    Assert.assertEquals(strnum, demoConnectionPage.getChatbooster_appId());
	    Assert.assertEquals(strnum, demoConnectionPage.getChatbooster_AppSignature());
	    Assert.assertEquals(strnum, demoConnectionPage.getChatbooster_userSignature());
	    Assert.assertEquals(strnum, demoConnectionPage.getChatbooster_userId());
	    
	    Assert.assertEquals(strnum, demoConnectionPage.getFlurry_apiAccessCode());
	    Assert.assertEquals(strnum, demoConnectionPage.getFlurry_apiKey());
	    Assert.assertEquals(strnum, demoConnectionPage.getFlurry_space());
	    
	    Assert.assertEquals(strnum, demoConnectionPage.getVungle_apiAccessCode());
	    Assert.assertEquals(strnum, demoConnectionPage.getVungle_appId());
	    Assert.assertEquals(strnum, demoConnectionPage.getVungle_key());
	    
	    Assert.assertEquals(strnum, demoConnectionPage.getPlayhaven_place());
	    Assert.assertEquals(strnum, demoConnectionPage.getPlayhaven_secret());
	    Assert.assertEquals(strnum, demoConnectionPage.getPlayhaven_token());
	    
	    Assert.assertEquals(strnum, demoConnectionPage.getNativex_appId());
	    
	    Assert.assertEquals(strnum, demoConnectionPage.getAppnext_pid());
	}

	@Given("^User is logged in as admin$")
	public void user_is_logged_in_as_admin() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		driver.get(EnvSetUP.getInstance().getproperties("adminurl"));
		String strEail = EnvSetUP.getInstance().getproperties("admin");
		String strPass = EnvSetUP.getInstance().getproperties("adminpassword");
	
		LoginPage loginPage = new LoginPage(driver);
		loginPage.adminLogin(strEail, strPass);
		
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getSuccessMsg().contains(
				"Signed in successfully"));
	}

	@Then("^Demo Connection tab is not displayed$")
	public void demo_Connection_tab_is_not_displayed() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
	   applicationMenus= new ApplicationMenus(driver);
	   Assert.assertFalse(applicationMenus.isDemoConnectionDisplayed());
	}

	@Given("^User is logged in as operator$")
	public void user_is_logged_in_as_operator() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		driver.get(EnvSetUP.getInstance().getproperties("adminurl"));
		String strEail = EnvSetUP.getInstance().getproperties("operator");
		String strPass = EnvSetUP.getInstance().getproperties("operatorpassword");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.adminLogin(strEail, strPass);
		
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getSuccessMsg().contains(
				"Signed in successfully"));
	}


}
