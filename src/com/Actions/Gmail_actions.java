package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail_actions {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com/");
		
	WebElement un=	driver.findElement(By.id("identifierId"));
		/*Actions actions=new Actions(driver);
		actions.click(un).sendKeys("tkiran979").build().perform();
		
	WebElement nxt=	driver.findElement(By.id("identifierNext"));
		//actions.click(nxt).perform();
		actions.sendKeys(nxt,Keys.ENTER).perform();
		
		*/
		
	/*String pagesourcr=	driver.getPageSource();
		System.out.println(pagesourcr);
	*/	
	}

}
