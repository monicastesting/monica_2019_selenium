/**
 * 
 */
package mousehandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Administrator == monica somani date 12 march 19
 *
 */
public class rightclick {
	public static void main(String[] args) {
		String baseUrl = "http://127.0.0.1:8080/orangehrm/symfony/web/index.php/auth/login"; 
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.xpath(".//*[@id='divUsername']/input"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
			.moveToElement(txtUsername)
			.click()
			.keyDown(txtUsername, Keys.SHIFT)
			.sendKeys(txtUsername, "ADMIN")
			.keyUp(txtUsername, Keys.SHIFT)
			.doubleClick(txtUsername)  //HIGH LIGHTING data
			.contextClick() // RIGHT CLICK
			.build();
			
		seriesOfActions.perform() ;

		}


}
