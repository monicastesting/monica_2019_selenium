package TestNG;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.AfterTest;


public class MyFirstTestNGClass 

{
	WebDriver driver;
  
	@Test
  
	public void locateByID() 
  
	{
	  
	   driver.findElement(By.id("lst-ib")).sendKeys("seed");
  
        }
  
    
 	@BeforeTest
  
	public void launchApplication()
  
	{
	 
            driver=new FirefoxDriver();
	 
	    driver.manage().window().maximize();
		
	    driver.get("http://www.google.co.in");
 
        }


  
	@AfterTest
  
	public void afterTest()
  
	{
	  
	    driver.close();
  
	}


}
