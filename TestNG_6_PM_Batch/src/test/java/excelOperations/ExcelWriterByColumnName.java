package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterByColumnName 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\ravi\\Desktop\\testdata1.xlsx");
		FileOutputStream fos =null;
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFFont font = wb.createFont();
		XSSFCellStyle style = wb.createCellStyle();
		XSSFSheet sheet = wb.getSheet("login");
		font.setFontName("Algerian");
		font.setFontHeight(24);
		font.setBold(true);
		style.setFont(font);
		
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = null;
		
	
		int cellIndex = -1;
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals("Result"))
				cellIndex = i;
		}
		
		row = sheet.getRow(3);
		cell = row.getCell(cellIndex);
		cell.setCellStyle(style);
		cell.setCellValue("Aborted");
		fos = new FileOutputStream("C:\\Users\\ravi\\Desktop\\testdata1.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
	}

}
