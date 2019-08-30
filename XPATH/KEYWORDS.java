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
		// ***************keyword "contains"*********
		//WebElement fullname=driver.findElement(By.xpath("//td[contains(@text(),'Full')]"));
		//System.out.println(fullname.getText());
		
		//driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("dfg");
		//driver.findElement(By.xpath("//*[contains(@class,'checkavail')]")).click();
		
		// ************88keyword "child" result 1st option displayed************
		/*WebElement list1= driver.findElement(By.xpath(".//*[@id='recommend_text']/table/tbody/child::tr/td[2]"));
		System.out.println(list1.getText());
		*/
		
		
		
		driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).clear();
		driver.findElement(By.xpath(".//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("nikita");
		driver.findElement(By.xpath("//*[contains(@class,'checkavail')]")).click();
		WebElement eg1=driver.findElement(By.xpath(".//*[@id='recommend_text']//following::input[2]"));
		System.out.println(eg1.getText());
		//List<WebElement> list2 =driver.findElements(By.xpath(".//*[@id='recommend_text']/table/tbody/tr[1]//following::input"));
//				for(WebElement cnt:list2)
//				{
//		          System.out.println(cnt.getText());
//				}
	//	}.//*[@id='recommend_text']/table/tbody/tr[2]/td[2]
				//.//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]
		
		//********************keyword "starts-with:**************
		//driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]")).sendKeys("mona");    //@type='password' and
		
		//*******************keyword "and"
		//driver.findElement(By.xpath("//*[@id='tblcrtac' and @name,'confirm_passwd3167609a']")).sendKeys("mona");
		
		//WebElement altemail=driver.findElement(By.xpath("//td[starts-with(@text(),'Alternate')"));
		//System.out.println(altemail.getText());
		
		
		//method 3 not properly working
		//WebElement tp =driver.findElement(By.xpath(".//*[@id='tsf']/child::li"));
		//System.out.println(tp.getText());
	}
		
		
		
	}

