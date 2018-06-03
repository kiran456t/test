package com.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DependsOnMethodsDemo {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("BS");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("AS");
	}
	
  @Test
  public void bmain() {
	  System.out.println("B-main");
  }
  @Test(dependsOnMethods="bmain")
  public void cmain() {
	  System.out.println("a-main");
  }
  @Test
  public void gmain() {
	  System.out.println("g-main");
  }
  
}
