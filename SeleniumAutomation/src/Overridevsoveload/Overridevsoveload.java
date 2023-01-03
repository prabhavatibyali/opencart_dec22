package Overridevsoveload;
class ABC
{
	void m1(int a)
	{System.out.println(a);}
	
	void m2(int b)
	{System.out.println(b);
	
	}
}

class XYZ extends ABC
{
	void m1(int a)//override
	{System.out.println(a*a);}
	
	void m2(int a,int b)//overload
	{
		System.out.println(a+b);
	}
}

public class Overridevsoveload {

	public static void main(String[] args) {
		XYZ xc=new XYZ();
		xc.m1(10);
		xc.m2(20);
		xc.m2(40,50);
		

	}

}
