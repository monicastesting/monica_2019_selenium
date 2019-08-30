import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class passingdatetowebpage_1 {

	public static void main(String[] args) throws IOException {
		
		 FileInputStream f1= new  FileInputStream("C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\orange_login.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet sh = wb.getSheetAt(0);
		XSSFRow rw;
		XSSFCell un, pwd;
		
		un=sh.getRow(1).getCell(0);
		pwd=sh.getRow(1).getCell(1);
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys(un.toString());
		driver.findElement(By.id("password")).sendKeys(un.toString());
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/")).click();
		
		driver.findElement(By.id("login1")).clear();
		driver.findElement(By.id("password")).clear();
		
		
		//For writing into the file.
        FileOutputStream fo = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\orange_login.xlsx");
		
		XSSFCell status = sh.getRow(0).createCell(2);
		status.setCellValue("Status");
		wb.write(fo);
		wb.close();
	
		driver.close();
	}

}
