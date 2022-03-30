package excelOperations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class FaceBookFinalVersion 
{
	WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() 
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
  }
  
  @DataProvider
  public Object[][] getData() throws Exception 
  {
	  ExcelAPI e = new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
	  String sheetName = "data";
	  String testCaseName = "LoginTest";
      return DataUtils.getTestData(e, sheetName, testCaseName);
  }
  
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> h) throws Exception
  {
	  if(h.get("RunMode").equals("N"))
	  {
		  throw new SkipException("Test is skipped due to Runmode No....");
	  }
	  else
	  {
		  driver.findElement(By.id("email")).sendKeys(h.get("UserName"));
		  driver.findElement(By.id("pass")).sendKeys(h.get("UserPassword"));
	  }
	  Thread.sleep(3000);
  }

  @AfterMethod
  public void afterMethod()
  {
	 // driver.quit();
  }  
}
