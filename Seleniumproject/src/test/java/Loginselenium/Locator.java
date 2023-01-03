package Loginselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//url
		driver.get("https://www.target.com");//target
		//driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		//search
	driver.findElement(By.id("search")).sendKeys("Deals");//target
	//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("dress");
		driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[6]/form/button[2]")).click();
//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	
		//linktext
//driver.findElement(By.linkText("PRETTYGARDEN")).click();
		
		//partiallinktext
//driver.findElement(By.partialLinkText("GAR"));

		//Find the total no of sliders
List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
System.out.println("total sliders"+sliders.size());
//Find the total no of images
List<WebElement> images=driver.findElements(By.tagName("img"));
System.out.println("total Images:"+ images.size());
//Find the total no of links
List<WebElement> links=driver.findElements(By.tagName("li)"));
System.out.println("total links:"+ links.size());
		
driver.close();
	}

}
