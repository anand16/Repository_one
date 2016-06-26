import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class WindowHandlingExampleFive {
	WebDriver driver=null;
	@BeforeMethod
	public void initialize()
	{
		driver=new FirefoxDriver();
		driver.get("http://bing.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(15);
	}
	@Test
	public void callfunctions()
	{
		driver.findElement(By.linkText("Help")).click();
		System.out.println("Hello");
		callfunction("//*[@id='privacyLabel']");
		callfunction("//*[@id='mainotherimportantprivacyinformationmodule_ShortDescription']/label/p/a");
	}
	@Test
	public void callfunction(String x_path)
	{
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> itr=windowids.iterator();
		while(itr.hasNext())
		{
			driver.switchTo().window(itr.next());
			try{
				
				driver.findElement(By.xpath(x_path)).click();
			}
			catch(Exception E)
			{
				
			}
		}
		
	}
	
	
}
