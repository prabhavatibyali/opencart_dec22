package Strings;

public class Stringspractise {

	public static void main(String[] args) {
		//String name="john";
		//System.out.println(name);
		
	//	String name=new String("john");
		//System.out.println(name);
		
	/*String s="welcome";
			System.out.println(s);
		System.out.println(s.length());*/
		
		/*String s=new String("welcome");
				System.out.println(s);
				System.out.println(s.length());*/
				
		//concat
	/*	String s1="welcome";
		String s2="to Java";
		System.out.println(s1+s2);
		System.out.print(s1.concat(s2));*/
		
		//trim
		/*String s="  hi  ";
		System.out.println(s);
		System.out.println(s.trim().length());
		System.out.println(s.length());
		*/
		//Char
		//String s="welcome";
		//System.out.println(s.ChartAt(0));

		//contains
		//String s="welcome";
		//System.out.println(s.contains("h"));
/*		
String s1= "WELCOME";
String s2="welcome";
System.out.println(s1==s2);
System.out.println(s1.equals(s2));     //equals
System.out.println(s1.equalsIgnoreCase(s2));   //equalsignorecase
System.out.println(s2.replace('e','y'));     //replace
System.out.println(s2.replace("welcome","java"));
System.out.println(s2.substring(1,4));  //substing
System.out.println(s1.substring(2,5)); */
		
	/*	String s="abc@gmail.com";
		String a[]=s.split("@");   //split
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(s.toLowerCase());  //lowercase
		System.out.println(s.toUpperCase());  //uppercase
		
		*/
		String s1="abc";
		String s2=new String("abc");
		String s3=s2;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1==s3);
		
	}

}
