import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingValue {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\orange_login_july19.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet sh = wb.getSheetAt(0);
		XSSFRow rw;
		XSSFCell un,pwd;
		
		System.out.println(sh.getPhysicalNumberOfRows());
		System.out.println(sh.getRow(0).getLastCellNum());
		
		for(int i=0;i<sh.getLastRowNum();i++)
		{
			un=sh.getRow(i).getCell(0);
			System.out.println(un);
			pwd=sh.getRow(i).getCell(1);
			System.out.println(pwd);
			System.out.println();
		}
		
		FileOutputStream fo = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\monica_2019_selenium\\orange_login_july19.xlsx");
		
		XSSFCell status = sh.getRow(0).createCell(0);
		status.setCellValue("Status");
		wb.write(fo);
		wb.close();
		
	}


	}


