package com.Crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "E:\\Automation\\Automations_pro\\Drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

}
