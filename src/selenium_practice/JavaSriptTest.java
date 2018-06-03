package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSriptTest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
	//driver.manage().deleteAllCookies();
	driver.get("https://www.gmail.com/");
	
/*WebElement usn=	driver.findElement(By.id("identifierId"));

WebElement nxt= driver.findElement(By.id("identifierNext"));

Thread.sleep(3000);

JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].value='tkiran979'", usn);
js.executeScript("arguments[0].click();",nxt);
*/	
JavascriptExecutor 	js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('identifierId').value='tkiran979@gmail.com'");
js.executeScript("document.getElementById('identifierNext').click();");
	
	}
}
