package testcases;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import keywords.ApplicationKeyword;

public class BaseTest 
{
	public ApplicationKeyword app;
	
	@BeforeTest
	public void beforeTest(ITestContext context) throws Exception
	{
		System.out.println("beforeTest");
		app = new ApplicationKeyword();
		context.setAttribute("app", app);
		
	}
	
	@BeforeMethod
	public void BeforeMethod(ITestContext context)
	{
		System.out.println("BeforeMethod");
		app = (ApplicationKeyword)context.getAttribute("app");
	}

}
