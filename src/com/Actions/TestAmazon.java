package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAmazon {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement Dep=driver.findElement(By.xpath("//*[text()='Departments']"));
		Actions actions=new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(Dep).build().perform();
		WebElement Prime_vid=driver.findElement(By.xpath("//*[text()='Prime Video']"));
		actions.moveToElement(Prime_vid).perform();
		driver.findElement(By.xpath("//*[text()='All Videos']")).click();
		//actions.click(All_videos).build().perform();
		
		
		
	}

}
