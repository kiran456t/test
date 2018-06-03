package selenium_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDDTest {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
    Select select=new Select(driver.findElement(By.id("day")));
	List<WebElement> dds=select.getOptions();
	int lastIndex=dds.size()-1;	
	WebElement	lastelement=dds.get(lastIndex);
		lastelement.click();
	Set<WebElement>	set=new HashSet();
		System.out.println(set);
	
		Set<WebElement> elems=new HashSet();
		List<WebElement> removeduplicateDropdown=new ArrayList();
		for(WebElement  ele:dds) {
			boolean b=elems.add(ele);
			
			if (b) {
				System.out.println("It is not a duplicate");
			}
			else {
				System.out.println("It is duplicate"+ele);
				removeduplicateDropdown.add(ele);
				
			}
		}
		
		System.out.println("Remove duplicates are :"+removeduplicateDropdown);
	}

}
