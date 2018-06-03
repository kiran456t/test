package com.OOPS;

class PojoDemo{
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
}

public class PojoTest {
 
	public static void main(String[] args) {
		
		PojoDemo p=new PojoDemo();
		p.setEmpId(95);
		
	int id=p.getEmpId();
		System.out.println("id is:  "+id);
		
		p.setEmpName("kiran");
	String name	=p.getEmpName();
	
	System.out.println("emp Name:  "+name);
	}
	
}
