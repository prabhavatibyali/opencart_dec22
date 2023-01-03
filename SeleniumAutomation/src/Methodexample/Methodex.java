package Methodexample;

public class Methodex {

	// method with no return value and no parameter
	void test()
	{
	System.out.println("hello");	
	}
	
	//method with return value and no parameter
	String test1()
	{
	return "hello";
	}


//method with parameter and with no return value

  void test2(int a)
  {
	a=10;
		System.out.println(a+" "+a);
	
 }
  
  //method with parameter and with return value
  
  String test3(String name)
  {
	return ("hello"+" "+name)  ;
  }
}

