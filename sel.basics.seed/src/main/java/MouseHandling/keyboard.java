package MouseHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyboard {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8080/orangehrm/symfony/web/index.php/auth/login");
		
		Actions builder = new Actions(driver);
		WebElement un1=driver.findElement(By.xpath(".//*[@id='divUsername']/input"));
		WebElement pwd = driver.findElement(By.xpath(".//*[@id='divPassword']/input"));
		
		Action actionseries = builder.moveToElement(un1).click().keyDown(Keys.SHIFT).sendKeys(un1,"ADMIN").keyUp(Keys.SHIFT).click().build();
		         actionseries.perform();
		Action actionseries1 = builder.moveToElement(pwd).click().sendKeys("seedadmin").click().build();
		       actionseries1.perform();
				driver.findElement(By.name("Submit")).click();
	}

}
