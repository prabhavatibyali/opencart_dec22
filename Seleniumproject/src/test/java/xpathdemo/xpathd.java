package xpathdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathd {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//full xpath or absolute path
	//String productname=driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")).getText();
		
		//relative xpath or xpath
		//String productname=driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
				
				//From selectorhub Relxpath
			//String productname=driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
				
		        //*[@attribute='value']
				//tagname[@attribute='value']
		  // String productname=driver.findElement(By.xpath("//img[@title='Your Store']")).getText();
		String productname=driver.findElement(By.xpath("//*[@title='Your Store']")).getText();
						
				System.out.println(productname);
			}

}
