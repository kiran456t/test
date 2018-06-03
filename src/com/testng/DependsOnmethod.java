package com.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DependsOnmethod {

	
	@BeforeSuite
public void dmain() {
	System.out.println("dmain");
}
	
	@AfterSuite
	public void cmain() {
		System.out.println("cmain");
	}
	
	@Test
	public void bmain() {
		System.out.println("dmain");
	}
	
@Test(dependsOnMethods="bmain")
public void amain() {
		System.out.println("amain");
	}

@Test
public void gmain() {
	System.out.println("gmain");
}
	
}
