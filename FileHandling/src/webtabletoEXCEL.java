import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtabletoEXCEL {

	public static void main(String[] args) throws IOException { 
		WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//.//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]
		//.//*[@id='leftcontainer']/table/tbody/tr[2]/td[1]
		//.//*[@id='leftcontainer']/table/tbody/tr[7]/td[1]
		//String b4xpath = "//*[@id='leftcontainer']/table/tbody/tr[";
		//String aftrxpath ="]/td[1]/a";
		
		FileInputStream f11 = new FileInputStream("C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\MONEY1.xlsx");
		XSSFWorkbook wrkbk = new XSSFWorkbook(f11);
		XSSFSheet sh = wrkbk.createSheet();
		XSSFCell cell;
		XSSFRow row1;
		

		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("Size of rows"+rows.size());
		
		List<WebElement> cols=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Size of colm"+cols.size());
		
		
	
		List<WebElement> tbldata = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tr"));
		int rcount= tbldata.size();
		System.out.println("row count at beginning:" +rcount);
		
		WebElement row = driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[1]"));
		//WebElement col = driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr[1]/td[1]"));
		
				
		for(int i=1;i<=10;i++)
		{ row1= sh.createRow(i);
			for(int j=1;j<=5;j++)
		  {
				WebElement col = driver.findElement(By.xpath("html/body/div[1]/div[5]/table/tbody/tr["+i+"]/td["+j+"]"));
		
		        //System.out.println(col.getText());
		        XSSFCell status = sh.getRow(i).createCell(j);
				status.setCellValue(col.getText());
				FileOutputStream fo = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\MONEY1.xlsx");
				wrkbk.write(fo);
				//putresultstoreport(wb);
			
		}
			
		}wrkbk.close();
	}

	private static void putresultstoreport(XSSFWorkbook wb) throws IOException {
		// TODO Auto-generated method stub
		//F
	}
}
