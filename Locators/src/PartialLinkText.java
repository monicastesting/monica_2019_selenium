import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		

		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		
		//driver.get("www.gmail.com"); 
         //This will generate error as the protocol is not mentioned in the name.
		
		
		driver.get("https://www.google.co.in");
		driver.findElement(By.partialLinkText("ma")).click();
		driver.close();

	
}
                                                                                                                          
	

}
