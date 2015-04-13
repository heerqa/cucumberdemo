package com.project.common;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class CommonMethods {
	
	public static  WebDriver driver;
	


	/*public CommonMethods(WebDriver e) {
        this.driver = e;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }*/

    
	

	public static boolean ifElementPresent(By by)throws Throwable{
        try {
            driver.findElement(by);
            return true;
        }
        catch (Throwable t) {
            return false;
        
        }
    }
	
	public static void clickonbutton(String classname, String buttonname) throws Throwable{
		waitForElementToLoad(By.className(classname), 5);
		  for (int i = 0; i < driver.findElements(By.className(classname)).size(); i++) {
				if (driver.findElements(By.className(classname)).get(i).getText().contains(buttonname)) {
					driver.findElements(By.className(classname)).get(i).click();
					break;
				}
			}
		    
		
	}
	
	public void waitForElementToLoadandClick(By by, int counter) throws InterruptedException, Throwable {
		int timeCounter = 1;
		boolean timeout = true;
		do {
		    Thread.sleep(2000);
		    timeCounter++;
		   System.out.println("Page is still loading. The couner is = "+timeCounter);
		    if (ifElementPresent(by)|| timeCounter > counter) {
		    	 driver.findElement(by).click();
		        timeout = false;
		    }
		}
		while (timeout);
	}
	
	public static void waitForElementToLoad(By by, int counter) throws InterruptedException, Throwable {
		int timeCounter = 1;
		boolean timeout = true;
		do {
		    Thread.sleep(4000);
		    timeCounter++;
		   System.out.println("Page is still loading. The couner is = "+timeCounter);
		    if (ifElementPresent(by)|| timeCounter > counter) {
		    
		        timeout = false;
		    }
		}
		while (timeout);
	}
	
	public static void waitForElementToUnLoad(By by, int counter) throws InterruptedException, Throwable {
		int timeCounter = 1;
		boolean timeout = true;
		do {
		    Thread.sleep(4000);
		    timeCounter++;
		   System.out.println("Page is still loading. The couner is = "+timeCounter);
		    if (!ifElementPresent(by)|| timeCounter > counter) {
		    
		        timeout = false;
		    }
		}
		while (timeout);
	}
	
	public static void waitForElementToLoadandSendKeys(By by, String sendvlaues, int counter) throws InterruptedException, Throwable {
		int timeCounter = 1;
		boolean timeout = true;
		do {
		    Thread.sleep(2000);
		    timeCounter++;
		   System.out.println("Page is still loading. The couner is = "+timeCounter);
		    if (ifElementPresent(by)|| timeCounter > counter) {
		    	driver.findElement(by).clear();
		    	 driver.findElement(by).sendKeys(sendvlaues);
		        timeout = false;
		    }
		}
		while (timeout);
	}
	
	public static String uniqueval() throws Throwable{
		
		String date =new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		return date;
	}

	
	
	
	public static void getScreenShot(String screenshotname) throws Throwable{
		File scrFile = ((TakesScreenshot)BrowserUtils.getInstance().getDriver()).getScreenshotAs(OutputType.FILE);
		String path=FileUtils.getUserDir();
		System.out.println(path);
	    org.apache.commons.io.FileUtils.copyFile(scrFile, new File(path+"/target/ScreensonError/"+screenshotname+".png"));
	 
				
	}
	
	public static String setupDriver(){
	   	
    	String browser =EnvSetUP.getInstance().getproperties("browser") ;
    	
    	if (browser.equals("firefox")) {
    		BrowserUtils.getInstance().setDriver(Browser.Browsers.FIREFOX.browser());
			//return "firefox";
		}
    	

    	if (browser.equals("chrome")) {
    		BrowserUtils.getInstance().setDriver(Browser.Browsers.CHROME.browser());
    		//return "chrome";
		}
        
    	if (browser.equals("ie")) {
    		BrowserUtils.getInstance().setDriver(Browser.Browsers.IE.browser());
    		//return "ie";
		}
    	
    	if (browser.equals("phantomjs")) {
    		BrowserUtils.getInstance().setDriver(Browser.Browsers.PHANTOMJS.browser());
    		//return "phantomjs";
		}
    	
    	if (browser.equals("safari")) {
    		BrowserUtils.getInstance().setDriver(Browser.Browsers.SAFARI.browser());
    		//return "phantomjs";
		}
		return browser;
        
	} 

}
