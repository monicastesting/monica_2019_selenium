package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_MultipleSelector {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		
		//driver.findElement(By.cssSelector("input#lst-ib")).sendKeys("seed");          //tagname#id
				//driver.findElement(By.cssSelector("#lst-ib")).sendKeys("seed");       //#id
				driver.findElement(By.cssSelector("input.gsfi")).sendKeys("seed");      //tagname.classname
				//driver.findElement(By.cssSelector(".gsfi")).sendKeys("seed");         //.classname
		//driver.close();

	}

}
