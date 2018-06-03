package corejavaBasic;

public class VariableTest {
 
	int a=10;
	static String intstname;
	
	public void display() {
		System.out.println(a);
		
		System.out.println(intstname);
	}
public static void hello() {
	VariableTest t=new VariableTest();
		System.out.println(t.a);
		System.out.println(intstname);
	}
	
	public static void main(String[] args) {
		VariableTest t=new VariableTest();
		System.out.println(t.a);
		System.out.println(intstname);
		System.out.println(VariableTest.intstname);
		//System.out.println();
		
		
	}
	
	
}
