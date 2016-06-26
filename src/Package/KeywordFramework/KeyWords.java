package Package.KeywordFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyWords {
WebDriver driver;
	public void launchbrowser()
	{
		driver=new FirefoxDriver();
	}
	
	public void navigate()
	{
		driver.get("http://www.gmail.com");
	}
	
	public void enterusername()
	{
		driver.findElement(By.id("Email")).sendKeys("reach.seleniumprogramme");
	}
}
