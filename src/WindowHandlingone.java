import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WindowHandlingone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxDriver driver= new FirefoxDriver();
driver.get("http://bing.com");
driver.manage().window().maximize();
driver.findElement(By.linkText("Help")).click();

Set<String> windowids=driver.getWindowHandles();
Iterator<String> itr=windowids.iterator();
System.out.println(windowids.size());
String first=itr.next();
System.out.println(first);
String second=itr.next();
System.out.println(second);
driver.switchTo().window(second);
driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();


	}

}
