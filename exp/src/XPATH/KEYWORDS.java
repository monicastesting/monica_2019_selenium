/**
 * 
 */
package XPATH;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Administrator
 *
 */
public class KEYWORDS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		String lable1=driver.findElement(By.xpath(".//*[text()='Full Name']")).getText();
		String lable2=driver.findElement(By.xpath(".//*[text()='Choose a Rediffmail ID']")).getText();
		String lable3=driver.findElement(By.xpath(".//*[text()='Password']")).getText();
		System.out.println("lables on screen  "+lable1+lable2+lable3+"    & so on...");
		
		
		// ***************keyword "contains"*********Xpath=//*[contains(@type,'sub')] 
		driver.findElement(By.xpath("//*[contains(@name,'name')]")).sendKeys("monica somani");   //name="name3e904593"
		
		driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("pratiksha");
		driver.findElement(By.xpath("//*[contains(@class,'checkavail')]")).click();
		
		// ************88keyword "child" result 1st option displayed************
		WebElement list1= driver.findElement(By.xpath(".//*[@id='recommend_text']/table/tbody/child::tr/td[2]"));
		System.out.println(list1.getText());
			
				
		driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).clear();
		driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("nikita");
		driver.findElement(By.xpath("//*[contains(@class,'checkavail')]")).click();
		System.out.println("                 available combination are");
		
		List<WebElement> list2 =driver.findElements(By.xpath(".//*[@id='recommend_text']/table/tbody/tr[1]//following::input"));
				for(WebElement cnt:list2)
			{
		          System.out.println(cnt.getAttribute("value"));
			}
		
		
		//********************keyword "starts-with:**************
		driver.findElement(By.xpath("//*[starts-with(@name,'passwd')]")).sendKeys("monica");   
		//@type='password' and
		
		//*******************keyword "and"
		 driver.findElement(By.xpath("/.//*[@id='tblcrtac']/tbody/tr[11]/td[3]/input")).sendKeys("mona");
	// if have alternate email id
	 driver.findElement(By.xpath(".//input[starts-with(@name,'altemail3e')]")).sendKeys("monica.somani@seedinfotech.com");
	
		
	 // if dont have afternate email select check box
		
	 Select Ccode= (Select) driver.findElement(By.xpath(".//*[@id='div_mob']/table/tbody/tr/td[3]/div[2]"));
	 Ccode.selectByVisibleText("+91");
	 
	 driver.findElement(By.xpath(".//*[@id='mobno']")).sendKeys("asdfghhjjj");  //alpha input in mobl field
	 
		//method 3 not properly working
		//WebElement tp =driver.findElement(By.xpath(".//*[@id='tsf']/child::li"));
		//System.out.println(tp.getText());
	
		
	}	
		
	}

