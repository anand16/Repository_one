package Package.TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectFlight extends Constants{
	@Test
	public void Flight()
	{
		
		driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
		driver.findElement(By.name("reserveFlights")).click();
	}

}
