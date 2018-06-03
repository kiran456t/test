package com.corejava_ControlStmt;

public class SwitchCaseDemo1 {
public static void main(String[] args) {
	
	
	String browser="firefox";
	switch(browser) {
	case "ie":
		System.out.println("ie browser");
		//break;
	case "chrome":
		System.out.println("chrome browser");
		//break;
	case "firefox":
		System.out.println("firefoxdriver");
		//break;
		default :
			System.out.println("pass the proper parameter launch the browser");
			//break;
	}
	System.out.println("end of the switch");
  System.out.println("nrmal statement");
}
}
