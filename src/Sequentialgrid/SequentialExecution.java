package Sequentialgrid;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class SequentialExecution {
	
	@Parameters("browser")
	@Test
	public void logindata(String b) throws MalformedURLException
	{	
		System.out.println(b);
		DesiredCapabilities cap=null;
		
					

		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
		}
					else if(b.equals("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}

		RemoteWebDriver driver=new RemoteWebDriver(new URL
	            ("http://localhost:4444/wd/hub"),cap);
driver.get("http://gmail.com");
	

}
	
}
