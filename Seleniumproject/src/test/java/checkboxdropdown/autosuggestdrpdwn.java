package checkboxdropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestdrpdwn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> wb=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]"));
		
		System.out.println(wb.size());

		for(int i=0;i<wb.size();i++)
		{
			System.out.println(wb.get(i).getText());
		}
		for(int i=0;i<wb.size();i++)
		{
			String s=wb.get(i).getText();
			if (s.equals("selenium python"))
			{
				wb.get(i).click();
				break;
			}
		}
	}

}
