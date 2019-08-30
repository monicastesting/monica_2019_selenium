package src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class keywrd_dependsonTest {

  @Test
  public void executSessionOne() {
	            //First session of WebDriver
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          //Goto guru99 site
          driver.get("http://demo.guru99.com/V4/");
          //find user name text box and fill it
          driver.findElement(By.name("uid")).sendKeys("Driver 1");
  }

  @Test
  public void executSessionThree() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
          //Goto guru99 site
      driver.get("http://demo.guru99.com/V4/");
      //find user name text box and fill it
      driver.findElement(By.name("uid")).sendKeys("Driver 2");
      
  }

  @Test
  public void executeSessionTwo() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
          //Goto guru99 site
      driver.get("http://demo.guru99.com/V4/");
      //find user name text box and fill it
      driver.findElement(By.name("uid")).sendKeys("Driver 3");
  }
}
