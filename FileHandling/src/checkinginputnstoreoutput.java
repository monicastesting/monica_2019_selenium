import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class checkinginputnstoreoutput {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\orange_login_july19.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet sh = wb.getSheetAt(0);
		//XSSFRow rw;
		XSSFCell un,pwd;
		
		System.out.println("total no. of rows::" +sh.getPhysicalNumberOfRows());
		System.out.println("total no of colomn::"+sh.getRow(0).getLastCellNum());
		
		WebDriver driver=new FirefoxDriver();
		//driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8080/orangehrm/symfony/web/index.php/auth/login");
		
		for(int i=0;i<=sh.getLastRowNum();i++)
		{   
			un=sh.getRow(i).getCell(0);
			pwd=sh.getRow(i).getCell(1); 
			
			driver.findElement(By.xpath("//*[@id='divUsername']/input")).sendKeys(un.toString());
			driver.findElement(By.xpath("//*[@id='divPassword']/input")).sendKeys(pwd.toString());
			driver.findElement(By.id ("btnLogin")).click();
			
			
			System.out.println(un+" and  "+ pwd );
			//driver.findElement(By.xpath(".//*[@id='divUsername']/input")).clear();
		//	driver.findElement(By.xpath(".//*[@id='divPassword']/input")).clear();
				
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\orange_login_july19.xlsx");
		String ERMSG =driver.findElement(By.id("spanMessage")).getText();
		System.out.print(" "+ERMSG);
		System.out.println("");
		XSSFCell status = sh.getRow(i).createCell(2);
		status.setCellValue(ERMSG);
		wb.write(fo);
		}
		wb.close();
		driver.close();
		

	}

}