package Package.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginPage  extends Constants{

    @Test	
	public void Login()
	{
	driver =new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
	driver.findElement(By.name("userName")).clear();
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
	driver.findElement(By.name("login")).click();
		
	}
}
