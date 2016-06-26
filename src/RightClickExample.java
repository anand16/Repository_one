import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class RightClickExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://ask.com");
		driver.manage().window().maximize();
		WebElement rclk=driver.findElement(By.xpath("//*[@id='footer-left-nav']/li[4]/a"));
		Actions action=new Actions(driver);
		action.contextClick(rclk).build().perform();

	}

}
