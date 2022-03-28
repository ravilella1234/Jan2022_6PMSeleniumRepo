package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderByColumnName 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\ravi\\Desktop\\testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = null;
		
		int cellIndex = 0;
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals("Password"))
				cellIndex=i;
		}
		
		row = sheet.getRow(2);
		cell = row.getCell(cellIndex);
		String str = cell.getStringCellValue();
		System.out.println(str);
		
		wb.close();
		fis.close();
	}

}
