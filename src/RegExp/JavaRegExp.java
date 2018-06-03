package RegExp;

public class JavaRegExp {

	public static void main(String[] args) {
		
		String[] strDates= {"2018-10-31","2012-12-12","2005-3-11","2009-05-5","2015-12-28"};
		
		for(String strDate:strDates) {
	   validateDate(strDate);
		}	
	}
	
	
	private  static void validateDate(String strDate) {
	
		
		String strDateRegEx="\\d{4}-\\d{2}-\\d{2}";
		if (strDate.matches(strDateRegEx)) {
			System.out.println(strDate+"is valid");
		}else {
			System.out.println(strDate+"is not Valid");
		}

	}
		}

