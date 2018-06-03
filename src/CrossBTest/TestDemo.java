package CrossBTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class TestDemo {

	WebDriver driver;
  @Test
  @Parameters("browser")
  public void verifytest(String browserName) {
	  if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		System.out.println("chromeBrowser");
	}
	  else if (browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Automations_pro\\Drivers\\geckodriver.exe");
		driver =new FirefoxDriver();
		System.out.println("firefoxBrowser");
		
	}else if (browserName.equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.ie.driver", "E:\\Automation\\Automations_pro\\Drivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		System.out.println("IEBrowser");
		
	}
	else if (browserName.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", "E:\\Automation\\Automations_pro\\Drivers\\MicrosoftWebDriver.exe");
		WebDriver driver=new EdgeDriver();
		System.out.println("EdgeBrowser");
	}
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  System.out.println(driver.getTitle());
	  
		
  }
}
