package TestNG;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginEcoTrack
{
	private WebDriver driver;
	String expMessage="Invalid Username/Password";   //"Enter username" this is to change the value and check.
	
@Parameters({"un","pwd"})	
  @Test
  public void LoginEcoTrak(String username,String password) 
{
	  driver.findElement(By.id("txtCustomerID")).sendKeys(username);
	  driver.findElement(By.id("txtPassword")).sendKeys(password);
	  driver.findElement(By.id("Butsub")).click();
	  String actMessage=driver.findElement(By.id("lblMsg")).getText();
	  Assert.assertEquals(expMessage, actMessage);
	  System.out.println("Passed");
  }
  @BeforeTest
  public void LauchEcoTrak() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
  }

  @AfterTest
  public void CloseEcoTrak() 
  {
	  driver.close();
  }
  

}


