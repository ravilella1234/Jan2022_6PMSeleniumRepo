package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class MyTestListener implements ITestListener
{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		ExtentTest test = (ExtentTest)result.getTestContext().getAttribute("test");
		test.log(Status.PASS, "Test Passed : "+result.getName());
	}

	public void onTestFailure(ITestResult result) 
	{
		//System.out.println(result.getThrowable().getMessage());
		ExtentTest test = (ExtentTest)result.getTestContext().getAttribute("test");
		test.log(Status.FAIL, result.getThrowable().getMessage());
	}

	public void onTestSkipped(ITestResult result) 
	{
		ExtentTest test = (ExtentTest)result.getTestContext().getAttribute("test");
		test.log(Status.SKIP, "Test Skipped : "+ result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
