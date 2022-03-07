package project;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_001 extends BaseTest
{
 
  @BeforeMethod
  @Parameters("browser")
  public void startprocess(String bType) throws Exception
  {
	  System.out.println("beforeMethod");
	    init();
		test = rep.createTest("TNG_001");
		test.log(Status.INFO, "Init the properties files....");
				
		launcher(bType);
		test.log(Status.INFO, "Opening the browser :-" + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigate to url : " + childProp.getProperty("amazonurl"));
  }
  
  @Test
  public void amazon() 
  {
	  System.out.println("f test");
	    selectOption("amazondropbox_id","Books");
		test.log(Status.FAIL, "Selecting the Option Books By using locator :-" + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","Harry Potter");
		test.log(Status.PASS, "Enter the text Harry Potter By using locator :-" + orProp.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS, "Clicked on Element By using Locator : - " + orProp.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod
  public void endProcess() 
  {
	  System.out.println("afterMethod");
	  rep.flush();
	  driver.quit();
  }

}
