package failtc_exectn_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo_B {

	@Test
	WebDriver driver=new FirefoxDriver();
	Reporter.log("initiating browser");
	
	driver.manage().window().maximize();
	Reporter.log("max size of browser");
	
	driver.get("http://www.google.co.in");
	Reporter.log("url for browser");
	
	driver.findElement(By.name("q")).sendKeys("jobs");
	Reporter.log("data written in browser");
	
	driver.findElement(By.name("q")).submit();
		Reporter.log("submit operation in browser");
	
	
	
}
