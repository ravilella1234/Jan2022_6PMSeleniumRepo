package excelOperations;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementwithHashTable 
{
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> h) 
  {
	  
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e = new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testCaseName = "TestA";
		
		int testStartRowNum = 0;
		while(!e.getCellData(sheetName, 0, testStartRowNum).equals(testCaseName))
		{
			testStartRowNum++;
		}
		System.out.println("Test start from :" + testStartRowNum);
		
		int colStartRowNum = testStartRowNum+1;
		int dataStartRowNum = testStartRowNum+2;
		
		
		//calculate rows of data
		int rows = 0;
		while(!e.getCellData(sheetName, 0, dataStartRowNum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("Total rows are :" +  rows);
		
		
		//calculate cols of data
		int cols = 0;
		while(!e.getCellData(sheetName, cols, colStartRowNum).equals(""))
		{
			cols++;
		}
		System.out.println("Total cols are : " + cols);
		
		
		//Read the Test data
		int dataRow =0;
		
		Object[][] data = new Object[rows][1];
		Hashtable<String, String> table = null;
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++)
		{
			table = new Hashtable<String, String>();
			for(int cNum=0;cNum<cols;cNum++)
			{
				//System.out.println(e.getCellData(sheetName, cNum, rNum));
				//data[dataRow][cNum] = e.getCellData(sheetName, cNum, rNum);
				String keys = e.getCellData(sheetName, cNum, colStartRowNum);
				String values = e.getCellData(sheetName, cNum, rNum);
				table.put(keys, values);
			}
			data[dataRow][0]=table;
			dataRow++;
		}
		return data;
  }
}
