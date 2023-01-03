package Interface;

interface DEF
{
 void m();                //abstract method
 default void m1()           //default method
 { System.out.println("hello"); }
 static void m2()            //static method
 { System.out.println("how"); }}

public class Concept implements DEF {
  public void m()
  { System.out.println("this is abstact"); }
	public static void main(String[] args) {
		Concept c=new Concept();
		c.m();
		c.m1();
		DEF.m2();
	DEF gh=new Concept();
	gh.m();
	gh.m1();
	
	}

	}
