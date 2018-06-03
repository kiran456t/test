package com.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class InvocationCountTest {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("BS");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("AS");
	}
	
  @Test(invocationCount=10)
  public void f() {
	  System.out.println("gmail Test");
  }
}
