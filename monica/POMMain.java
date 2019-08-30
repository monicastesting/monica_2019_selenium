package POM;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class POMMain
{
	public static void main(String[] args) {
		String expMessage="Invalid Username/Password"; 
		POMClass po = new POMClass();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		po.username(driver).sendKeys("seed");
		po.password(driver).sendKeys("seed");
		po.loginButton(driver).click();
		String actMessage=po.errorMsg(driver).getText();
		 Assert.assertEquals( actMessage, expMessage);
		  System.out.println("Passed");
		
	}

}
