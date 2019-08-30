//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
	
			"C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	Dimension d=new Dimension(400,1000);
	driver.manage().window().setSize(d);

	driver.get("https://www.google.com");
	}

}