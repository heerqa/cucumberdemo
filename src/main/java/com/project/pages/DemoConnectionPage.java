package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoConnectionPage {

	WebDriver driver;
	
	public DemoConnectionPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
					
	}
	
	@FindBy(id="connection_live_false")
	WebElement chatbooster_live_false;
	
	
	@FindBy(id="connection_live_true")
	WebElement chatbooster_live_true;
	
	@FindBy(id="connection_appId")
	WebElement chatbooster_appId;
	
	public void setChatbooster_appId(String strappid){
		chatbooster_appId.clear();
		chatbooster_appId.sendKeys(strappid);
	}
	
	public String getChatbooster_appId(){
		return chatbooster_appId.getAttribute("value");
	}
	
	@FindBy(id="connection_userId")
	WebElement chatbooster_userId;
	
	public void setChatbooster_userId(String strappid){
		chatbooster_userId.clear();
		chatbooster_userId.sendKeys(strappid);
	}
	
	public String getChatbooster_userId(){
		return chatbooster_userId.getAttribute("value");
	}
	
	@FindBy(id="connection_AppSignature")
	WebElement chatbooster_AppSignature;
	
	public void setChatbooster_AppSignature(String strappid){
		chatbooster_AppSignature.clear();
		chatbooster_AppSignature.sendKeys(strappid);
	}
	
	public String getChatbooster_AppSignature(){
		return chatbooster_AppSignature.getAttribute("value");
	}
	
	@FindBy(id="connection_userSignature")
	WebElement chatbooster_userSignature;
	
	public void setChatbooster_userSignature(String strappid){
		chatbooster_userSignature.clear();
		chatbooster_userSignature.sendKeys(strappid);
	}
	
	public String getChatbooster_userSignature(){
		return chatbooster_userSignature.getAttribute("value");
	}
	
	@FindBy(name="button")
	WebElement updateChartBoostbtn;
	
	public void clickUpdateChartBoostbtn(){
		updateChartBoostbtn.click();
	}
	
	@FindBy(id="connection_app_id")
	WebElement applift_id;
	
	public void setApplift_id(String strappid){
		applift_id.clear();
		applift_id.sendKeys(strappid);
	}
	
	public String getApplift_id(){
		return applift_id.getAttribute("value");
	}
	
	@FindBy(id="connection_account_auth_token")
	WebElement applift_account_auth_token;
	
	public void setApplift_account_auth_token(String strappid){
		applift_account_auth_token.clear();
		applift_account_auth_token.sendKeys(strappid);
	}
	
	public String getApplift_account_auth_token(){
		return applift_account_auth_token.getAttribute("value");
	}
	
	@FindBy(id="connection_secret")
	WebElement applift_secret;
	
	public void setApplift_secret(String strappid){
		applift_secret.clear();
		applift_secret.sendKeys(strappid);
	}
	
	public String getApplift_secret(){
		return applift_secret.getAttribute("value");
	}
	
	@FindBy(xpath="(//button[@name='button'])[2]")
	WebElement updateAppLift;
	
	public void clickUpdateAppLift(){
		updateAppLift.click();
	}
	
	
	@FindBy(id="connection_apiKey")
	WebElement flurry_apiKey;
	
	
	public void setFlurry_apiKey(String strappid){
		flurry_apiKey.clear();
		flurry_apiKey.sendKeys(strappid);
	}
	
	public String getFlurry_apiKey(){
		return flurry_apiKey.getAttribute("value");
	}
	
	@FindBy(id="connection_apiAccessCode")
	WebElement flurry_apiAccessCode;
	
	public void setFlurry_apiAccessCode(String strappid){
		flurry_apiAccessCode.clear();
		flurry_apiAccessCode.sendKeys(strappid);
	}
	
	public String getFlurry_apiAccessCode(){
		return flurry_apiAccessCode.getAttribute("value");
	}
	
	@FindBy(id="connection_space")
	WebElement flurry_space;
	
	public void setFlurry_space(String strappid){
		flurry_space.clear();
		flurry_space.sendKeys(strappid);
	}
	
	public String getFlurry_space(){
		return flurry_space.getAttribute("value");
	}
		
	
	@FindBy(xpath="(//button[@name='button'])[3]")
	WebElement updateFlurrybtn;
	
	public void clickUpdateFlurrybtn(){
		updateFlurrybtn.click();
	}
	
	@FindBy(xpath="(//input[@id='connection_app_id'])[2]")
	WebElement vungle_appId;
	
	public void setVungle_appId(String strappid){
		vungle_appId.clear();
		vungle_appId.sendKeys(strappid);
	}
	
	public String getVungle_appId(){
		return vungle_appId.getAttribute("value");
	}
	
	
	@FindBy(id="connection_reporting_app_id")
	WebElement vungle_reporting_app_id;
	
	public void setVungle_apiAccessCode(String strappid){
		vungle_reporting_app_id.clear();
		vungle_reporting_app_id.sendKeys(strappid);
	}
	
	public String getVungle_apiAccessCode(){
		return vungle_reporting_app_id.getAttribute("value");
	}
	
	
	@FindBy(id="connection_key")
	WebElement vungle_key;
	
	public void setVungle_key(String strappid){
		vungle_key.clear();
		vungle_key.sendKeys(strappid);
	}
	
	public String getVungle_key(){
		return vungle_key.getAttribute("value");
	}
	
	@FindBy(xpath="(//button[@name='button'])[4]")
	WebElement vungle_updatebtn; 
	
	public void clickVungle_updatebtn(){
		vungle_updatebtn.click();
	}
	
	@FindBy(id="connection_token")
	WebElement playhaven_token;
	
	public void setPlayhaven_token(String strappid){
		playhaven_token.clear();
		playhaven_token.sendKeys(strappid);
	}
	
	public String getPlayhaven_token(){
		return playhaven_token.getAttribute("value");
	}
	
	@FindBy(xpath="(//input[@id='connection_secret'])[2]")
	WebElement playhaven_secret;
	
	public void setPlayhaven_secret(String strappid){
		playhaven_secret.clear();
		playhaven_secret.sendKeys(strappid);
	}
	
	public String getPlayhaven_secret(){
		return playhaven_secret.getAttribute("value");
	}
	
	@FindBy(id="connection_place")
	WebElement playhaven_place;
	
	public void setPlayhaven_place(String strappid){
		playhaven_place.clear();
		playhaven_place.sendKeys(strappid);
	}
	
	public String getPlayhaven_place(){
		return playhaven_place.getAttribute("value");
	}
	
	
	@FindBy(xpath="(//button[@name='button'])[5]")
	WebElement playhaven_updatebtn;
	
	public void clickPlayhaven_updatebtn(){
		playhaven_updatebtn.click();
	}
	
	@FindBy(id="connection_AppId")
	WebElement nativex_appId;
	
	public void setNativex_appId(String strappid){
		nativex_appId.clear();
		nativex_appId.sendKeys(strappid);
	}
	
	public String getNativex_appId(){
		return nativex_appId.getAttribute("value");
	}
	
	@FindBy(xpath="(//button[@name='button'])[6]")
	WebElement nativex_updatebtn;
	
	public void clickNativex_updatebtn(){
		nativex_updatebtn.click();
	}
	
	@FindBy(id="connection_pid")
	WebElement appnext_pid;
	
	public void setAppnext_pid(String strappid){
		appnext_pid.clear();
		appnext_pid.sendKeys(strappid);
	}
	
	public String getAppnext_pid(){
		return appnext_pid.getAttribute("value");
	}
	
	
	@FindBy(xpath="(//button[@name='button'])[7]")
	WebElement appnext_updatebtn;
	
	public void clickAppnext_updatebtn(){
		appnext_updatebtn.click();
	}
	
	
}
