package com.corejava_ControlStmt;

import java.util.ArrayList;
import java.util.List;

public class ForeachloopTest {
public static void main(String[] args) {
	
	List<String> l=new ArrayList();
	l.add("hello");
	l.add("kiran");
	l.add("java");
	l.add("selenium");
	for(String s:l) {
		System.out.println(s);
	}
 	
	
}
}
