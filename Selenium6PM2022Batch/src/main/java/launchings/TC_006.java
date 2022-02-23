package launchings;

import com.aventstack.extentreports.Status;

public class TC_006 extends BaseTest
{
	
	
	public static void main(String[] args) throws Exception 
	{
		init();
		test = rep.createTest("TC_006");
		test.log(Status.INFO, "Init the properties files....");
				
		launcher("chromebrowser");
		test.log(Status.INFO, "Opening the browser :-" + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigate to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		test.log(Status.FAIL, "Selecting the Option Books By using locator :-" + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","Harry Potter");
		test.log(Status.PASS, "Enter the text Harry Potter By using locator :-" + orProp.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS, "Clicked on Element By using Locator : - " + orProp.getProperty("amazonsearchbutton_xpath"));		
		
		rep.flush();
				
	}
}
