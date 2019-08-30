package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ClickonAllLinksUsingBeforeandAfterMethod {
	 WebDriver driver ;
	  @Test(priority=1,groups="Top")
	  public void clickonGmail() {
		  driver.findElement(By.linkText("Gmail")).click();
	 }
	  @Test(priority=2,groups="Top")
	  public void clickonImages() {
		   driver.findElement(By.linkText("Images")).click();
		  
	  }
	  @Test(priority=4,groups="Bottom")
	  public void clickonAdvertising() {
		   driver.findElement(By.linkText("Advertising")).click();
		
	  }
	  @Test(priority=3,groups="Bottom")
	  public void clickonBusiness() {
		   driver.findElement(By.linkText("Business")).click();
		  
	  }
	  @Test(priority=5,groups="Bottom")
	  public void clickonAbout() {
		  driver.findElement(By.linkText("About")).click();
		 
	  }
	  @BeforeTest
	  public void beforeTest() {
		  driver = new FirefoxDriver();  //to launch firefox
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   
	  }

	  @AfterTest(alwaysRun=true)
	  public void afterTest() {
		  driver.close();
	  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("http://www.google.co.in");
	  System.out.println("Before Clicking"+driver.getTitle());
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Clicking"+driver.getTitle());
  }

 

}
