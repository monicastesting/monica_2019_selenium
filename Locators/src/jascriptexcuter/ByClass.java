package jascriptexcuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByClass {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://127.0.0.1:8080/orangehrm/symfony/web/index.php/auth/login");
	WebElement buttn=driver.findElement(By.className("button"));

		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();", buttn);
		
	
		
	}

}
