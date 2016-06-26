import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ChromeGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
DesiredCapabilities cap=null;
cap=DesiredCapabilities.chrome();
cap.setBrowserName("chrome");
cap.setPlatform(Platform.WINDOWS);
RemoteWebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
driver.get("http://gmail.com");
	}

}
