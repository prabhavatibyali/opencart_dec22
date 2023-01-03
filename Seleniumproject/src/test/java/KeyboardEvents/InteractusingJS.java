package KeyboardEvents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractusingJS {

	public static void main(String[] args) {
		//WebDriver driver=new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		

		//JavascriptExecutor js=(JavascriptExecutor) driver;
		JavascriptExecutor js=driver;
		
		driver.switchTo().frame(0);
		//input box
		WebElement ip=driver.findElement(By.id("RESULT_TextField-1"));
		js.executeScript("arguments[0].setAttribute('value','john')", ip);
		
		//radio button
		WebElement rd=driver.findElement(By.id("RESULT_RadioButton-7_0"));
		js.executeScript("arguments[0].click();", rd);
		
		//checkbox
		WebElement ck=driver.findElement(By.id("RESULT_CheckBox-8_1"));
		js.executeScript("arguments[0].click();", ck);
		
		//button
		WebElement bt=driver.findElement(By.id("FSsubmit"));
		js.executeScript("arguments[0].click();", bt);
	}

}
