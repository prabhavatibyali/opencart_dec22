package Mousemovement;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locationofelement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		System.out.println("location of logo is:"+logo.getLocation());
		
		driver.manage().window().maximize();
		System.out.println("location of max logo is:"+logo.getLocation());
		
		driver.manage().window().minimize();
		System.out.println("location of min logo is:"+logo.getLocation());
		
		driver.manage().window().fullscreen();
		System.out.println("location of fullscreen logo is:"+logo.getLocation());
		
		Point p=new Point(50,50);
		driver.manage().window().setPosition(p);
		System.out.println("location of point logo is:"+logo.getLocation());
	}

}
