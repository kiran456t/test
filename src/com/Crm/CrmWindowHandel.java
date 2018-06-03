package com.Crm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrmWindowHandel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/");
	
		driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
	WebElement usn=	driver.findElement(By.name("username"));
		usn.clear();
		usn.sendKeys("kiran123");
WebElement pwd=	driver.findElement(By.name("password"));	
		pwd.clear();
		pwd.sendKeys("kiran123");
Thread.sleep(3000);
WebElement	login=	driver.findElement(By.xpath("//input[@type='submit']"));
		login.click();
		
		
	}

}
