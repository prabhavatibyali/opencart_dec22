package Loginselenium;
import java.util.NoSuchElementException;

/*
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : OrangeHRM
7) close browser

 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// Launch browser
		WebDriver driver=new ChromeDriver();
		//open url 		https://opensource-demo.orangehrmlive.com/
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F//");//for app1
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Provide username  - Admin
		
		/*WebElement textemail=driver.findElement(By.id("Email"));//for app1
		textemail.clear();//for app1
		textemail.sendKeys("admin@yourstore.com");//for app1*/
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		// Provide password  - admin123
		
		/*WebElement textpwd =driver.findElement(By.name("Password"));//for app1
		textpwd.clear();//for app1
		textpwd.sendKeys("admin");//for app1*/
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		//Click on Login button 
		//driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();//for app1
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		//Verify the title of dashboard page   
	//String Exp_title = "OrangeHRM";
		
		String act_title = driver.getTitle();
		System.out.println(act_title);
		
		String exp_title="OrangeHRM";  ///OrangeHRM
		//String exp_title="Your store. Login";  //for app1
		
		if(act_title.equals(exp_title))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		/*
		//lable validation after successful logn\
		 String actn_title="";
		try
			{
				actn_title=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
			}
		catch(NoSuchElementException e)	{ 
		}
	
	String exp_label="Dashboard";
		if (actn_title.equals(exp_label))
				{
			System.out.println("test is passed");
				}
		else
				{
					System.out.println("test is failed");
					
				}
		 //for app1*/
		//close browser
		
	driver.close();
	}

}




