package tooltip_verify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prog_1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.jobserve.com/in/en/Job-Search/");
		
		WebElement JOBSRV_1=driver.findElement(By.xpath(".//*[@id='lab2']"));
		String actualtooltip= JOBSRV_1.getAttribute("title");
		System.out.println(actualtooltip);
		// tooltip 2		
		WebElement JOBSRV_2=driver.findElement(By.xpath(".//*[@id='lab3']"));
		String actualtooltip1= JOBSRV_2.getAttribute("title");
		System.out.println(actualtooltip1);
		//
		WebElement JOBSRV_3=driver.findElement(By.xpath(".//*[@id='lab4']"));
		String actualtooltip2= JOBSRV_3.getAttribute("title");
		System.out.println(actualtooltip2);
		//
		WebElement JOBSRV_4=driver.findElement(By.xpath(".//*[@id='lab5']"));
		String actualtooltip3= JOBSRV_4.getAttribute("title");
		System.out.println(actualtooltip3);
		
		//tooltip google
		driver.get("https://www.google.com/");
		WebElement google_1= driver.findElement(By.xpath(".//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input"));
		String sangita= google_1.getAttribute("title");
		System.out.println(sangita);
	}

}
