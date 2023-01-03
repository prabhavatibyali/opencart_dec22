package Webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statiswebtable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Find the total no of rows
		
	int rows=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
		System.out.println(rows);
		
		//Find the total no of columns
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
		System.out.println(columns);
		        //read specific row and column
		
		String co=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
		System.out.println(co);
		
		//read data from all rows and columns
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=columns;c++)                //table[@name='BookTable']//tr["+r+"]//td["+c+"]
			{
				String cd=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(cd+"\t");
				
			}
			
			System.out.println();
		}
		
		//find the book name whose author is amit
		for(int r=2;r<=rows;r++)
		{
			              //table[@name='BookTable']//tr["+r+"]//td["+c+"]
			
				String Author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
				if(Author.equals("Mukesh"))
				{
					String	bk=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
					System.out.print(bk);
			}
			
			System.out.println();
		}
		
		//find the sum of books
		int sum=0;
		for(int r=2;r<=rows;r++)
		{
					
					String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
					int pr=Integer.parseInt(price);
					sum=sum+pr;
					
				}
		System.out.println(sum);
	}
	

}
