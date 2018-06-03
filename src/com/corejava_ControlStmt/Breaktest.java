package com.corejava_ControlStmt;

public class Breaktest {
public static void main(String[] args) {
	
	
	for(int i=0;i<=10;i++) {
		
		if (i==3) {
		     continue;
			
		}
		System.out.println(i+"....hello");
	}
	System.out.println("out of for loop");
}
}
