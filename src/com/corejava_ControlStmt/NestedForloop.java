package com.corejava_ControlStmt;

public class NestedForloop {
public static void main(String[] args) {
	
	l1:
	for(int i=0;i<=3;i++) {
		
		l2:
		for (int j = 0; j <=3; j++) {
			
			if (i==2&&j==2) {
				break l1;
			}
			System.out.println(i+"....."+j);
		}
		
	}
	
}
}
