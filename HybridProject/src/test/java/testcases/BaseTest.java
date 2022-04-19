package testcases;

import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import keywords.ApplicationKeyword;
import reportings.ExtentManager;


// acceptable Failures, critical Failures, Unexpected Failures 

public class BaseTest 
{
	public ApplicationKeyword app;
	public static ExtentReports rep;
	public static ExtentTest test;
	
	
	@BeforeTest
	public void beforeTest(ITestContext context) throws Exception
	{
		System.out.println("beforeTest");
		app = new ApplicationKeyword();
		context.setAttribute("app", app);
		
		//init the Reporting for the Test
		rep = ExtentManager.getReports();
		test = rep.createTest(context.getCurrentXmlTest().getName());
		app.setReport(test);
				
		context.setAttribute("report", rep);
		context.setAttribute("test", test);
	}
	
	@BeforeMethod
	public void BeforeMethod(ITestContext context)
	{
		System.out.println("BeforeMethod");
		
		String criticalFailure =  (String)context.getAttribute("criticalFailure");
		if(criticalFailure!=null && criticalFailure.equals("Y"))
		{
			test.log(Status.SKIP, "Critical Failure in Previou Tests");
			throw new SkipException("Critical Failure in Previou Tests");
		}
		
		app = (ApplicationKeyword)context.getAttribute("app");
		rep = (ExtentReports)context.getAttribute("report");
		test = (ExtentTest)context.getAttribute("test");
	}
	
	@AfterTest
	public void quit()
	{
		if(rep!=null)
			rep.flush();
	}

}
