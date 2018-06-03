package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentsOnMethodsTestNg {

	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods= {"test1"})
	public void test2() {
		System.out.println("test2 pass");
	}
	
	@Test(dependsOnMethods= {"test1","test2"})
	public void test3() {
		System.out.println("test3 pass");
		
	}
	
	@Test
	public void test4() {
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods= {"test4"})
	public void test5() {
		//Assert.assertTrue(false);
		System.out.println("test5 fail");
		
	}
	
}
