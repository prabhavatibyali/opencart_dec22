package Loginselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1.tag id #
2.tag class .
3.tag attribute []
4.tag class attribute .[]
 */
public class Locatorcss {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	//tag id #
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");
    // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Macbook");
		
   //tag class .
  //driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Macbook");
    //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Macbook");
     
     //tag attribute []
   //driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Macbook");
     //driver.findElement(By.cssSelector("[name='q']")).sendKeys("Macbook");
     
		
		//tag class attribute .[]
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Macbook");
		//driver.close();

	}

}
