package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com");
		driver.findElement(By.linkText("Autocomplete")).click();
		
	List<WebElement> frames=	driver.findElements(By.tagName("iframe"));
	System.out.println("No of freams:  "+frames.size());
	
	int count=0;
	for(WebElement frame:frames) {
		count++;
		System.out.println("id is: "+frame.getAttribute("id"));
		System.out.println("name is: "+frame.getAttribute("name"));
		System.out.println("classname is: "+frame.getAttribute("class"));
		System.out.println("src is:  "+frame.getAttribute("src"));
		
		if (count==5) {
			break;
			
		}
	}
	driver.switchTo().frame(0);
	driver.findElement(By.id("tags")).sendKeys("java");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Draggable")).click();
	Thread.sleep(3000);
	driver.switchTo().frame(0);
    WebElement draggable=	driver.findElement(By.id("draggable"));
    Actions actions=new Actions(driver);
    actions.dragAndDropBy(draggable,  150, 150).perform();
    driver.switchTo().defaultContent();
    driver.findElement(By.linkText("Droppable")).click();
    driver.switchTo().frame(0);
   WebElement draggableOne= driver.findElement(By.id("draggable"));
   WebElement dropableOne= driver.findElement(By.id("droppable"));
   
   actions.dragAndDrop(draggableOne, dropableOne).perform();
   driver.switchTo().defaultContent();
   
   driver.close();
    

	}

}
