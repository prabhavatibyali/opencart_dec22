package brokenlkscreenshotheadless;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlkscreenshotheadless {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.setHeadless(true);
	//WebDriver driver=new ChromeDriver(options);
	WebDriver driver=WebDriverManager.chromedriver().capabilities(options).create();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	
								
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

				String act_title = driver.getTitle();
				System.out.println(act_title);
				
				String exp_title="OrangeHRM";  ///OrangeHRM
				
				if(act_title.equals(exp_title))
				{
					System.out.println("test is passed");
				}
				else
				{
					System.out.println("test is failed");
				}
				
			
				
			driver.close();
	}

}
