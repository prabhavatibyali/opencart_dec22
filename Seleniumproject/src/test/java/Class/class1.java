package Class;

import org.testng.annotations.*;

public class class1 {
  @Test
	void abc()
	{
		System.out.println("abc from class1");
	}
  @BeforeTest
  void m()
  {
	  System.out.println("this is before test");
  }
  @BeforeSuite
  void x()
  {
	  System.out.println("this is before suite");
  }
	
}
