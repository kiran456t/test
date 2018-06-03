package corejavaBasic;



class TestThree{
	
	int id=123;
	static String name="kiran";
	
	public void hello() {
		System.out.println(name+"....."+id);
		//display();
	}
	public static void display() {
	
		TestThree t=new  TestThree();
		System.out.println(name+"...."+t.id);
        t.hello();
	}
}


public class ContextTest {
	public static void main(String[] args) {
	
		TestThree t=new TestThree();
		t.hello();
		t.display();

	}
	

}
