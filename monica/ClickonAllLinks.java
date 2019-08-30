package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ClickonAllLinks {
	 WebDriver driver ;
  @Test(priority=1)
  public void clickonGmail() {
	  driver.get("http://www.google.co.in");
	  System.out.println("Before Clicking"+driver.getTitle());
	  driver.findElement(By.linkText("Gmail")).click();
	  System.out.println("After Clicking"+driver.getTitle());
  }
  @Test(priority=2)
  public void clickonImages() {
	  driver.get("http://www.google.co.in");
	  System.out.println("Before Clicking"+driver.getTitle());
	  driver.findElement(By.linkText("Images")).click();
	  System.out.println("After Clicking"+driver.getTitle());
  }
  @Test(priority=4)
  public void clickonAdvertising() {
	  driver.get("http://www.google.co.in");
	   System.out.println("Before Clicking"+driver.getTitle());
	   driver.findElement(By.linkText("Advertising")).click();
	   System.out.println("After Clicking"+driver.getTitle());
	   
  }
  @Test(priority=3)
  public void clickonBusiness() {
	  driver.get("http://www.google.co.in");
	  System.out.println("Before Clicking"+driver.getTitle());
	   driver.findElement(By.linkText("Business")).click();
	   System.out.println("After Clicking"+driver.getTitle());
	   
  }
  @Test(priority=5)
  public void clickonAbout() {
	  driver.get("http://www.google.co.in");
	  System.out.println("Before Clicking"+driver.getTitle());
	  driver.findElement(By.linkText("About")).click();
	  System.out.println("After Clicking"+driver.getTitle());
	   
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();  //to launch firefox
	    driver.manage().window().maximize();
	   
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
