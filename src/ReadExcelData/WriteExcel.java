package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Selenium Files\\ExcelData\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);	//sheet index
		sheet1.getRow(0).createCell(2).setCellValue("Pass");	//creating and writing to cell
		sheet1.getRow(1).createCell(2).setCellValue("Failed");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		System.out.println("Passed");
		wb.close();
	}

}
