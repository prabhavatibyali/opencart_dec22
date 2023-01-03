package Datepicker;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
				
	//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("12/06/2022");
	
 //using sendkeys
			
		String year="2023";
		String month="Febuay";
		String date="20";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true)
		{
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(mon.equals(month)&& yr.equals(year))
	     {
			break;
	      }
		
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//future date
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//past date
		
		}
		
		
		//date
  List<WebElement> dt=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]/tbody/tr/td"));
  System.out.println(dt.size());
	
  for(WebElement x:dt)
	{
		if(x.getText().equals(date))
		{
			x.click();
			break;
		}
	}

	
	}
	}

	

	

