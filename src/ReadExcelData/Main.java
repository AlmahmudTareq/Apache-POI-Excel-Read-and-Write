package ReadExcelData;

import lib.ExcelDataConfig;

public class Main {

	public static void main(String[] args) {
		ExcelDataConfig ed = new ExcelDataConfig("C:\\Selenium Files\\ExcelData\\TestData.xlsx");
		System.out.println(ed.getData(0, 0, 0));
		System.out.println(ed.getData(1, 0, 1));

	}

}
