package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassertion {

	@Test
	void test()
	{
		//int x=10,y=20;
		if(false)
		{
			Assert.assertTrue(true);
		}
		else
		{
			//Assert.assertTrue(false);
			Assert.fail();
		}
		//Assert.assertEquals(10, 20,"test pr fail");
	}
	
}
