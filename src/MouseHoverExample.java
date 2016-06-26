import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class MouseHoverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new FirefoxDriver();
/*driver.get("http://www.ticketmaster.co.uk");
driver.manage().window().maximize();
Actions action= new Actions(driver);
WebElement mousehovr=driver.findElement(By.xpath("//*[@id='navLinkCat_music']/span"));
action.moveToElement(mousehovr).build().perform();
////*[@id='subNav_music_menu']/div[2]/ul[1]/li[2]/a
Sleeper.sleepTightInSeconds(25);
//driver.findElement(By.xpath("//*[@id='subNav_music_menu']/div[1]/ul[1]/li[2]/a")).click();
driver.findElement(By.linkText("Clubs and Dance")).click();
*/
driver.get("http://via.com");
driver.manage().window().maximize();
WebElement hvr=driver.findElement(By.xpath("//*[@id='Cars']/a/span[2]"));
Actions action= new Actions(driver);
action.moveToElement(hvr).build().perform();
driver.findElement(By.linkText("Out Station")).click();
	
	
	}

}
