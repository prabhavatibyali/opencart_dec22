package Staticprac;

public class Staticpr {
	
	static int a=10;//static variable
	int b=20; //non static variable
	
	static void m1()  //static method
	{
      System.out.println("this is static method");
	}
	
	void m2()  //non static method
	{
		System.out.println("this is non static method");
	}
	
	public static void main(String[] args) {
		System.out.println(a);//static..so without object
		//System.out.println(b);//non static cannot be used without object
		m1();//can be used with or without object
		Staticpr sd= new Staticpr();
		System.out.println(sd.a);
			System.out.println(sd.b);
			sd.m1();//can be used with or without object
				sd.m2(); //should be used with object
		
	}

}
//static methods can acess static variables/methods without object
//static methods can acess non static variables/methods with object
