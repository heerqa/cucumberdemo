/**
 * 
 */
package com.project.tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.project.common.BrowserUtils;
import com.project.pages.ApplicationMenus;
import com.project.pages.ListingAppsPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Shagufta Naz
 *
 */
public class F_47AsadvertiserIcanCreateEditArchivePromotedApp {
	
	WebDriver driver;
	ApplicationMenus applicationMenus;
	ListingAppsPage listingAppsPage;
	
	public F_47AsadvertiserIcanCreateEditArchivePromotedApp() throws Throwable{
		driver=BrowserUtils.getInstance().getDriver();
		applicationMenus=new ApplicationMenus(driver);
		listingAppsPage = new ListingAppsPage(driver);
	}
	
	@When("^user click on promoted app$")
	public void user_click_on_promoted_app() throws Throwable {
	    applicationMenus.clickPromotedApp();
	}

	@Then("^promoted app is not displayed$")
	public void promoted_app_is_not_displayed() throws Throwable {
	    Assert.assertFalse(applicationMenus.isPromotedAppDisplayed());
	}
	
	@Then("^Promoted App listing page is displayed$")
	public void app_listing_page_is_displayed() throws Throwable {
		
		Assert.assertEquals("Promoted Apps", listingAppsPage.getPageName());
	}


}
