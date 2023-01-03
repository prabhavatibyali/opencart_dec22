package handalertspopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class alertspopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//alert with ok
		/*
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(5000);
		al.accept();
*/
		/*
		//alert with ok and cancel
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert all=driver.switchTo().alert();
		Thread.sleep(5000);
    
		System.out.println(all.getText());
		//all.accept();    //for ok
	    all.dismiss();    //for cancel
	    
	    */
		//alert with input box
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("welcome");
		Thread.sleep(5000);
		//al.accept();
		al.dismiss();
		String s=driver.findElement(By.xpath("//p[@id='result']")).getText();
		String ex="You entered: welcome";
		if(s.equals(ex))
		{
			System.out.println("test passed");
		}
		else
		{
		System.out.println("test failed");}
	}

}
