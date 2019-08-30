package webdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WBdmethods {
	public static void main(String[] args) {
	WebDriver driver= new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.co.in/?gws_rd=ssl");
    
	    System.out.println("the url of the current site"+driver.getCurrentUrl());
     //to get the url of the current site

        System.out.println(driver.getPageSource()); 
      //to set the source file of the current web page.

        System.out.println("the title of the web page"+driver.getTitle()); 
        //to get the title of the web page.
        
        System.out.println("CLOSE command will close only current tab of browser");
        System.out.println("QUIT command will close all tabs of browser");
        
        driver.close(); 
        // this command will close only current tab of browser
        
        driver.quit(); 
        // this command will close all tabs of browser

}}
