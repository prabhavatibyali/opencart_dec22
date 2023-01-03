package Getcondbros;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getconbroswermethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//get URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//get Title
		String s=driver.getTitle();
		System.out.println(s);
        // get currentURL
		System.out.println(driver.getCurrentUrl());
		/*
		//get pagesource
		String ps=driver.getPageSource();
		System.out.println(ps);
		System.out.println(ps.contains("html"));
		*/
		//getwindowhandle
		System.out.println(driver.getWindowHandle());
		
		//getwindowhandles()
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> wd=driver.getWindowHandles();
		for(String x:wd)
		{
			System.out.println(x);
		}
		
		}
		
		
	}

	



