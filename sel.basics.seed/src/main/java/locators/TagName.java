package locators;
 import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagName {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("the no of links on this page are:"+links.size());
		for(WebElement l:links)
		{
			System.out.println(l.getText());
		}
	}

}
