import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class DragandDropExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver= new FirefoxDriver();
driver.get("http://jqueryui.com/droppable/");
driver.manage().window().maximize();
driver.switchTo().frame(0);
Sleeper.sleepTightInSeconds(10);
Actions action= new Actions(driver);
WebElement drg=driver.findElement(By.id("draggable"));
WebElement drp= driver.findElement(By.id("droppable"));
action.dragAndDrop(drg, drp).build().perform();


	}

}
