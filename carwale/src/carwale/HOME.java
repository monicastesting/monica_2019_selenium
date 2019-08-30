package carwale;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ByAll;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.openqa.selenium.support.pagefactory.ByChained;

public class HOME {

	public static WebDriver driver;
			@FindBy(xpath=(".//*[@id='rpgListings_divLastNav1']/span"))
			@CacheLookup
			static WebElement next;
			
			public HOME(){
				PageFactory.initElements(driver, this);
			}
	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.carwale.com/new/");
		
		driver.findElement(new ByAll(By.id("cw-top-navbar"),By.xpath(".//*[@id='cw-top-navbar']/li[1]/div[1]"))).click();
		
		driver.findElement(By.xpath("//span[contains(@class,'margin-right5')]")).click();    //new car bootstrap
		driver.findElement(By.xpath(".//*[@id='cw-top-navbar']/li[1]/div[2]/div/div[1]/div[1]/ul/li[1]/a")).click(); //find new car link
		
			driver.findElement(By.xpath("html/body/div[9]/section[1]/div[1]/div/div[1]/ul/li[3]/h3")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath(".//*[@id='body-type-grid-9']/ul[1]/li[4]/a[1]/span")).click();
			
			//verify page location.    
			String expUrl="https://www.carwale.com/new/search/#bs=6";
			
			if(expUrl.contentEquals(driver.getCurrentUrl()))
			
			{
				driver.findElement(By.xpath(".//*[@id='parms']/h3[1]")).click();
				
				// selecting option from budget list 5th=8-12 lakh
				WebElement optn=driver.findElement(By.xpath(".//*[@id='budget']/li[5]/a"));
				optn.click();
				//checked box 'SUV/MUV' is selected
				WebElement body_type_suv= driver.findElement(By.xpath(".//*[@id='bs']/li[4]/a"));
				  if(body_type_suv.isSelected())
				  {
				    if(optn.isDisplayed())
				  {  
					  optn.click();
				  }
				
				  }
				  
				  WebElement res_table=driver.findElement(By.xpath(".//*[@id='tbl_res']/tbody/tr[2]/td/table/tbody"));
		List<WebElement> table_rows=driver.findElements(new ByChained(By.xpath(".//*[@id='tbl_res']/tbody/tr[2]/td/table/tbody"),By.tagName("tr")));
				 int cnt_tbl_rows=table_rows.size();
		
				 for(int tr=1;tr<cnt_tbl_rows;tr++){
			
		
		
		
		
		}
		
				 //result car list
				List<WebElement> car_res=driver.findElements(By.xpath("//*[@id='tbl_res']/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
				int cnt_car_res=car_res.size();
						for(int i=1;i<cnt_car_res;i++)
						{
					
				  
				List<WebElement> res= driver.findElements(By.xpath(".//*[@id='tbl_res']/tbody/tr[2]/td/table/tbody/tr[2]/td[2]"));
				//-------------.//*[@id='tbl_res']/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
				//.//*[@id='tbl_res']/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/a......tata nexon
				}
				//hyperlink X matching options 
				     for(WebElement i:res)
				     { 
				    	  String temp=i.getText();
				    	  String[] words=temp.split("\\s");
				    			 //getting actual value of options
				   
				    
				    int size=Integer.valueOf(words[0]);
				    System.out.println(size+" matching ");
				    
				   	for(int cnt=1;cnt<size;cnt++)
				   	{
		WebElement modl=driver.findElement(By.xpath(".//*[@id='tbl_res']/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));*/
	//model xpath
		//String price=(driver.findElement(By.xpath(".//*[@id='tbl_res']/tbody/tr[2]/td/table/tbody/tr/td[2]")).getText());
		//price xpath
		//System.out.println(modl.getText());// +"  "+price);
				    		}
// String model=driver.findElement(By.xpath(".//*[@id='tbl_res']/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).getText();				     
				//     System.out.println(model);
				     
				      }
			
				// next.click();}
				  
			
	}

			.//*[@id='tbl_res']/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
