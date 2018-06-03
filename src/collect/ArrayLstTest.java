package collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayLstTest {
	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(20);
		l.add(30);
		l.add(30);
		
		//1st
		Set s1=new TreeSet();
		s1.addAll(l);
		System.out.println(s1);
		//2nd
		Set s2=new TreeSet(l);
		System.out.println(s2);
		//3rd
		Set s3=new TreeSet();
		for (int i = 0; i < l.size(); i++) {
			s3.add(l.get(i));
			
		}
		System.out.println(s3);
		
		
	}

}
