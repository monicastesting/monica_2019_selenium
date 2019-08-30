/**
 * 
 */
package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Administrator==monicasomani
 *
 */
public class static_webTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//driver.get("https://www.w3schools.com/html/html_tables.asp");

		// for getting single cell value
		//String innerText = driver.findElement(By.xpath("html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[1]/th[1]")).getText(); 	
		 //       System.out.println(innerText); 
		
		//for getting entire table data
		        driver.get("C:\\Users\\Administrator\\Desktop\\nested table.html");
		        for(int i=2;i<=3;i++)
		        {  for(int j=0;j<=2;j++)
		        {
		         	List<WebElement> nwt = driver.findElements(By.xpath("//html/body/table/tbody/tr/td["+i+"]/table/tbody/tr["+j+"]/td"));
		            //System.out.println(nwt.size());
		       
		            for(WebElement count:nwt)
		              { System.out.println(count.getText());
		              }
		        } }
		        driver.quit();
		
		
		
		
	}

}
