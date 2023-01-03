package Pageobejct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobj {

	public WebDriver driver;
	
	pageobj(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By logo_Loc=By.xpath("//img[@alt='company-branding']");//logo
	By username_Loc=By.xpath("//input[@placeholder='Username']");//username
	By pwd_locLoc=By.xpath("//input[@placeholder='Password']");//pwd
	By submit_Loc=By.xpath("//button[@type='submit']");//submit
	
	//mthods
	
	public boolean logodisplay()
	{
		boolean status=driver.findElement(logo_Loc).isDisplayed();
		return status;
	}
	
	public void username(String username)
	{
		driver.findElement(username_Loc).sendKeys(username);
		
	}
	public void pwd(String pwd)
	{
		driver.findElement(pwd_locLoc).sendKeys(pwd);
		
	}
	public void submit()
	{
		driver.findElement(submit_Loc).click();
		
	}
}
