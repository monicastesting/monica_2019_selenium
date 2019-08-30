import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Button {

	
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			//opening webpage
			
			driver.get("https://www.google.co.in/?gws_rd=ssl");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.findElement(By.name("q")).sendKeys("selenium tech");
			
				//driver.findElement(By.id("lst-ib")).sendKeys("seed");
			
			driver.findElement(By.name("btnK")).click();
			
			driver.close();


	}

}
