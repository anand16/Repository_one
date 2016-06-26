import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowHandlingFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://bing.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Help")).click();

		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> itr=windowids.iterator();
		System.out.println(windowids.size());
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			
			try
			{
				driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();	
			}
			catch(Exception E)
			{
				
			}
		}
		
		
		 windowids=driver.getWindowHandles();
		 itr=windowids.iterator();
		System.out.println(windowids.size());
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			
			try
			{
				driver.findElement(By.xpath("//*[@id='mainotherimportantprivacyinformationmodule_ShortDescription']/label/p/a")).click();	
			}
			catch(Exception E)
			{
				
			}
		}
		

	}

}
