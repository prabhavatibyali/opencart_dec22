package checkboxdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbxdrpdwn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//select specific one checkbox
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		//total number of checkboxes
		List<WebElement> chk=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	    System.out.println("Total number of checkboxes:"+chk.size()); //7
		
	    //select all checkboxes
	   /* for(int i=0;i<chk.size();i++)
	    {
	    	chk.get(i).click();
	    }
	    */
	    //using enhanced for loop
	  /*  for(WebElement x:chk)
	    {
	    	x.click();
	    }
	    
	   */
	   // Select last two checkboxes
	    
	 /*   for(int i=chk.size()-2;i<chk.size();i++)
	    {
	    	chk.get(i).click();
	    }
	     */
	    //select 1st two checkboxes
	  /*  for(int i=0;i<2;i++)
	    {
	    	chk.get(i).click();
	    }
	   */ 
	     //clear or uncheck boxes
	    
	    
	    for(WebElement x:chk)
	    {
	    	x.click();
	    }
	     Thread.sleep(5000);
	    	    
	    for(int i=0;i<chk.size();i++)
	    {
	    	  if(chk.get(i).isSelected())
	    	  {
	    	chk.get(i).click();
	    	  }
	    }
	    
	    }
	    	
	    
	}


