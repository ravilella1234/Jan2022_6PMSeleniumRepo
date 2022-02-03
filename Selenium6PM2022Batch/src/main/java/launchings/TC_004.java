package launchings;

public class TC_004 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launcher("firefoxbrowser");
		navigateUrl("certificateurl");
	}

}
