package Mousemovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement min=driver.findElement(By.xpath("//span[1]"));
		WebElement max=driver.findElement(By.xpath("//span[2]"));
		
		System.out.println(min.getLocation());
		System.out.println(max.getLocation());
		
		Actions act=new Actions(driver);
		act.dragAndDropBy(min, 150,250).perform();
		System.out.println(min.getLocation());
		act.dragAndDropBy(max,-100,250).perform();
		System.out.println(max.getLocation());

	}

}
