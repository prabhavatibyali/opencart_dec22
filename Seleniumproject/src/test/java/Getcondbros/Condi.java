package Getcondbros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Condi {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
//Isdisplayed() //IsEnabled
				Thread.sleep(5000);
		WebElement el=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println(el.isDisplayed());
				System.out.println(el.isEnabled());
				//Is selected
				
				WebElement mr=driver.findElement(By.xpath("//label[@for='gender-male']"));
				WebElement fr=driver.findElement(By.xpath("//label[@for='gender-female']"));
				System.out.println("Before selction:"+mr.isSelected());
				System.out.println("Before selction:"+fr.isSelected());
				mr.click();
				System.out.println(mr.isSelected());
				System.out.println(fr.isSelected());
				fr.click();
				System.out.println("After fr selction:"+mr.isSelected());
			System.out.println("After fr selction:"+fr.isSelected());
				//driver.close();
				driver.quit();
				
	}

}
