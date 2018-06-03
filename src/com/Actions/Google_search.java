package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_search {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	WebElement google_search=driver.findElement(By.id("lst-ib"));
	google_search.sendKeys("selenium by ramesh",Keys.ENTER);
	

	WebElement link=  driver.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati"));
	System.out.println("print the link"+link);
	Actions actions=new Actions(driver);
	//Thread.sleep(3000);
	actions.contextClick(link).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.RETURN).perform();
	
	
	
		
		
	}

}
