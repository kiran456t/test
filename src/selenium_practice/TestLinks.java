package selenium_practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.id("lst-ib")).sendKeys("selenium by ramesh");
	
	Actions actions=new Actions(driver);
	actions.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	
	WebElement elem= driver.findElement(By.linkText("Selenium : Selenium WebDriver By Ramesh Anapati"));
	elem.click();
	Thread.sleep(2000);
List<WebElement>  links=driver.findElements(By.tagName("a"));
	
int enabledCount=0;
int disabledCount=0;

      Iterator<WebElement>  iter=links.iterator();
     while(iter.hasNext()) {
    	 WebElement link=iter.next();
    	 if (link.isDisplayed()&&link.isEnabled()) {
			enabledCount++;
		}
    	 else {
    		 disabledCount++;
    	 }
    	 System.out.println("Enabled links are:"+enabledCount);
    	 System.out.println("Disabled links are:"+disabledCount);
     }
/*for(WebElement link:links) {
	
	if (link.isDisplayed()&&link.isEnabled()) {
		enabledCount++;
	}
	else {
		disabledCount++;
	}
	System.out.println("Enabled links are:"+enabledCount);
	System.out.println("Disabled links are:"+disabledCount);
}
*/
	}
	
	
}
