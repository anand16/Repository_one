import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowHandlingTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://bing.com");
		String Title1=driver.getTitle();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Help")).click();

		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> itr=windowids.iterator();
		System.out.println(windowids.size());
		while(itr.hasNext())
		{
			
			driver.switchTo().window(itr.next());
			String Title2=driver.getTitle();
			if(!Title1.equals(Title2))
			{
				
				driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
			}
			
			
			
		}

	}

}
