
package mousehandling;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Administrator
 *
 */
public class hoveringOrangrHRM {

	/**
	 * @param args
	 * @param Mainmenu 
	 * @param Mainmenu 
	 */
	public static void main(String[] args ) {
		
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("http://127.0.0.1:8080/orangehrm/symfony/web/index.php/auth/login");
		driver.get("https://www.google.com");
		/*driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("seedadmin");
		dri*/
		//ver.findElement(By.id("btnLogin")).click();

		//System.out.println("Welcome to OrangeHRM...:admin, pim,leave,time, recruitment, performance dashboard, directory");
		System.out.println("Enter your option");
		Scanner s=new Scanner(System.in);  //In Java, we take input from user with the help of Scanner class. 
		String googlesearch;
		googlesearch=s.nextLine();
		String opoption = googlesearch.toUpperCase();
		System.out.println(opoption);
		System.out.println("THE search results ARE : ");
		WebElement topic=driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input"));
		topic.sendKeys(opoption);

		Actions act= new Actions(driver);
		act.moveToElement(topic).build().perform();
        //METHOS 1
		
		//WebElement eg =driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div/div[2]/div[2]/ul/li"));	
		//System.out.println(eg.getText());
		             // **********BOTH GIVING SAME RESULT**********8
		// METHOD 2    
		List<WebElement> RESULT = driver.findElements(By.xpath("html/body/div[1]/div[3]/form/div[2]/div/div[2]/div[2]/ul/li"));
			
			for(WebElement menus:RESULT)
			{
				System.out.println(menus.getText());
			}
		
	}}

