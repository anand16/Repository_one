import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DynamicWebTableExampleTwo {
	WebDriver driver= new FirefoxDriver();
	@BeforeMethod
	public void initialise()
	{
		
		driver.get("http://www.timeanddate.com/worldclock/");
		
	}
	@Test
	public void program()
	{
		WebElement ts=driver.findElement(By.xpath("html/body/div[1]/div[7]/section[2]"));
		
		List<WebElement> rows=ts.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols= rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				System.out.println(cols.get(j).getText());
			}
			System.out.println();
		}
	}
@AfterMethod
	public void tearDown()
	{
		
		driver.close();
	}
}
