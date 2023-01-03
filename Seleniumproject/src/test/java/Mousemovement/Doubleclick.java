package Mousemovement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement fd=driver.findElement(By.xpath("//input[@id='field1']"));
		fd.clear();
		fd.sendKeys("Welcome");
		
		WebElement bt=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(bt).perform();
		
		WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));
		System.out.println(f2.getText());
		System.out.println(f2.getAttribute("value"));
		if(fd.getAttribute("value").equals(f2.getAttribute("value")))
		{
			System.out.println("test pass");
		}
		else
			System.out.println("test fail");
			
		
	}

}
