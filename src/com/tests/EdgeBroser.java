package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBroser {
public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver", "E:\\Automation\\Automations_pro\\Drivers\\MicrosoftWebDriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com/");
	
}
}
