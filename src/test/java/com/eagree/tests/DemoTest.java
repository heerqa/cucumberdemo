package com.eagree.tests;

import java.util.concurrent.TimeUnit;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.project.common.Browser;
import com.project.common.EnvSetUP;
import com.project.pages.CompanyProfile;
import com.project.pages.HomePage;
import com.project.pages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoTest {

	WebDriver driver;
	LoginPage loginPage;
	HomePage homepage;
	CompanyProfile companyProfile;

	@Before
	public void setUp() throws InterruptedException {
		driver = new FirefoxDriver();
		 
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.get(EnvSetUP.getInstance().getproperties("baseurl"));
		Thread.sleep(10000);

	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("^User is logged in$")
	public void user_is_logged_in() throws Throwable {
		
		String strEmail=EnvSetUP.getInstance().getproperties("email");
		String strPass=EnvSetUP.getInstance().getproperties("password");	

		loginPage= new LoginPage(driver);
		loginPage.login(strEmail, strPass);

	}

	@When("^user click on Company link$")
	public void user_click_on_Company_link() throws Throwable {
		homepage= new HomePage(driver);
		homepage.clickCompany();

	}

	@When("^user change the compnay name and click save button$")
	public void user_change_the_compnay_name_and_click_save_button()
			throws Throwable {
		companyProfile= new CompanyProfile(driver);
		companyProfile.editCompName();

	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		homepage= new HomePage(driver);
		Assert.assertTrue(homepage.getSuccessMsg().contains(
				"Company was updated successfully"));
	}

}
