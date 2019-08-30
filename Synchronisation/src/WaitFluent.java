import java.util.List;
import java.util.NoSuchElementException;
import java.util.Vector;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;

public class WaitFluent { // prog objectiive is not cleared

		public static void main(String[] args)
		{
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
			WebElement name1 = driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
			// full name 
			WebElement loginName1 =driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]"));
			// choose login id on rediff
			driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
			// button Check availability" Check availability" name="btnchkavail63105fd8"
			
			Wait fw= new FluentWait<WebDriver>(driver)
			
		    .withTimeout(30,TimeUnit.SECONDS)
		    .pollingEvery(2, TimeUnit.NANOSECONDS)
		    .ignoring(NoSuchElementException.class);
		  // until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='recommend_text']/table/tbody/tr")));
		    
		    WebElement elemt = (WebElement) fw.until(new Function<WebDriver, WebElement>()
		        {
		    		
		    	public WebElement apply(WebDriver driver)
		    	{
		    		System.out.println("FW");
		    		String s1 ="The ID cannot be blank. Please choose your desired ID.";
		    		String s = driver.findElement(By.xpath(".//*[@id='check_availability']/font/b")).getText();
		    		if(s.equalsIgnoreCase(s))
		    		{
		    			System.out.println(s);
		    			return  driver.findElement(By.xpath(".//*[@id='check_availability']/font/b"));
		    		}
		    		else
		    		{
		    			System.out.println(s);
		    			return null;
		    		}
		    		
		    		
		    	}
		    			    	//*[@id='recommend_text']/table/tbody/tr[1]/td[2]

				
				
		      }
		    );
		    
		    
		    
		    
		    
		    
		    
				/*List<WebElement> li=driver.findElements(By.xpath("html/body/div[1]/div[3]/form/div[2]/div/div[2]/div[2]/ul/li/div[1]/div/span/b"));
				for(WebElement opt:li)
				{
					System.out.println(opt.getText());
				}*/

			}

		private static void until(ExpectedCondition<WebElement> visibilityOfElementLocated) {
			// TODO Auto-generated method stub
			
		}

		

	}

