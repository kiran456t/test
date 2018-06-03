package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","E:\\Automation\\Automations_pro\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
String str=	driver.getCurrentUrl();
	System.out.println(str);
	Thread.sleep(3000);
WebElement Amzon_music=	driver.findElement(By.xpath("//*[text()='Amazon Music']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(Amzon_music).perform();
	WebElement prime_music=driver.findElement(By.xpath("//*[text()='Prime Music']"));
	
	actions.click(prime_music).perform();
	
	//Thread.sleep(2000);
	//actions.clickAndHold(Dep).build().perform();
	//WebElement prime_vid=driver.findElement(By.xpath("//*[text()='Prime Video']"));
	//actions.moveToElement(prime_vid).perform();
	
	
}
}
