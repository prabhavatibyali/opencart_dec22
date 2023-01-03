package Waitnavigationsleep;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigationdemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
        driver.getCurrentUrl();
        driver.navigate().to("https://www.walmart.com/");
        driver.getCurrentUrl();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();
	}

}
