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

	
}
