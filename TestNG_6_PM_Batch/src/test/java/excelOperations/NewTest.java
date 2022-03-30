package excelOperations;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest 
{
	
  @Test(dataProvider = "testData")
  public void sampleTests(Integer n, String s) 
  {
	  
  }

  @DataProvider
  public Object[][] testData() 
  {
    return new Object[][] 
    {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
