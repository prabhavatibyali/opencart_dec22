package checkboxdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwnwithselect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement wb=driver.findElement(By.xpath("//select[@id='country-list']"));
				Select drpbx=new Select(wb);
		
				//selecting option from dropdown
				
			//drpbx.selectByVisibleText("USA");
			//drpbx.selectByValue("4");
			drpbx.selectByIndex(4);
		
			//Find total options in dropdown
			List<WebElement> options=drpbx.getOptions();
			System.out.println("total number of options:"+options.size());
			
			//print dropbox options
		/*	for(int i=0;i<options.size();i++)
			{
			System.out.println(options.get(i).getText());
			}
			*/
			for(WebElement x:options)
			{
				System.out.println(x.getText());
			}
	}

}
