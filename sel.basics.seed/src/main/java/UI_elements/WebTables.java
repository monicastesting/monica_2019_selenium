package UI_elements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("Size of rows"+rows.size());
		
		List<WebElement> cols=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Size of colm"+cols.size());
		//int rc=rows.size();
		//int cc=cols.size();
		
		
		//String expName=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[2]/td[1]/a"));
		//System.out.println("expected company");
		String expName="Urja Global";
		int flag=0;
		for(int i=1;i<10;i++)
		{
			List<WebElement> cols1=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]/a"));
			String curName=cols1.get(0).getText();
			if(expName.contentEquals(curName))
					
			{
				System.out.println("Row number is :"+i);
				flag=1;
				
				for(int c1=1;c1<=cols1.size();c1++)
				{
					System.out.print(driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[" +c1+ "]")).getText());
				}
				
				break;
			}
			if(flag==0)
			{
				System.out.println("Company does not exist");
			}
		}
		driver.close();
	}


	

}
