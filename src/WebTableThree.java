import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class WebTableThree {
    FirefoxDriver driver= new FirefoxDriver();
	
	@BeforeMethod
	public void initialise()
	{
		driver.get("http://www.timeanddate.com/worldclock/");
		//html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[35]/td[1]
	}
    @Test
    public void checkwebtable()
    {
    	String xpathone="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
    	String xpathtwo="]/td[";
    	String xpaththree="]";
    	
    	for(int i=1;i<=36;i++)
    	{
    		for(int j=1;j<=8;j++)
    		{
    			System.out.println(driver.findElement(By.xpath(xpathone+i+xpathtwo+j+xpaththree)).getText());
    			
    		}
    		System.out.println();
    		
    	}
    	
    }
    @AfterMethod
    public void teardown()
    {
    	
    	
    }
    
    
}
