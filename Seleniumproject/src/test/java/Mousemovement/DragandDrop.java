package Mousemovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();

		WebElement wb1=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement wb2=driver.findElement(By.xpath("//div[@id='box103']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(wb1,wb2).perform();
		
		
	}

}
