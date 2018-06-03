package com.testng;

import org.testng.annotations.Test;

public class DependsOnGroup {

	@Test(groups= {"group1"})
	public void test1() {
		
		System.out.println("welcome to rameshsoft");
	}
	
	@Test(dependsOnGroups= {"groups1"})
	public void test2() {
		
		System.out.println("master in java with selenium");
	}
	
	@Test(groups= {"group2"})
	public void test3() {
		
		System.out.println("At hyderabad");
	}
	
}
