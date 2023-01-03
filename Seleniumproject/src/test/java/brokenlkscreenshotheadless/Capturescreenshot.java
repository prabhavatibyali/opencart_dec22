package brokenlkscreenshotheadless;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturescreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//C:\prabha\Selenium code\Seleniumproject\src\test\java\screenshot
		// //div[@class='product-grid home-page-product-grid']
		// //input[@id='small-searchterms']
	/*	
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\prabha\\Selenium code\\Seleniumproject\\src\\test\\java\\screenshot.png");
		FileUtils.copyFile(src, trg);
		
		*/
		
/*
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement fd=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src=fd.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\prabha\\Selenium code\\Seleniumproject\\src\\test\\java\\screenshot.png");
		FileUtils.copyFile(src, trg);
		*/
		TakesScreenshot ts=(TakesScreenshot)driver;
		WebElement fd=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		File src=fd.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\prabha\\Selenium code\\Seleniumproject\\src\\test\\java\\screenshot.png");
		FileUtils.copyFile(src, trg);
		
	}

}
