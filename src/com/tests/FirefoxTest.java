package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Automations_pro\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		
		
		
		
	}

}
