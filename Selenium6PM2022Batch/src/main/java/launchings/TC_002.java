package launchings;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launcher("firefoxbrowser");
		navigateUrl("bestbuyurl");
	}

}
