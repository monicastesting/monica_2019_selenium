import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByID_1 {

	public static void main(String[] args) {
		
		
		WebDriver driver= new FirefoxDriver();
	
	//driver.get("https://www.google.co.in");
	driver.get("http://127.0.0.1:8080/orangehrm/symfony/web/index.php/auth/login");
	
	driver.findElement(By.id("btnLogin")).click();
	
	}

}
