package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("BS");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("AS");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("BC");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("AC");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("BT");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("AT");
	}
	/*@BeforeGroups
	public void beforegroup() {
		System.out.println("BG");
	}
	@AfterGroups
	public void aftergroup() {
		System.out.println("AG");
	}
*/	@BeforeMethod
	public void beforemethod() {
		System.out.println("BM");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("AM");
	}
  @Test
  public void f1() {
	  System.out.println("TC1");
  }
  @Test
  public void f2() {
	  System.out.println("TC2");
  }
  
}
