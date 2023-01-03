package Waitnavigationsleep;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitimplicit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		/* //declaring explicit wait
				WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
				*/
						
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		/*
		//Thread.sleep(5000);            //thread
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //implicit wait
	driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		/*
		/*
	WebElement useranme=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	useranme.sendKeys("Admin");
	
	WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
	password.sendKeys("admin123");*/
				//driver.close();
		
		
		//Fluent wait declaration
		
				FluentWait mywait=new FluentWait(driver);
				mywait.withTimeout(Duration.ofSeconds(30));
			    mywait.pollingEvery(Duration.ofSeconds(5));
			    mywait.ignoring(NoSuchElementException.class);
				
					
				//usage
			    WebElement username=(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
				username.sendKeys("Admin");
			
				

	}

}
