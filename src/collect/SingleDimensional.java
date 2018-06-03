package collect;

public class SingleDimensional {
	public static void main(String[] args) {
		
		float  []f=new float[10];
		
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);//print default values
		}
		f[0]=12;
		f[1]=123.456f;
		f[3]=23.666f;
		
		for (int i = 0; i < f.length; i++) {
			
			System.out.println(f[i]);//
			
		}
		String[] s= {"java","selenium","practice"};
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}

}
