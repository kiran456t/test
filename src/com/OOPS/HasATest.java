package com.OOPS;

class HasOne{
	public void dispaly() {
		System.out.println("selenium");
	}
	
	
}

class HasTwo{
	public void hello() {
		
		HasOne h1=new HasOne();
		h1.dispaly();
		System.out.println("welcome");
	}
	
}

public class HasATest {
	
	
public static void main(String[] args) {
	
	HasTwo h2=new HasTwo();
	h2.hello();
	
}
}
