import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Parallel {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		  DesiredCapabilities capabilities =new DesiredCapabilities();
	      capabilities.setBrowserName("Chrome");
	      capabilities.setPlatform(Platform.WINDOWS);
	      WebDriver driver = new RemoteWebDriver(new URL(""), capabilities);
	     
	     
	      
	       driver.get("http://google.com");
	       System.out.println(driver.getTitle());
		
		
	}

}
