package com.Walmar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWallM {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com/account/");
		Thread.sleep(5000);
	/*WebElement signin=driver.findElement(By.xpath("//span[@class='styles__greeting___3mnE1']"));
	signin.click();
*/	Thread.sleep(5000);
	
	WebElement usn=	driver.findElement(By.name("email"));
		usn.sendKeys("ss9944777@gmail.com");
	WebElement pwd=	driver.findElement(By.name("password"));
		pwd.sendKeys("kiran123");
		Thread.sleep(5000);
WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
	}

}
