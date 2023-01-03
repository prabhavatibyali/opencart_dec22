package Methodoverloading;

public class Methodoverload {

	int x,y;
	double c,d;
		
	void sum()
	{
		x=10;
		y=20;
		System.out.println(x+y);
	}
	
	void sum(int a, int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	void sum(int a, double c)
	{
		x=a;
		d=c;
		System.out.println(x+d);
	}
	
	void sum(double c, int a)
	{
		x=a;
		d=c;
		System.out.println(x+d);
	}
	public static void main(String[] args) {
		Methodoverload ex=new Methodoverload();
		ex.sum();
		ex.sum(20,30);
		ex.sum(5,10.2);
		ex.sum(20.2,30);
		

	}

}
