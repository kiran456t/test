package collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HastSetTest {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		System.out.println(h.add(90));
		System.out.println(h.add(10));
		System.out.println(h.add("java"));
		System.out.println(h.add("selenium"));
		System.out.println(h.add("selenium"));
		System.out.println(h.add(90));
		System.out.println(h);
		List l=new ArrayList(h);
		System.out.println(l);
		System.out.println(l.get(2));
		
		
	}
	
}
