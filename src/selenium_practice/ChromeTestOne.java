package selenium_practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTestOne {
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		//driver.navigate().to("https://www.google.com/");
		//driver.navigate().to(new URL("https://www.google.com/"));
	JavascriptExecutor 	js=(JavascriptExecutor)driver;
	//js.executeScript(arg0, arg1)	
	//String url="https://www.google.com/";
	//String script1 = "window.location = \'http://www.google.com'";
	String script1="window.location=\'https://google.com'";
	js.executeScript(script1);
		
	}

}
