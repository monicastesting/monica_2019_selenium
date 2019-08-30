package jascriptexcuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class byid {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", 
				
				"C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("www.gmail.com");  //This will generate error as the protocol is not mentioned in the name.
		
		
		driver.get("http://127.0.0.1:8080/orangehrm/symfony/web/index.php/auth/login");

		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript(arg0, arg1)
		JavascriptExecutor jes = (JavascriptExecutor)driver;
		jes.executeScript("document.getElementById('txtUsername').value='admin';");
		jes.executeScript("document.getElementById('txtPassword').value='seedadmin';");
		WebElement buttn=driver.findElement(By.className("button"));
		jes.executeScript("arguments[0].click();", buttn);
		
		
		
	}

}
