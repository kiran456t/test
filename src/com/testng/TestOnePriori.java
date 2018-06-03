package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestOnePriori {
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

  @Test(priority=2,enabled=true)
  public void amain() {
	  driver.get("http://www.google.com/");
	  System.out.println("google");
  }

  @Test(priority=1,enabled=false)
  public void gmain() {
	  driver.get("http://www.facebook.com/");
	  System.out.println("facebook");
  }
  
  @Test(priority=0)
  public void bmain() {
	  driver.get("http://www.flipkart.com/");
	  System.out.println("flipkart");
  }

}
