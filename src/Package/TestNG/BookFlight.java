package Package.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BookFlight extends Constants{

	@Test
	public void flightdetails()
	{
		
		driver.findElement(By.name("passFirst0")).sendKeys("Vivekanand");
		driver.findElement(By.name("passLast0")).sendKeys("YG");
		driver.findElement(By.name("buyFlights")).click();
	}
}
