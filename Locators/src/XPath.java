import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		//driver.get("https://www.google.co.in");
		//driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[1]/div']")).sendKeys("seed");
       //relative xpath
		//relative x path.==.//*[@id='tsf']/div[2]/div/div[1]/div
		
		
		//driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]")).sendKeys("seed"); 
		// this is a absolute xpath.
		
	
	//or 
		driver.get("http:www.rediff.com");
		
		//driver.findElement(By.xpath(".//*[@id='srchword']")).sendKeys("balakot attack");
		driver.findElement(By.xpath("html/body/div[2]/div[8]/div[1]/div[1]/div/form/div/input")).sendKeys("14th feb attack in Jammu and Kashmir");
		
		
		// html/body/div[2]/div[8]/div[1]/div[1]/div/form/div/div ------ xpath of same object
		//driver.close();
                                                               
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
