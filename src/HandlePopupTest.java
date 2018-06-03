import java.util.HashMap;
import java.util.Map;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class HandlePopupTest {
 
 @org.testng.annotations.Test
 public  void test() throws Exception {
  
                // Create object of HashMap Class
  Map<String, Object> prefs = new HashMap<String, Object>();
              
                // Set the notification setting it will override the default setting
  prefs.put("profile.default_content_setting_values.notifications", 2);
 
                // Create object of ChromeOption class
  ChromeOptions options = new ChromeOptions();
 
                // Set the experimental option
  options.setExperimentalOption("prefs", prefs);
 
                // pass the options object in Chrome driver
  System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Automations_pro\\Drivers\\chromedriver.exe");
  WebDriver driver = new ChromeDriver(options);
  driver.get("https://www.facebook.com/");
  driver.manage().window().maximize();
  
  
  
 }
 
}
