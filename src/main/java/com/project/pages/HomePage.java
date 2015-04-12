package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	@FindBy(linkText = "Company")
	WebElement company;

	@FindBy(css = "div.alert.alert-info")
	WebElement successMsg;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCompany() {
		company.click();
	}

	public String getSuccessMsg() {

		return successMsg.getText();

	}

}
