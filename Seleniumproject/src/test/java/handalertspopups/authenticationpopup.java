package handalertspopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationpopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		String sf=driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
		if(sf.contains("Congratulations"))
				
				{
			System.out.println("test passed");
				}
		else
		{
			System.out.println("test failed");
				}
	}

}
