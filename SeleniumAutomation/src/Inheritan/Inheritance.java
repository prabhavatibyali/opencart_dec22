package Inheritan;

class A
{
    int a;
  	void m()
	{
		System.out.println(a);
	}
}

class B extends A

{
	int b;
	void m1()
	{
		System.out.println(b);
	}
	
}

class C extends B
{
int c;
 void m2()
 {
	System.out.println(c);
	
	}
}



public class Inheritance {
	

	public static void main(String[] args) {
		
	/*	B bj=new B();
		bj.a=100;
		bj.b=200;
		bj.m();
		bj.m1();
		*/
		C cd=new C();
		cd.a=10;
		cd.b=20;
		cd.c=30;
		cd.m();
		cd.m1();
		cd.m2();
		
	}

}
