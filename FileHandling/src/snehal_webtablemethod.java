import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class snehal_webtablemethod {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		FileInputStream f11 = new FileInputStream("C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\money.xlsx");
		XSSFWorkbook wrkbk = new XSSFWorkbook(f11);
		XSSFSheet sh = wrkbk.getSheetAt(0);
		XSSFCell cell;
		XSSFRow row1;
		
		//html/body/div[1]/div[5]/table/tbody/tr[6]/td[1]
		for(int i=1;i<11;i++){
			row1= sh.createRow(i);
					
			for(int j=1;j<6;j++){
				WebElement tblcol = driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(tblcol.getText());
				cell=row1.getCell(j);
				//cell= row1.getCell(j, org.apache.poi.ss.usermodel.Row.MissingCellPolicy.RETURN_NULL_AND_BLANK);
				if(cell==null)
				{ cell=row1.createCell(j);
				  cell.setCellValue(tblcol.getText());
				} 
				else
				{ cell.setCellValue(tblcol.getText());
				}
				
			}
		}
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\money.xlsx");
		wrkbk.write(fo);
		fo.close();
		wrkbk.close();
	}

}
