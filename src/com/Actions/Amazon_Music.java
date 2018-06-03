package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Music {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement Amazon_alex=driver.findElement(By.xpath("//*[text()='Echo & Alexa']"));
	Actions actions=new Actions(driver);
	actions.moveToElement(Amazon_alex).build().perform();

    WebElement prime_echo=	driver.findElement(By.xpath("//*[text()='Amazon Echo']"));
    actions.click(prime_echo).build().perform();
}
}
