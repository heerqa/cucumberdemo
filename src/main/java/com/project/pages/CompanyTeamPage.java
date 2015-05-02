package com.project.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyTeamPage {
	
	WebDriver driver;
	
	public CompanyTeamPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	 private boolean acceptNextAlert = true;
	@FindBy(linkText="New User")
	WebElement newUserbtn;

	@FindBy(css=".fa.fa-times")
	WebElement closebtn;

	public void clickNewUserBtn() throws InterruptedException{

		newUserbtn.click();
	}
		
	public String getLatestUserName(){
		List<WebElement> closebutton=driver.findElements(By.cssSelector(".fa.fa-times"));
		int count=closebutton.size();
		return driver.findElement(By.xpath("//ul["+count+"]/li")).getText();
				
		
	}
	
	public String getLatestRole(){
		List<WebElement> closebutton=driver.findElements(By.cssSelector(".fa.fa-times"));
		int count=closebutton.size();
		return driver.findElement(By.xpath("//ul["+count+"]/li/small")).getText();
				
		
	}
	
	public void clickRemoveBtn(){
		List<WebElement> closebutton=driver.findElements(By.cssSelector(".fa.fa-times"));
		int count=closebutton.size();
		driver.findElement(By.xpath("//ul["+count+"]/li/a/i")).click();
		//closebtn.click();
		Assert.assertTrue(closeAlertAndGetItsText().matches("^Are you sure[\\s\\S]$"));	
	}
	
	private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
}
