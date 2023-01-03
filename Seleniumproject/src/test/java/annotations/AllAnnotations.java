package annotations;
import org.testng.annotations.*;

public class AllAnnotations {
	@BeforeSuite
	void m()
	  {
		  System.out.println("this is before suite");
	  }
	@AfterSuite
	void n()
	  {
		  System.out.println("this is after suite");
	  }
	
	@BeforeTest
	void o()
	  {
		  System.out.println("this is before test");
	  }
	@AfterTest
	void p()
	  {
		  System.out.println("this is after test");
	  }
	
	@BeforeClass
	void q()
	  {
		  System.out.println("this is before class");
	  }
	@AfterClass
	void r()
	  {
		  System.out.println("this is after class");
	  }
	
	@BeforeMethod
	void s()
	  {
		  System.out.println("this is before method");
	  }
	@AfterMethod
	void t()
	  {
		  System.out.println("this is after method");
	  }
	@Test(priority=2)
	void u()
	  {
		  System.out.println("this is search");
	  }
	@Test(priority=1)
	void v()
	  {
		  System.out.println("this is login");
	  }
	
}
