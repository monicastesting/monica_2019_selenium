package locators;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByName {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", 
				
				"C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");  //This will generate error as the protocol is not mentioned in the name.
		driver.findElement(By.name("q")).sendKeys("jobs");
		driver.findElement(By.name("q")).submit();
		
		
		
		
		//driver.get("http://127.0.0.1:8080/orangehrm/symfony/web/index.php/auth/login");
		
		//driver.findElement(By.name("Submit")).click();
		

	}

}
