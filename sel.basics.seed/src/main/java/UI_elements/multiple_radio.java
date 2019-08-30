package UI_elements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiple_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.jobserve.com/in/en/JobSearch.aspx?shid=23CBF1D8027CAD94E8&js=1&jsdiag=1");
		
		List<WebElement> radio11s= driver.findElements(By.cssSelector("input[name^='RDOJOBTYPE']"));
		
		System.out.println("size of radio ="+radio11s.size());
		//.//*[@id='leftcontainer']/table/tbody/tr[3]/td[1]/a
		//.//*[@id='JobType']/div[2]/div[3]/label[1]
		//.//*[@id='JobType']/div[2]/div[4]/label[1]
		
		
		List<WebElement> radio1s= driver.findElements(By.xpath(".//*[@id='JobType']/div[2]/div/label[1]"));
		for(WebElement op:radio1s)
		{
			System.out.println(op.getText()+" ");  
			//to print inner html of all the tags.
		} 
		
		
	
		
		
	}

}
