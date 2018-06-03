package collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ForEachLoop {
public static void main(String[] args) {
	
      ArrayList  l=new ArrayList();
      l.add(12);
      l.add(112);
      l.add(120);
      l.add(12);
      l.add(20000);

     /* Iterator iter=l.iterator();
      while (iter.hasNext()) {
		Integer i=(Integer)iter.next();
		System.out.println(i);
      }
	*/	
		/*ListIterator iter1=l.listIterator();
		while(iter1.hasNext()) {
			Integer i1=(Integer)iter1.next();
			System.out.println(i1);
		
	}
	*/	
      
		/*for(Object obj:l) {
		Integer	i=(Integer)obj;
		System.out.println(i);
		
		if (i==20000) {
			System.out.println("20000 value is there");
		}
		}*/
      String[] s= {"hello","java","selenium"};
     /* for(String s1:s) {
    	  System.out.println(s1);

      }
*/      
      for(int i=0;i<s.length;i++) {
    	  System.out.println(s[i]);
      }
      
      for(int i=s.length;i>=0;i--)
	System.out.println(s[i]);
}
	
	
}
