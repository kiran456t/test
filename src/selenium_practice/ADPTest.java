package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ADPTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adp.com/");
		 
	List<WebElement> adp=driver.findElements(By.xpath("//*[contains(text(),'ADP') or contains(text(),'adp')]"));
		System.out.println("Adp text are"+adp.size());
		
		
	}

}
