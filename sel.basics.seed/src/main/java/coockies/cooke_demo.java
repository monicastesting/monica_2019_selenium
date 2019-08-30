package coockies;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cooke_demo {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com");
		Set<Cookie> cks = driver.manage().getCookies();
		
		for(Cookie ck:cks)
		{
			System.out.println("Name  "+ck.getName());
			System.out.println("Domain  "+ck.getDomain());
			System.out.println("Path  "+ck.getPath());
			System.out.println("Value  "+ck.getValue());
			System.out.println("Class  "+ck.getClass());
			System.out.println("Expiry "+ck.getExpiry());
		}
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("bela.joshi@seedinfotech.test");
		driver.findElement(By.id("Password")).sendKeys("Tosca1234!");
		driver.findElement(By.cssSelector("input[value^='Log']")).click();
		
		System.out.println("--------------------------------------------");
		System.out.println("After Login");
        Set<Cookie> cookies = driver.manage().getCookies();
		
		for(Cookie ck:cookies)
		{
			System.out.println("Name"+ck.getName());
			System.out.println("Domain"+ck.getDomain());
			System.out.println("Path"+ck.getPath());
			System.out.println("Value"+ck.getValue());
			System.out.println("Class"+ck.getClass());
			System.out.println("Expiry"+ck.getExpiry());
		}


	}

}
