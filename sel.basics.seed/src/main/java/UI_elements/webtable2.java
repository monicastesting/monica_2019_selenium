package UI_elements;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		

		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("Size of rows"+rows.size());
		
		List<WebElement> cols=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Size of colm"+cols.size());
		//int rc=rows.size();
		//int cc=cols.size();
		WebElement monica= driver.findElement(By.xpath(".//*[@id='leftcontainer']/table"));
		for(int i=1;i<10;i++)
		{     String expnm="Naysaa Securities ";
		
		     //List<WebElement> rows_table = driver.findElements(By.tagName("tr"));
		    // for(int m=0;m<=cols.size();m++)
		
			List<WebElement> colm= driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td"));
			String curName=colm.get(0).getText();
			if(expnm.contentEquals(curName))
			{
				System.out.println("Row number is :"+i);
			        for(WebElement op:colm)
	                {        System.out.print(op.getText()+" ");
	                }	
		    }System.out.println("");
		}
		
	}
	
	//*[@id='leftcontainer']/table/tbody/tr
}
