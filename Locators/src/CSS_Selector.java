import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_Selector {

	public static void main(String[] args) {
	
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		
		//driver.findElement(By.cssSelector("input[ aria-label='Search']")).sendKeys("seed");

	 driver.findElement(By.cssSelector("input[ aria-label='Search'][maxlength='2048']"+"[role='combobox']")).sendKeys("seed");
		//WebElement r - new Random().;
	 driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).submit();
     driver.findElement(By.xpath("//input[@name='btnk']")).click();
		driver.close();
	}

}


