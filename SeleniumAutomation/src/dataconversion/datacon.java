package dataconversion;

public class datacon {

	public static void main(String[] args) {
  //String-----int
		
		String s="welcome";    //not possible to convert to number
		String s1="10";
		String s2="20";
		
	
		System.out.println(s1+s2);//1020
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));//30
	
	
		//String-->Double
	/*	String s1="150.15";
		String s2="130.20";
		
		double s1dbl=Double.parseDouble(s1);
		double s2dbl=Double.parseDouble(s2);
		
		System.out.println(s1dbl+s2dbl);
	
*/
		//String--->Boolean
		
			/*	String s="true";
				
				boolean bool=Boolean.parseBoolean(s);
				System.out.println(bool);
			*/
		// int, double, char, boolean----->String
		
			/*	int a=10;
				double d=15.15;
				char c='A';
				boolean b=false;
				
				System.out.println(String.valueOf(a));
				System.out.println(String.valueOf(d));
				System.out.println(String.valueOf(c));
				System.out.println(String.valueOf(b));
		*/
	}

}
