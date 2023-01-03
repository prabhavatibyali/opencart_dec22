package annotations;

import org.testng.Assert;
import org.testng.annotations.*;

public class Dependentmethods {

	@Test(priority=1)
	void login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods={"login"})
	void search()
	{
		Assert.assertTrue(false);
	}
	@Test(priority=3,dependsOnMethods={"search"})
	void advancedsearch()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=4,dependsOnMethods={"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
	
	
	
	
}
