import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String args[]) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jobserve.com");
		
		System.out.println("the title is: "+driver.getTitle());
		
		driver.findElement(By.xpath(".//*[@id='SPBApplyBtn']")).click();
				 //.//*[@id='SPBApplyBtn']
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		String mw = i.next();
		String cw = i.next();
		
		driver.switchTo().window(cw);
		System.out.println(driver.getTitle());
		
		driver.close(); 
		
		//closes the current handled window or the child window. The main window still remains opened.
		//driver.quit(); 
		//closes all the windows. closes all the instances of windows of its own.
	}

	}


