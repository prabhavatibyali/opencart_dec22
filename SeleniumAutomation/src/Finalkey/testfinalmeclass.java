package Finalkey;

 class A  //final class A
{
 void m1()   //final void m1()
{
	System.out.println("this is m1 of class A");
}}

class B extends A
{
void m1()
{
	System.out.println("this is m1 of class B");
}}

public class testfinalmeclass {

	public static void main(String[] args) {
	
		A cl=new A();
		cl.m1();
		B cd=new B();
	cd.m1();
	}

}
