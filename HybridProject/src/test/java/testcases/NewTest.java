package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest 
{
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) 
  {
	  
  }
  
  @Test(dataProvider = "dp")
  public void g(Integer n, String s) 
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
	  Object[][] obj = new Object[3][2];
	  
	  obj[0][0]=10;
	  obj[0][1]="ravi";
	  
	  obj[1][0]=30;
	  obj[1][1]="sai";
	  
	  obj[2][0]=50;
	  obj[2][1]="kiran";
	  
	return obj;
    
  }
}
