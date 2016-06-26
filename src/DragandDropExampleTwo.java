import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class DragandDropExampleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(20);
WebElement tree1=driver.findElement(By.xpath("//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
WebElement tree2=driver.findElement(By.xpath("//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
Actions action= new Actions(driver);
action.clickAndHold(tree1).moveToElement(tree2).release(tree2).build().perform();

	}

}
