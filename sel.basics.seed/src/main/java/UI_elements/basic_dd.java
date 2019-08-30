package UI_elements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class basic_dd {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Select s;
		s=new Select(driver.findElement(By.cssSelector("select[name*='Day']")));
		
		s.selectByVisibleText("03");     //day
		
		List<WebElement> opt= s.getOptions();
		for(WebElement op:opt)
		{
			System.out.print(op.getText()+" ");  
			//to print inner html of all the tags.
		} 
		System.out.println(" ");
		driver.close();
	}

}
