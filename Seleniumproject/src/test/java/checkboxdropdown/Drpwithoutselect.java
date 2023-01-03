package checkboxdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drpwithoutselect {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//clicking on the dropbox
	driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
	//elements on the dropbox
	List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
	System.out.println(options.size());
	
			//print all options
		for(int i=0;i<options.size();i++)	
		{
      System.out.println(options.get(i).getText());	}
	//select options from dropdown
		
		for(int i=0;i<options.size();i++)	
		{
			System.out.println(options.get(i).getText());
		if(options.get(i).getText().equals("Java")||options.get(i).getText().equals("Python"))
		{
			options.get(i).click();
		}
		
		}
		
		

		

}}
