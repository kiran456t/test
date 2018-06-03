import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com");
	WebElement 	usn=driver.findElement(By.name("username"));
    WebElement pwd=	driver.findElement(By.name("password"));
    WebElement login= driver.findElement(By.xpath("//input[@type='submit']"));
		
	JavascriptExecutor	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='kiran123'", usn);
	js.executeScript("arguments[0].value='kiran123'",pwd);
	js.executeScript("arguments[0].click()",login);
		
	}

}
