package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ById {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				
				"C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("http://127.0.0.1:8080/orangehrm/symfony/web/index.php/auth/login");
		//driver.navigate().to("https://www.google.com");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");//txtUsername
		driver.findElement(By.id("txtPassword")).sendKeys("seedadmin");
		driver.findElement(By.id("btnLogin")).click();

		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.GetElementBy.Id('txtUsername').value,'admin';");
		//args.js.executeScript(arg0, arg1)		
	}

}
