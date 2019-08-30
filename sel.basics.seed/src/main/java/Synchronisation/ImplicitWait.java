package Synchronisation;
//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
         driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	        
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
			
		//driver.get("http://www.google.co.in");
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details	");
		
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).clear();
		
		driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("seeggdfgdfgdfd");
		// full name 
		driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("sedfgfed");
		// choose login id on rediff
		
				
				driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[9]/td[3]/input")).sendKeys("sefgfgfed");
				// password field
				driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("sefgfgfed");
					
				//name("confirm_passwd0b742a2e")).sendKeys("seed");// retype password   confirm_passwd0b742a2e">
				
				driver.findElement(By.xpath(".//*[@id='div_altemail']/table/tbody/tr[1]/td[3]/input")).sendKeys("sytry@trye.ed");
				// alternate email id
				driver.findElement(By.xpath(".//*[@id='Register']")).click();
				driver.close();
				
		
	}
 
	//List<WebElement> li=driver.findElements(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/ul/li"));
			//for(WebElement opt:li)
			/*{
				System.out.println(opt.getText());
				//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			//driver.get("http://www.google.co.in");
			
			}
			*/
/*public static void Sendkeys(WebDriver driver,WebElement SSelement, int timeout, String val1){
   new WebDriverWait(driver, timeout).
  until(ExpectedConditions.visibilityOf(SSelement));
		  //visibilityOf(SSelement));
     SSelement.Sendkeys(val1);
	}



public static void clickON(WebDriver driver,WebElement SS1element, int timeout){
	   new WebDriverWait(driver, timeout).
	   until(ExpectedConditions.elementToBeClickable(SS1element));
	   SS1element.click();
    }   */
}