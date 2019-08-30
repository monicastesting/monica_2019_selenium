package webdriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascriptexecutor_webmethods {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://127.0.0.1:8080/orangehrm/symfony/web/index.php/auth/login");
		//WebElement buttn=driver.findElement(By.className("button"));

		JavascriptExecutor js=((JavascriptExecutor)driver);
		String url = js.executeScript("return document.URL;").toString();			
        System.out.println("URL  = "+url);	
        
      //Method document.title fetch the Title name of the site. Tostring() change object to name		
        String TitleName = js.executeScript("return document.title;").toString();			
        System.out.println("Title of the page = "+TitleName);	
        
        //goto new webpage
        js.executeScript("window.location ='https://register.rediff.com/register/register.php?FormName=user_details'");
        
        //Vertical scroll down by 400  pixels		
        js.executeScript("window.scrollBy(0,400)");	
	}

}
