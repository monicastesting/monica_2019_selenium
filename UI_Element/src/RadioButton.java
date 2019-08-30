import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		List<WebElement> radios= driver.findElements(By.cssSelector("input[name^='gender']"));
		System.out.println("size of radio ="+radios.size());
		//radios.get(1);
		
		for(WebElement r:radios)
		{
			String value= r.getAttribute("value");
			System.out.println(value);
			System.out.println(" ");
			if(value.equalsIgnoreCase("f"))
			{   if(r.isSelected())
			     {
				   System.out.println("sel");
			     }
				//+ System.out.println(r.getText());
				r.click();
			}
		}
		driver.close();

	}

}
