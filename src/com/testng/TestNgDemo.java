package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgDemo {
	WebDriver driver;
	@BeforeSuite
	public void beforesuite() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	@AfterSuite
	public void aftersuite() {
	driver.quit();

	}
  @Test(priority=0)
  public void flipkart() {
  
  driver.get("https://www.flipkart.com/");
  System.out.println("flipkart");
  }
  @Test(priority=2)
  public void facebook() {
  
  driver.get("https://www.facebook.com/");
  System.out.println("facebook");
  }
  @Test(priority=1)
  public void gmailtest() {
  
  driver.get("https://www.gmail.com/");
  System.out.println("gmail");
  }
}
