package com.project.tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.project.common.BrowserUtils;
import com.project.pages.ApplicationMenus;
import com.project.pages.EarningPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class A07Readappandcompanyearnings {
	WebDriver driver;
	ApplicationMenus applicationMenus;
	EarningPage earningPage;

	@When("^user click on Earning tab$")
	public void user_click_on_Earning_tab() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		applicationMenus= new ApplicationMenus(driver);
		applicationMenus.clickEarning();
	}

	@Then("^page name is Apps Earnings$")
	public void page_name_is_Apps_Earnings() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		earningPage= new EarningPage(driver);
		Assert.assertEquals("Monthly Earnings", earningPage.getPageName());
	}

	
	@Then("^Earning tab is not dispayed$")
	public void earning_tab_is_not_dispayed() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		applicationMenus= new ApplicationMenus(driver);
		Assert.assertFalse(applicationMenus.isEarningDisplayed());
	}

	@When("^user is able to see Company link$")
	public void user_is_able_to_see_Company_link() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		applicationMenus= new ApplicationMenus(driver);
		Assert.assertTrue(applicationMenus.isCompanyDisplayed());
	}

	@Then("^user is able to see Add/Remove User link$")
	public void user_is_able_to_see_Add_Remove_User_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^Earning tab is dispayed$")
	public void earning_tab_is_dispayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User is not able to see company link$")
	public void user_is_not_able_to_see_company_link() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		applicationMenus= new ApplicationMenus(driver);
		Assert.assertFalse(applicationMenus.isCompanyDisplayed());
	}

	@Then("^user is not able to see MyApp link$")
	public void user_is_not_able_to_see_MyApp_link() throws Throwable {
		driver=BrowserUtils.getInstance().getDriver();
		applicationMenus= new ApplicationMenus(driver);
		Assert.assertFalse(applicationMenus.isMyAppDisplayed());
	}
	
}
