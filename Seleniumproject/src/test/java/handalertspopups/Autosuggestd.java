package handalertspopups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");

Thread.sleep(5000);
List<WebElement> ls=driver.findElements(By.xpath("//div[contains(@class,'wM6W7d')]"));
System.out.println(ls.size());


for(int i=0;i<ls.size();i++)
{
	String y=ls.get(i).getText();
	System.out.println(y);
	
}

for(int i=0;i<ls.size();i++)
{
	String y=ls.get(i).getText();
	if(y.equals("selenium python"))
	{
		ls.get(i).click();
		break;
	}
}
}
}
