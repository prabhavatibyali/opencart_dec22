package Constructordemo;

public class Constr {

	int x,y;
	String s;
	
/*	Constr()  //default constructor without parameter
	{
		x=10;
		y=20;
		s="hello";
	}
	*/
	Constr(int a,int b, String str)//parameterized constructor
	{
		x=a;
		y=b;
		s=str;
	}
	
void display()
{
	System.out.println(x);
	System.out.println(y);
	System.out.println(s);
}


	public static void main(String[] args) {
		//Constr cd=new Constr();
		Constr cd=new Constr(30,40,"john");
			cd.display();

	}
}

