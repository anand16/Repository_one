import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Framesexample {

	
		// TODO Auto-generated method stub
		WebDriver driver=null;
		
		@BeforeMethod
		public void initialise()
		{
			driver=new FirefoxDriver();
			driver.get("http://www.espncricinfo.com/");
			driver.manage().window().maximize();
		}
		@Test
		public void clickevent()
		{
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		for(int i=0;i<frames.size();i++)
		{
			driver.switchTo().frame(i);
			
			try
			
			{
				//Sleeper.sleepTightInSeconds(20);
			WebDriverWait wait = new WebDriverWait(driver,60);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("ESPNcricinfo"))));
				driver.findElement(By.linkText("ESPNcricinfo")).click();
				System.out.println(i);
				System.out.println("hello");
				
				
			}
			catch(Exception E)
			{
				
				driver.switchTo().defaultContent();
			}
		}
		
			
		}
		

	

	

}
