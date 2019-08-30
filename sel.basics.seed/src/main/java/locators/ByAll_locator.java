package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ByAll_locator {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			
			"C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.co.in");
	
	//driver.findElement(new ByAll(By.name("q"),By.className("gLFyf gsfi"))).sendKeys("ByAll locators in selenium");
	//driver.findElement(new ByAll(By.name("q"),By.xpath("//input[@name='q']"))).sendKeys("hello");
	
	//driver.findElement(new ByIdOrName("q")).sendKeys("ByIdOrName locator of selenium");
	
	
	driver.findElement(new ByChained(By.tagName("div"),By.name("q"))).sendKeys("ByChained in selenium");
		
	
	
	
	
	
	
	}
}
