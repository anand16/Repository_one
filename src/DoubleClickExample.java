import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class DoubleClickExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		String URL="file:///C:/Users/anand/Desktop/DoubleClick/Doubleclick.html";
		driver.get(URL);
		Sleeper.sleepTight(50);
		driver.findElement(By.id("field1")).sendKeys("Hello India");
		driver.findElement(By.id("field2")).sendKeys("Hello World");
		Actions action=new Actions(driver);
		WebElement dclick=driver.findElement(By.xpath("//button[contains(text(),'CopyText')]"));
        action.doubleClick(dclick).build().perform();	

	}

}
