import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class SliderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver= new FirefoxDriver();
driver.get("http://jqueryui.com/slider/");
driver.manage().window().maximize();
driver.switchTo().frame(0);
Sleeper.sleepTightInSeconds(15);
WebElement slide=driver.findElement(By.xpath("//*[@id='slider']"));
int x=slide.getLocation().x;
int y=slide.getLocation().y;
Actions action = new Actions(driver);
action.dragAndDropBy(slide, 53, y).build().perform();


	}

}
