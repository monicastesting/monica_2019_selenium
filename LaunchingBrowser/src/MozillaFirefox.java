import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaFirefox {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
	
		// driver- obj ref.name
	    // obj created firefox browser.
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		
		
		
		
	}

}
