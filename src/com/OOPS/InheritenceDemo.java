package com.OOPS;

class CommanServices{
	
		public void login() {
				
				System.out.println("login");
				
			}
			public void logout() {
				
				System.out.println("login");
				
			}
				}

class ModuleOne extends CommanServices
{
	
	public void electronic() {
		System.out.println("electrons");
	}

	
}
class ModuleTwo extends CommanServices 
{
	public void men() {
		System.out.println("men");
	}

	public void women() {
		System.out.println("women");
	}

	
}

public class InheritenceDemo {
public static void main(String[] args) {
	
	//1.create parent class objecet
	CommanServices c=new CommanServices();	
	c.login();
	c.logout();
	//c.men();
	
	//2.create child class Object
	ModuleOne m1=new ModuleOne();
	m1.login();
	m1.logout();
	m1.electronic();
	
	//3.by using parent class refference we can create  child class  object
	CommanServices c1=new ModuleOne();
	c1.login();
	c1.logout();
	
	
	 //ModuleOne m2=new CommanServices();
	 
	 
	
}
}
