package tstng;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	private WebDriver driver;
	private FileInputStream fi;
	private XSSFWorkbook wb;
	private XSSFSheet sh;
	private int j=0;
	
	
	 @Test(dataProvider = "getData")
	  public void loginNewTours(String un, String pwd) { //sequence should be a per the field
		
		  driver.findElement(By.name("userName")).sendKeys(un);
		  driver.findElement(By.name("password")).sendKeys(pwd);
		  driver.findElement(By.name("login")).click();
		  String actUrl=driver.getCurrentUrl();
	 	  System.out.println(actUrl);
	 	 
	 	 if(actUrl.endsWith("mercuryreservation.php"))
		 {
			 sh.getRow(j).createCell(2).setCellValue("Pass");
			 driver.findElement(By.linkText("SIGN-OFF")).click();
			 j++;
			 		 }
	 	 else
		 {
			 sh.getRow(j).createCell(2).setCellValue("Fail");
			  j++;
		 }driver.navigate().back();
		 //
	  }
	 
	 @DataProvider  //only 1 method is compulsory
	  public String[][] getData() {
		  String data[][]=new String [sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
			 System.out.println(sh.getRow(0).getLastCellNum()-1);
		 
		 for(int i=0;i<sh.getLastRowNum();i++)
		  {
			  data[i][0]= sh.getRow(i).getCell(0).getStringCellValue();
			  data[i][1]= sh.getRow(i).getCell(1).getStringCellValue();
			  
		  }
		   return data;
	  
	  }
	 
	 @BeforeTest
	  public void beforeTest() throws IOException {
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		  driver.get("http://newtours.demoaut.com/");
		  try
		  { fi = new FileInputStream("c:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\mercury_login.xlsx");
		  }catch(Exception e)
		  { e.printStackTrace();
			  
		  }
		  wb= new XSSFWorkbook(fi);
		  sh = wb.getSheetAt(0);
		  
	  }

	  @AfterTest
	  public void afterTest() throws IOException {
		  FileOutputStream fo = new FileOutputStream("c:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\mercury_login.xlsx");
		    wb.write(fo);
		    wb.close();
		  driver.close();
	  }
}
