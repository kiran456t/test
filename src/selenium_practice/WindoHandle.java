package selenium_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindoHandle {
	public static void main(String[] args) throws InterruptedException {
     	System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		//driver.findElement(By.id("sb_form_q")).sendKeys("java");
		Thread.sleep(3000);
	    WebElement maps=driver.findElement(By.linkText("Maps"));
		Actions actions=new Actions(driver);
		actions.contextClick(maps).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
		
		
	String	bing=driver.getWindowHandle();
	Thread.sleep(5000);
	/*Set<String> windows= driver.getWindowHandles();
	
	for(String window:windows) {
	
		if (window.equalsIgnoreCase(bing)) {
			System.out.println("already we are in the focus");
			
		}else {
			System.out.println("now switch to window");
			driver.switchTo().window(window);
		}
		
		
	}
String seconwindow=	driver.getWindowHandle();
driver.findElement(By.id("maps_sb")).sendKeys("Rameshsoft",Keys.ENTER);
*/
	
Set<String>	windows= driver.getWindowHandles();

List<String> list=new ArrayList(windows);
String mapwindow=list.get(1);
driver.switchTo().window(mapwindow);
String seconwindow=	driver.getWindowHandle();
driver.findElement(By.id("maps_sb")).sendKeys("Rameshsoft");




	}

}
