package calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calender_handling {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.thepancard.com/newpancard.php");
		driver.findElement(By.xpath("html/body/div[3]/div[3]/form/div[2]/div/div/span")).click();
		//html/body/div[5]/ul/li[1]/div/div[1]/table/thead/tr[2]/th[1]
		//html/body/div[5]/ul/li[1]/div/div[1]/table/tbody/tr[5]/td[1]
		//html/body/div[5]/ul/li[1]/div/div[1]/table/tbody/tr[1]/td[1]
		//html/body/div[5]/ul/li[1]/div/div[1]/table/tbody/tr[1]/td[2]
		
		String b4xpath ="html/body/div[5]/ul/li[1]/div/div[1]/table/tbody/tr[";
		String aftxpath ="]/th[";
		
		/* String day = null,month = null,year = null;
		 
		String datesample = "31-December-2017"; 
	     String datearry[] = datesample.split("-");
	     
	     for(String s2:datearry)
	     {    day = datearry[0];
	           month = datearry[1];
	          year = datearry[2];
	    	
	     }*/
	    
		for (int rowcnt=2; rowcnt<=7;rowcnt++)
		{ for (int colcnt=1;colcnt<=7;colcnt++)
		    {
			  //String finalpath=b4xpath+rowcnt+aftxpath+colcnt;
			/*  String datedata= driver.findElement(By.xpath("html/body/div[5]/ul/li[1]/div/div[1]/table/tbody/tr["
					  +rowcnt
					  +"]/th["
					  +colcnt
					  +"]")).getText();*/
			 String Monica=driver.findElement(By.xpath("html/body/div[5]/ul/li[1]/div/div[1]/table/tbody/tr[1]/td[2]")).getText(); 
			System.out.println(Monica);
		    }
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
