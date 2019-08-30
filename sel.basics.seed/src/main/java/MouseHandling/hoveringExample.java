package MouseHandling;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class hoveringExample {
	

	public static void main(String[] args)
	{
		System.out.println("Enter your option");
		Scanner s=new Scanner(System.in);
		String opName;
		opName=s.nextLine();
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.istqb.in/");
		
		/*System.out.println("Enter your option");
		Scanner s=new Scanner(System.in);
		String opName;
		opName=s.nextLine();*/
		
		WebElement found = driver.findElement(By.linkText("FOUNDATION"));
		Actions act= new Actions(driver);
		//act.moveToElement(found).perform();
		// perform is mandatory if you dont mention perform it will not perform anything.
		act.moveToElement(found).build().perform();
		List<WebElement> submenus = driver.findElements
				(By.xpath(".//*[@id='tmMainMenu']/nav/div/div[3]/ul/li[3]/div/div/div/ul/li"));
		System.out.println("THE MENUS ARE : ");
		for(WebElement menus:submenus)
		{
			System.out.println(menus.getText());
		}
		
			
		for(WebElement menus:submenus)
		{
			if(menus.getText().equalsIgnoreCase(opName))
			{
				System.out.println("Your option is : "+menus.getText());
				menus.click();
				System.out.println("After clicking the title is :"+driver.getTitle());
				break;
			}
			
			
		}
		
	}}


//.//*[@id='tmMainMenu']/nav/div/div[3]/ul/li[3]/div/div/div[1]/ul/li[1]/a
//.//*[@id='tmMainMenu']/nav/div/div[3]/ul/li[3]/div/div/div[2]/ul/li[1]/a
//.//*[@id='tmMainMenu']/nav/div/div[3]/ul/li[3]/div/div/div[1]/ul/li[5]------------syllabus & resources2018
//.//*[@id='tmMainMenu']/nav/div/div[3]/ul/li[3]/div/div/div[2]/ul/li[2]/ul/li[2]----corporate enrollment
//.//*[@id='tmMainMenu']/nav/div/div[3]/ul/li[3]/div/div/div[1]/ul/li[5]/ul/li[1]/a-----syllabus>> 1st colomn