package xpathdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
			
			//tagName[@attributeName=’value’]
		String tx=driver.findElement(By.xpath("//input[@name=\'srchword\']")).getText();
		System.out.println("test : "+ tx); 
		//input[@name='username'][@placeholder='Username']
		String tx1=driver.findElement(By.xpath("//input[@value='web'][@id='snsSRC']")).getText();
		System.out.println("test1 : "+ tx1); 
		//and //input[@name='username' and @placeholder='Username']
		String tx2=driver.findElement(By.xpath("//input[@value='web' and @id='snsSRC']")).getText();
		System.out.println("test3 : "+ tx2); 
		//or //input[@name='xyz' or @placeholder='Username']
		String tx3=driver.findElement(By.xpath("//input[@value='web' or @id='snsSRC']")).getText();
		System.out.println("test4 : "+ tx3); 
		
	
		
	
		//tagName[starts-with(text(),’Prefix of Inner Text’)]
		//driver.findElement(By.xpath("//a[starts-with(*,'a')]"));--syntax
		
		
		
	//	contains()
				//tagName[contains(text(),’substring’)] 
				 //*[contains(text(),’substring’)]
				 //tagName[contains(.,’substring’)] 
		//String text=driver.findElement(By.xpath("//a[contains(text(),'IFB')]")).getText();
		//String text=driver.findElement(By.xpath("//*[contains(text(),'IFB')]")).getText();
		//String texts=driver.findElement(By.xpath("//a[contains(.,'IFB')]/self::a")).getText();
		//System.out.println("Self : "+ texts); //IFB Industries
			
		//Parent - Selects the parent of the current node (always One)
		//<knownXpath>/parent::* or //<knownXpath>/parent::elementName //<knownXpath>/..
		//text=driver.findElement(By.xpath("//a[contains(text(),'IFB')]/parent::td")).getText();// there is no text for parent, so it is same value display
		//text=driver.findElement(By.xpath("//a[contains(text(),'IFB')]/parent::*")).getText();// there is no text for parent, so it is same value display
		//text=driver.findElement(By.xpath("//a[contains(text(),'IFB')]/..")).getText();// there is no text for parent, so it is same value display
	     //System.out.println("Parent : "+text);  //IFB Industries
				
	   //Child - Selects all children of the current node (One or many)
	     //<xpathOfContextElement>/child::<elementName> 
			//<xpathOfContextElement>/child::* 
			//<xpathOfContextElement>/<elementName>
	   //<xpathOfContextElement>/*/<elementName> 
			//<xpathOfContextElement>/child/<elementName>
			//List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'IFB')]/ancestor::tr/child::td"));
			//List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'IFB')]/ancestor::tr/child::*"));
	   //  List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'IFB')]/td"));
	    // List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'IFB')]/*/td"));
	     List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'IFB')]/child/td"));
			System.out.println("Number of child elements:"+childs.size());//5
	  
				
			//Ancestor - Selects all ancestors (parent, grandparent, etc.) 
			//text=driver.findElement(By.xpath("//a[contains(text(),'IFB')]/ancestor::tr")).getText();
			//System.out.println("Ancestor : "+text);
		
			//Descendant - Selects all descendants (children, grandchildren, etc.) of the current node
			List<WebElement> descendants=driver.findElements(By.xpath("//a[contains(text(),'IFB')]/ancestor::tr/descendant::*"));
			System.out.println("Number of descendant nodes:"+descendants.size());
			
			//Following -Selects everything in the document after the closing tag of the current node
			List<WebElement>followingnodes=driver.findElements(By.xpath("//a[contains(text(),'IFB')]/ancestor::tr/following::tr"));
			System.out.println("Number of following nodes:"+followingnodes.size());

			//Following-sibling : Selects all siblings after the current node
			List<WebElement> followingsiblings=driver.findElements(By.xpath("//a[contains(text(),'IFB')]/ancestor::tr/following-sibling::tr"));
			System.out.println("Number of Following Siblings:"+followingsiblings.size());
			
			//Preceding - Selects all nodes that appear before the current node in the document
			List<WebElement> precedings=driver.findElements(By.xpath("//a[contains(text(),'IFB')]/ancestor::tr/preceding::tr"));
			System.out.println("Number of preceding nodes:"+precedings.size());
			
			//preceding-sibling - Selects all siblings before the current node
			List<WebElement> precedingsiblings=driver.findElements(By.xpath("//a[contains(text(),'IFB')]/ancestor::tr/preceding-sibling::tr"));
			System.out.println("Number of preceding sibling nodes:"+precedingsiblings.size());
	    
			

			//last()
			//input[@id=’txtUsername’]/following::input[last()]--syntax
			//List<WebElement>followingnodes1=driver.findElements(By.xpath("//a[contains(text(),'IFB')]/ancestor::tr/following::tr(last())"));
		//	System.out.println("Number of following nodes:"+followingnodes1.size());

			
			driver.close();
				
	}

}
