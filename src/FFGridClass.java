
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class FFGridClass {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap= null;
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
	}

}
