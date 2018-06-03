package collection_Fw;

import java.util.ArrayList;
import java.util.List;

public class ArraylistInJava1 {

	public static void main(String[] args) {

		
		List<Integer>  arraylist1=new ArrayList<Integer>();
		arraylist1.add(2);
		arraylist1.add(4);
		arraylist1.add(5);
		arraylist1.add(6);
		arraylist1.add(7);
		arraylist1.add(8);
		System.out.println(arraylist1);
		
		List<Integer>  arraylist2=new ArrayList<Integer>();
		arraylist2.add(4);
		arraylist2.add(40);
		arraylist2.add(50);
		arraylist2.add(8);
		//System.out.println(arraylist2);
		//arraylist1.addAll(arraylist2);
		//arraylist1.add(2, 600);
		//arraylist1.removeAll(arraylist2);
		arraylist1.remove(3);
		
		System.out.println(arraylist1);
		
		
	}

}
