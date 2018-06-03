package com.Crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Automations_pro\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.freecrm.com/");
	
WebElement un=	driver.findElement(By.name("username"));
un.clear();
un.sendKeys("kiran123");
WebElement pwd=driver.findElement(By.name("password"));
pwd.clear();
pwd.sendKeys("kiran123");
Thread.sleep(3000);
WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
login.click();


driver.switchTo().frame("mainpanel");
String date="18-March-2018";
String dateArry[]=date.split("-");
String day=dateArry[0];
String month=dateArry[1];
String year=dateArry[2];

Select select=  new Select(driver.findElement(By.name("slctMonth")));
	select.selectByVisibleText(month);
	
	Select select1=new Select(driver.findElement(By.name("slctYear")));
select1.selectByVisibleText(year);

////*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]

String beforeXpath="//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[";
String afterXpath="]/td[";

  final int totalNofdays=7;
  
  for(int rowNum=2;rowNum<=7;rowNum++) {
	  
	  for(int colNum=1;colNum<=totalNofdays;colNum++) {
		  
		  
		  
	String dayVal=	driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
	System.out.println("Day values: "+dayVal);
	
	 
	  }
  }
}
}
