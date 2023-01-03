package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hardvssoft {

	//@Test
	void haradass()
	{
		System.out.println("testing1....");
		System.out.println("testing2....");
		System.out.println("testing3....");
		System.out.println("testing4....");
		Assert.assertEquals(1,2);
		System.out.println("hard assertion completed");
		Assert.assertEquals(1, 1);
		
	}
@Test
	void softdass()
	{
		System.out.println("testing1....");
		System.out.println("testing2....");
		System.out.println("testing3....");
		System.out.println("testing4....");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1,2);
		System.out.println("soft assertion completed");
		Assert.assertEquals(1,1);
		sa.assertAll();
		
	}
}
