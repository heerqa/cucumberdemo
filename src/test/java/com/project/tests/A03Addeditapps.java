package com.project.tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.project.common.BrowserUtils;
import com.project.common.CommonMethods;
import com.project.common.EnvSetUP;
import com.project.pages.AppDetailsPage;
import com.project.pages.ApplicationMenus;
import com.project.pages.HomePage;
import com.project.pages.ListingAppsPage;
import com.project.pages.LoginPage;
import com.project.pages.NewAppPage;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class A03Addeditapps {

	WebDriver driver;
	AppDetailsPage appDetailsPage;
	ApplicationMenus applicationMenus;
	HomePage homePage;
	ListingAppsPage listingAppsPage;
	NewAppPage newAppPage;

	final String name = "appname" + CommonMethods.uniqueval();
	final String storeid = CommonMethods.uniqueval();
	final String palteformbefore = "Apple";
	final String orientationbefore = "Landscape";
	final String palteformafter = "Android";
	final String orientationafter = "Portrait";
	final String nameafter = "appname" + CommonMethods.uniqueval();
	final String storeidafer = CommonMethods.uniqueval();

	public A03Addeditapps() throws Throwable {
	};

	@Before
	public void setUp() throws Throwable {
		
			driver = CommonMethods.createDriver();
		
	}

	@After
	public void tearDown() {
	
		driver.quit();
	}

	@Given("^User is logged in as owner$")
	public void user_is_logged_in_as_owner() throws Throwable {
		String strEail = EnvSetUP.getInstance().getproperties("emailownner");
		String strPass = EnvSetUP.getInstance().getproperties("password");
		driver=BrowserUtils.getInstance().getDriver();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(strEail, strPass);
		
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getSuccessMsg().contains(
				"Signed in successfully"));
	}
	
	@Given("^User is logged in as developer$")
	public void user_is_logged_in_as_developer() throws Throwable {
		String strEail = EnvSetUP.getInstance().getproperties("emaildev");
		String strPass = EnvSetUP.getInstance().getproperties("password");
		driver=BrowserUtils.getInstance().getDriver();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(strEail, strPass);
		
		homePage = new HomePage(driver);
		Assert.assertTrue(homePage.getSuccessMsg().contains(
				"Signed in successfully"));
	}
	

@Given("^User is logged in as financer$")
public void user_is_logged_in_as_financer() throws Throwable {
	String strEail = EnvSetUP.getInstance().getproperties("emailfinace");
	String strPass = EnvSetUP.getInstance().getproperties("password");
	driver=BrowserUtils.getInstance().getDriver();
	LoginPage loginPage = new LoginPage(driver);
	loginPage.login(strEail, strPass);
	
	homePage = new HomePage(driver);
	Assert.assertTrue(homePage.getSuccessMsg().contains(
			"Signed in successfully"));
}

@Then("^Myapp is not displayed$")
public void myapp_is_not_displayed() throws Throwable {
	applicationMenus=new ApplicationMenus(driver);
   Assert.assertFalse(applicationMenus.isMyAppDisplayed());
}


	@When("^user click on MyApp$")
	public void user_click_on_MyApp() throws Throwable {
		applicationMenus = new ApplicationMenus(driver);
		applicationMenus.clickMyApp();
	}

	@When("^user click on NewApp$")
	public void user_click_on_NewApp() throws Throwable {
		listingAppsPage = new ListingAppsPage(driver);
		listingAppsPage.clickNewApp();
	}

	@Then("^new app page is displayed$")
	public void new_app_page_is_displayed() throws Throwable {
		newAppPage = new NewAppPage(driver);
		Assert.assertEquals("New app", newAppPage.getPageName());
	}

	@When("^user enter all the valid field values and click Create App$")
	public void user_enter_all_the_valid_field_values_and_click_Create_App()
			throws Throwable {

		newAppPage = new NewAppPage(driver);
		newAppPage.setPlateform(palteformbefore);
		newAppPage.setStoreID(storeid);
		newAppPage.setName(name);
		newAppPage.setOrientation(orientationbefore);
		newAppPage.clickCreateApp();

	}

	@Then("^newly created app page is displayed$")
	public void newly_created_app_page_is_displayed() throws Throwable {
		appDetailsPage = new AppDetailsPage(driver);

		Assert.assertEquals(name, appDetailsPage.getAppName());
	}

	@Then("^new app should be displayed$")
	public void new_app_should_be_displayed() throws Throwable {
		listingAppsPage = new ListingAppsPage(driver);

		Assert.assertEquals(name, listingAppsPage.getListedApp(name));
	}

	@When("^click on recent app$")
	public void click_on_recent_app() throws Throwable {
		listingAppsPage = new ListingAppsPage(driver);
		listingAppsPage.clickListedApp(name);
	}

	@Then("^edit app page is displayed$")
	public void edit_app_page_is_displayed() throws Throwable {
		appDetailsPage = new AppDetailsPage(driver);
		Assert.assertEquals("Editing: "+name, appDetailsPage.getAppName());
	}

	@When("^click on edit$")
	public void click_on_edit() throws Throwable {
		appDetailsPage = new AppDetailsPage(driver);
		appDetailsPage.clickEdit();
	}

	@When("^enter new field$")
	public void enter_new_field() throws Throwable {

		newAppPage = new NewAppPage(driver);
		newAppPage.setPlateform(palteformafter);
		newAppPage.setStoreID(storeidafer);
		newAppPage.setName(nameafter);
		newAppPage.setOrientation(orientationafter);

	}

	@When("^click Update app$")
	public void click_Update_app() throws Throwable {
		newAppPage = new NewAppPage(driver);
		newAppPage.clickCreateApp();
	}

	@Then("^app page is displayed$")
	public void app_page_is_displayed() throws Throwable {
		appDetailsPage = new AppDetailsPage(driver);
		Assert.assertEquals(nameafter, appDetailsPage.getAppName());
	}

	@Then("^new name is displayed$")
	public void new_name_is_displayed() throws Throwable {
		appDetailsPage = new AppDetailsPage(driver);
		Assert.assertEquals(nameafter, appDetailsPage.getAppName());
	}

	@When("^click on Back button$")
	public void click_on_Back_button() throws Throwable {
		appDetailsPage = new AppDetailsPage(driver);
		appDetailsPage.clickBack();
	}

	@Then("^App listing page is displayed$")
	public void app_listing_page_is_displayed() throws Throwable {
		listingAppsPage = new ListingAppsPage(driver);
		Assert.assertEquals("Listing Apps", listingAppsPage.getPageName());
	}

	@Then("^app name is updated$")
	public void app_name_is_updated() throws Throwable {
		listingAppsPage = new ListingAppsPage(driver);

		Assert.assertEquals(nameafter, listingAppsPage.getListedApp(name));
	}

}
