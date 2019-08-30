import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Select s;
		Select s1;
		Select s2;
		s=new Select(driver.findElement(By.cssSelector("select[name*='Day']")));
		s1=new Select(driver.findElement(By.cssSelector("select[name*='Mont']")));
				//xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]")));
		s2= new Select(driver.findElement(By.cssSelector("select[name*='DOB_Year']")));
		//s.selectByIndex(5);
		
		s.selectByVisibleText("03");     //day
		s1.selectByValue("04");           //month
		s2.selectByIndex(11);             //year
		
		List<WebElement> opt= s.getOptions();
		List<WebElement> opt1= s1.getOptions();
		List<WebElement> opt2= s2.getOptions();
		//to get or print all the options from the list.
		
		for(WebElement op:opt)
		{
			System.out.print(op.getText()+" ");  
			//to print inner html of all the tags.
		} 
		System.out.println(" ");
		for(WebElement op1:opt1)
		{
			System.out.print(op1.getText()+" ");  
			//to print inner html of all the tags.
		} 
		System.out.println(" ");
		for(WebElement op2:opt2)
		{
			System.out.print(op2.getText()+" ");  
			//to print inner html of all the tags.
		} 
		System.out.println(" ");
		
		
		//System.out.println(s.getFirstSelectedOption());  
		//to print the first selected option from list.
		driver.close();

	}

}
