import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestngAnnotations {

	
	@BeforeMethod
	void login()
	{
		System.out.println("login");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("search");
	}
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("advancedsearch");
	}
	

	@AfterMethod
	void logout()
	{
		System.out.println("logout");
	}
}
