package Synchronisation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThreadEg {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("Returning of Abhinandan");
		//Thread.sleep(3000);
		
		//System.out.println(driver.findElements(By.xpath(".//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li/div/div[2]")).getText());
		List<WebElement> li=driver.findElements(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li"));
		for(WebElement opt:li)
		{
			System.out.println(opt.getText());
		}

	}

}
//.//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li[1]/div/div[1]/div/span
//.//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li[4]/div/div[1]/div/span
//.//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li[6]/div/div[1]/div/span