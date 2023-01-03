package Hierarchyinher;

class Parent
{
	int a;
	void display()
	{ System.out.println(a);
}}

class child1 extends Parent
{
	int b;
	void show()
	{ System.out.println(b);
}}

class child2 extends Parent
{
	int c;
	void print()
	{ System.out.println(c);
}}

public class Hierarchialin {

	public static void main(String[] args) {
		child1 cd =new child1();
		cd.a=10;
		cd.b=20;
		cd.display();
		cd.show();
		
		child2 ck=new child2();
		ck.c=400;
		ck.print();
				

	}

}
