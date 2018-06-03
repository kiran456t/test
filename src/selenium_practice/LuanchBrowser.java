package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LuanchBrowser {
	
	WebDriver driver;
	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Automations_pro\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
		}
		else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "E:\\Automation\\Automations_pro\\Drivers\\IEDriverServer.exe");
		    driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
	
		}	 
		
	}
	public void closeBrowser() {
		if (driver!=null) {
			driver.close();
		}
		
		
	}

	public static void main(String[] args) {
		
		LuanchBrowser open=new LuanchBrowser();
		open.openBrowser("firefox");
		open.closeBrowser();
		
		
	}
}
