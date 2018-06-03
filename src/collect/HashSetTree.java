package collect;

import java.util.TreeSet;

public class HashSetTree {
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		StringBuffer s1=new StringBuffer("hello");
		StringBuffer s2=new StringBuffer("abc");
		StringBuffer s3=new StringBuffer("java");
		StringBuffer s4=new StringBuffer("selenium");
		StringBuffer s5=new StringBuffer("practice");
		StringBuffer s6=new StringBuffer("main");
		
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		t.add(s6);
		
		System.out.println(t);
		
		
	}

}
