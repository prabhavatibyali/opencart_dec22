package Constructoroveloading;

public class Constructoroverload {

	int x,y,z;
	double d,f;
	
	Constructoroverload()
	{
		x=10;
		y=20;
					}
	
	Constructoroverload(int a, int b)
	{
		x=a;
		y=b;
					}
	
	Constructoroverload(int a, double d)
	{
		x=a;
		f=d;
					}
	
	Constructoroverload(double d,int a)
	{
		f=d;
		x=a;
	
					}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
		System.out.println(f);
		
	}
	public static void main(String[] args) {
		
		//Constructoroverload cd=new Constructoroverload();
		//Constructoroverload cd=new Constructoroverload(10,20);
		//Constructoroverload cd=new Constructoroverload(10,20.2);
		Constructoroverload cd=new Constructoroverload(10.4,20);
		cd.display();

	}

}
