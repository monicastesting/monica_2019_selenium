package exp;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class NewTest {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	  String driverPath = "C:\\Users\\Administrator\\Desktop\\selenium support\\chromedriver.exe";
	public WebDriver driver ; 
	    
  @Test
  public void f() { 
	  System.out.println("launching firefox browser"); 
  System.setProperty("webdriver.chrome.driver", driverPath);
  String expectedTitle = "Welcome: Mercury Tours";
  String actualTitle = driver.getTitle();
  Assert.assertEquals(actualTitle, expectedTitle);
  driver.close();
  }
  @BeforeMethod
  public void beforeMethod() { 
	  driver = new FirefoxDriver();
  driver.get(baseUrl);
  }


}
