package src;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class b4andaftermethod {
	
	private WebDriver driver;
	
	@Test
	  public void gmail() {
		 driver.findElement(By.linkText("Gmail")).click();
       }
	
	@Test
	  public void images() {
		 driver.findElement(By.linkText("Images")).click();
		}
	
	@Test
	  public void Advertising() {
		  driver.findElement(By.linkText("Advertising")).click();
	  }
	  
	  
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://www.google.co.in/?gfe_rd=cr&gws_rd=ssl");
	  System.out.println();
	  System.out.println("current page title:"+driver.getTitle());
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.print("   "+"After Click operation page title:"+driver.getTitle());
  }

  @BeforeTest
  public void beforeTest() {
	  driver= new FirefoxDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
