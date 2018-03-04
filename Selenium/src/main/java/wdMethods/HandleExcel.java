package wdMethods;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandleExcel {
	public Object[][] excelHandle() throws IOException { 
		XSSFWorkbook wBook = new XSSFWorkbook("./data/LeadsApp.xlsx");
		XSSFSheet sheet = wBook.getSheet("Lead");
		int rowCount = sheet.getLastRowNum();
		XSSFRow hRow = sheet.getRow(0);
		short cellCount = hRow.getLastCellNum();
		Object[][] dataObj = new Object[rowCount][cellCount];
		for(int i = 1 ; i<= rowCount ;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j = 0 ; j< cellCount ; j++)
			{
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				//System.out.println(stringCellValue);
				dataObj[i][j]=stringCellValue;
			}
		}
		wBook.close();
		return dataObj;
	}
}
