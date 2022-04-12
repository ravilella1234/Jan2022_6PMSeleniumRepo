package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}

}
