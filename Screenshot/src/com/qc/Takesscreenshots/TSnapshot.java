package com.qc.Takesscreenshots;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Utility.Snapshots;

public class TSnapshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Automation_class_documents\\Selenium Documents\\Downloads\\Drivers\\chromedriver_win32_V87\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	    driver.get("file://F:/Automation_class_documents/Selenium%20Documents/Downloads/Offline_Website/index.html");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	    
	    Snapshots.Takingsanpshots(driver,"BrowserInvoke");
	    
	    driver.findElement(By.id("submit")).click();
	    Thread.sleep(2000);
	      
	    Snapshots.Takingsanpshots(driver,"Loginpage");
	    
	   
	 
      driver.quit();
	}

}
