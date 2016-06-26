package Package.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FlightDetails extends Constants {
    
	
	@Test
	public void flightinfo()
	{
		
	driver.findElement(By.xpath("//input[@value='oneway']")).click();
	driver.findElement(By.name("findFlights")).click();
		
	}
	
}
