package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DataProviderEg 
{
	WebDriver driver;
	
  @Test(dataProvider = "getData")
  public void loginNewTours(String un, String pwd) 
  {
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.name("userName")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("login")).click();
	  driver.findElement(By.linkText("SIGN-OFF"));	
  }

  @DataProvider
  public Object[][] getData()
  {
    return new Object[][] {
      new Object[] { "un", "pwd" },
      new Object[] { "mercury", "mercury" },
    };
  }
  
  @BeforeTest
  public void launchNewTours()
  {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
  }

  @AfterTest
  public void closeBrowser()
  {
	  driver.close();
  }

}
