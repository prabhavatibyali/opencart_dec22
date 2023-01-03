package hframesbrowserwnd;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlebrowser {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> wndid=driver.getWindowHandles();
		
		for(String x:wndid)
		{
			String title=driver.switchTo().window(x).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
					{
				driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
					}
			
		}
		/*
		for(String x:wndid)
		{
			String title=driver.switchTo().window(x).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM") ||title.equals("OrangeHRM") )
					{
				driver.close();
					}
			
		}*/
		
		

	}

}
