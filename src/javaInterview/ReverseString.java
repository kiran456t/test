package javaInterview;

public class ReverseString {

	public static void main(String[] args) {
		String reverse=" ";
		String s="Kiran is goog boy";
		int length=s.length();
		for (int i = length-1; i>=0; i--) {
			reverse=reverse+s.charAt(i);
			System.out.println("Reverse of entered String:"+reverse);
		}
		
	}
}
