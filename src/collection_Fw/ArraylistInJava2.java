package collection_Fw;

import java.util.ArrayList;
import java.util.List;

public class ArraylistInJava2 {

	public static void main(String[] args) {
		
		List<Object> list=new ArrayList<Object>();		
		list.add(2);
		list.add(4);
		list.add(3);		
		list.add(true);
		list.add(23.56);
		list.add("kiran");
		list.add(5);
		System.out.println(list);
		/*
		System.out.println("list in the values: "+list);
	    System.out.println("get the index 4 value is :  "+list.get(4));	;
		
		System.out.println("To get size: "+list.size());
		*/
		List<Integer> list1=new ArrayList<Integer>();		
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		//list1.add(6);
		System.out.println(list.containsAll(list1));
		//System.out.println(list.contains(4));
		//System.out.println(list.contains(400));
		//System.out.println(list1);
		//list.retainAll(list1);
		/*
		System.out.println("list in the values:  "+list1);
		
		System.out.println("get the index value of 3:   "+list1.get(3));
		System.out.println("To get size:   "+list1.size());
		*/
		//System.out.println(list);
		
		
	}

}
