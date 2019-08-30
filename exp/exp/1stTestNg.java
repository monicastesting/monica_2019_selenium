package exp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
public class firsttestngfile {
	

 	  public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "C:\\Users\Administrator\\Desktop\\selenium support\\chromedrive.exe";
	    public WebDriver driver ; 
    

public class 1stTestNg {
  @Test
	  public void verifyHomepageTitle() {
	       
	      System.out.println("launching firefox browser"); 
	      System.setProperty("webdriver.firefox.marionette", driverPath);
	      driver = new FirefoxDriver();
	      driver.get(baseUrl);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
  }
 
	  

}
