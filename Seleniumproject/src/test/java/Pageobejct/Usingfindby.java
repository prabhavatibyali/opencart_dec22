package Pageobejct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Usingfindby {

public WebDriver driver;
	
	//Constructor
Usingfindby(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
		
	// WebElements Locators+identification
	//@FindBy(xpath="//img[@alt='company-branding']") 
	@FindBy(how=How.XPATH, using="//img[@alt='company-branding']")
	WebElement img_logo;
	
	@FindBy(name="username")
	WebElement txt_username;
	
	@FindBy(css="input[placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_submit;
		
	//@FindBy(tagName="a")
	//List<WebElement> links;
	
	//Action methods
	
	public void username(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void pwd(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void submit()
	{
		btn_submit.click();
	}
	
	public boolean logodisplay()
	{
		boolean status=img_logo.isDisplayed();
		return status;
	}
	
}