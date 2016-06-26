import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowHandlingThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		String windowidone=driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='PrivacyLink']")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> itr=windowids.iterator();
		System.out.println(windowids.size());
		while(itr.hasNext())
		{
			String windowhandletwo=itr.next();
			if(!windowidone.equalsIgnoreCase(windowhandletwo))
			{
				driver.switchTo().window(windowhandletwo);
				driver.findElement(By.xpath("//*[@id='maia-nav-y']/ul/li[1]/ul/li[1]/a")).click();
				
			}
			
			
			
			
			
		}

	}

}
