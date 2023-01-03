package Pageobejct;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class logintest {

	public WebDriver driver;
	
	//pageobj lp;
	Usingfindby lp;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
	}
	
	@Test(priority=1)
	void testlogo()
	{
    // lp=new pageobj(driver);
		lp=new Usingfindby(driver);
	   	
		Assert.assertEquals(lp.logodisplay(), true);
	}
	
	@Test(priority=2)
	void login()
	{
		lp.username("Admin");
		lp.pwd("admin123");
		lp.submit();
		
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@AfterClass
	public void tear()
	{
		driver.quit();
	}
}
