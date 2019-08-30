import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.co.in");
		driver.findElement(By.linkText("Sign in")).click();
		
		//next line after this line.its mandatory.
		
		//driver.close(); 
		
		//if this line is not mentioned it will not wait till the server gets that page.
		


	}

}
