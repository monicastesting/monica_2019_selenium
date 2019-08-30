package lb;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class desired_capabilities {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
	    String browserName = cap.getBrowserName().toLowerCase();
	    System.out.println("browser name"+browserName);
	    String os = cap.getPlatform().toString();
	    System.out.println("os"+os);
	    String v = cap.getVersion().toString();
	    System.out.println("version"+v);

	}

}
