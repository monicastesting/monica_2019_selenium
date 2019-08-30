package src;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class ClickOnAllLinksGoogle {
	private WebDriver driver;
	
	  @Test
	  public void gmail() {
		  driver.get("https://www.google.co.in/?gfe_rd=cr&gws_rd=ssl");
		  System.out.println("current page title:"+driver.getTitle());
		  driver.findElement(By.linkText("Gmail")).click();
		  System.out.print("   "+"After Click operation page title:"+driver.getTitle());
	  }
	  
	  @Test
	  public void images() {
		  driver.get("https://www.google.co.in/?gfe_rd=cr&gws_rd=ssl");
		  System.out.println("current page title:"+driver.getTitle());
		  driver.findElement(By.linkText("Images")).click();
		  System.out.print("   "+"After Click operation page title:"+driver.getTitle());
	  }
	  @Test
	  public void Advertising() {
		  driver.get("https://www.google.co.in/?gfe_rd=cr&gws_rd=ssl");
		  System.out.println("current page title:"+driver.getTitle());
		  driver.findElement(By.linkText("Advertising")).click();
		  System.out.print("   "+"After Click operation page title:"+driver.getTitle());
	  }
	  @Test
	  public void Business() {
		  driver.get("https://www.google.co.in/?gfe_rd=cr&gws_rd=ssl");
		  System.out.println("current page title:"+driver.getTitle());
		  driver.findElement(By.linkText("Business")).click();
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
