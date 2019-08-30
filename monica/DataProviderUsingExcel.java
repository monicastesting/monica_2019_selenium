package TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsingExcel {
	private WebDriver driver;
	private  FileInputStream fi;
	private XSSFWorkbook wb;
	private    XSSFSheet sh;
	private int j=1;

  @Test(dataProvider = "getData")
  public void loginNewTours(String un, String pwd) {
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.name("userName")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.name("login")).click();
	  String actUrl=driver.getCurrentUrl();
 	 System.out.println(actUrl);
 	 //int j=1;
 	
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

	 }
	 //
  }

  @DataProvider
  public String[][] getData() {
	  String data[][]=new String [sh.getLastRowNum()][sh.getRow(0).getLastCellNum()-1];
		 System.out.println(sh.getRow(0).getLastCellNum()-1);
	  for(int i=0;i<sh.getLastRowNum();i++)
	  {
		  data[i][0]= sh.getRow(i+1).getCell(0).getStringCellValue();
		  data[i][1]= sh.getRow(i+1).getCell(1).getStringCellValue();
		  
	  }
	  
	  return data;
  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  driver = new FirefoxDriver();
	  fi = new FileInputStream("E:\\Ramoli_selenium\\credentials2.xlsx");
	 wb= new XSSFWorkbook(fi);
	 sh = wb.getSheetAt(0);
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  FileOutputStream fo = new FileOutputStream("E:\\Ramoli_selenium\\credentials2.xlsx");
	    wb.write(fo);
	    wb.close();
	  driver.close();
  }

}