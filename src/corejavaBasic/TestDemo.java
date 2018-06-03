package corejavaBasic;

public class TestDemo {
	int a=10,b=20;
	static String name="kiran";
	
public int add() {
	int result=a+b;
		System.out.println(result);
		System.out.println(name);
		return result;
	}
public static void hello() {

	
	TestDemo t=new TestDemo();
	System.out.println(name);
	System.out.println(t.a);
	System.out.println(t.b);
	
}

public static void main(String[] args) {
	TestDemo t=new TestDemo();
System.out.println(t.add())	;
//1.directly calling their name
System.out.println(name);
hello();

//2.through the classname

System.out.println(TestDemo.name);

TestDemo.hello();

//3.through the object

TestDemo t1=new TestDemo();
System.out.println(t1.a);
System.out.println(t1.b);
System.out.println(t1.add());
	
}
}
