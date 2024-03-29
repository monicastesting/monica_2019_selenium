import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotEg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).sendKeys(Keys.chord(Keys.CONTROL+"T"+Keys.RETURN));
		driver.findElement(By.tagName("body")).sendKeys(Keys.chord(Keys.CONTROL+"2"));
		driver.switchTo().defaultContent();              
		driver.findElement(By.id("Email")).sendKeys("bela.joshi@seedinfotech.test");
		driver.findElement(By.id("Password")).sendKeys("Tosca1234!");
		driver.findElement(By.cssSelector("input[value^='Log']")).click();
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Administrator\\Desktop\\Abcd.png"));
		driver.close();
		
	
	}

}
