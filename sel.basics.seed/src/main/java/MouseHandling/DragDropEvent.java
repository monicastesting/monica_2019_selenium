package MouseHandling;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropEvent {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty( "webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://jqueryui.com/"); 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Droppable")).click();
		Thread.sleep(3000);
		List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
		System.out.println(iframes.size());
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));  //tagname.classname
		
		driver.switchTo().frame(0);
		
		//.frame(0);  //this is alternate method to switch the frame byb locating the indexNo of it from list.
		//to navigate control from outer frame to inner. i.e. from outer html tag to inner html tag.
		
		WebElement drag= driver.findElement(By.id("draggable"));
		System.out.println(driver.findElement(By.xpath(".//*[@id='draggable']")));
		WebElement drop= driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		System.out.println(driver.getTitle());
		//driver.quit();
		
	}

}
