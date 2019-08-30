package UI_elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Alert;
public class Alert1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		
		//driver.get("http://jsbin.com/usidix/1");
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath(".//*[@id='Register']")).click();
		Alert alt = driver.switchTo().alert();
		 		
		//to transfer the control from main window to alert window
		
		System.out.println(alt.getText());
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
			System.out.println("Exeption is: "+e);
		}
		
		
	
		alt.accept();  //to click on ok
		//a.dismiss();   //to click on cancel
		driver.close();
	}

	}


