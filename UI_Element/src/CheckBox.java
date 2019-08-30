import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement cb=driver.findElement(By.id("remember"));
		
		if(cb.isDisplayed())
		{
			if(cb.isEnabled())
			{
				if(cb.isSelected())
				{
					System.out.println("Already selected");
				}
				else
				{
					System.out.println(" not Selected");
					cb.click();
				}
			}
		}
		driver.close();

	}

}
