package com.AutomationTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgDemo {
	WebDriver driver;
@BeforeSuite
public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.manage().deleteAllCookies();
	
	
}
/*@AfterSuite
public void closedriver() {

	
	driver.quit();
}
*/
@Test(priority=0)
public void gmail() {
	driver.get("https://www.gmail.com");
	System.out.println("gmail");
}

@Test(priority=1)
public void fbtest() {
	driver.get("https://www.facebook.com");
	System.out.println("facebook");
}
@Test(priority=2)
public void flipkarttest() {
	driver.get("https://flipkart.com");
	System.out.println("flipkart");
	
}

}
