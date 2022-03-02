package verifications;

import com.aventstack.extentreports.Status;

import launchings.BaseTest;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = rep.createTest("Verify3");
		test.log(Status.INFO, "Init the properties files....");
				
		launcher("chromebrowser");
		test.log(Status.INFO, "Opening the browser :-" + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigate to url : " + childProp.getProperty("amazonurl"));
		
		String expectedLink = "Customer Servic";
		
		if(!isLinkEqual(expectedLink))
			reportFailure("Both links are not equal....");
			//System.out.println("Both links are not eual....");
		else
			reportSuccess("Both links are equal...");
			//System.out.println("Both links are equal...");
		
		rep.flush();
	}

}
