package FileHandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PassingExcelDataTOWebpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\orange_login_july19.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet sh = wb.getSheetAt(0);
		//XSSFRow rw;
		XSSFCell un, pwd;
		
		un=sh.getRow(1).getCell(0);
		pwd=sh.getRow(1).getCell(1);
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1:8080/orangehrm/symfony/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//String username1 = sh.getRow(1).getCell(0).getStringCellValue();
		//String password1=sh.getRow(1).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath(".//*[@id='divUsername']/input")).sendKeys(un.toString());
				
		//.sendKeys(un.toString());
		driver.findElement(By.xpath(".//*[@id='divPassword']/input")).sendKeys(pwd.toString());
		driver.findElement(By.id ("btnLogin")).click();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='divUsername']/input")).clear();
	     driver.findElement(By.xpath(".//*[@id='divPassword']/input")).clear();
		
		
		//For writing into the file.
        FileOutputStream fo = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\orange_login_july19.xlsx");
		
		XSSFCell status = sh.getRow(0).createCell(2);
		status.setCellValue("Status");
		wb.write(fo);
		wb.close();
		
		
		driver.close();
	
	}

}
