package exp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class gurucopyTest {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	  public WebDriver driver ; 
	    
  @Test
  public void f() { System.out.println("launching firefox browser"); 
  System.setProperty("webdriver.firefox.marionette", driverPath);
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
