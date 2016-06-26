import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DynamicWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.cleartrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("OneWay")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		driver.findElement(By.id("ToTag")).sendKeys("Kathmandu, NP - Tribuvan (KTM)");
		driver.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		
		String doj="14/03/2017";
		String split_array[]=doj.split("/");
		String day=split_array[0];
		String year=split_array[2];
		String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int x=Integer.parseInt(split_array[1]);
		String month=months[x-1];
		System.out.println("day"+day+"month"+month+"Year"+year);
		
		String cal_year=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		while(!cal_year.equals(year))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			cal_year=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[2]")).getText();
		}

		
		String cal_month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		while(!cal_month.equals(month))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			cal_month=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div/span[1]")).getText();
		
		}
		
		
		WebElement Calender=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']"));
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++)
			{
				if((cols.get(j).getText()).equals(day))
				{
					cols.get(j).click();
					break;
				}
			}
		}
	}

}
