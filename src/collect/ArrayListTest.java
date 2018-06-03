package collect;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		int[] a= {12,36,34,34,34,12,12,34};
		List s=new ArrayList();
		for (int i = 0; i < a.length; i++) {
			boolean b=s.add(a[i]);
			if (b) {
				System.out.println("It is added");
			}
			else
			{
				System.out.println("It is duplicate");
				s.add(a[i]);
				
			}
		}
		System.out.println(s);
		System.out.println("remove duplicates are:"+s);
	}

}
