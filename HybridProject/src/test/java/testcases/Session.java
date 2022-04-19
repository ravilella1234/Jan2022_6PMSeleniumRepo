package testcases;

import org.testng.annotations.Test;

public class Session extends BaseTest
{
	
  @Test
  public void doLogin() 
  {
	 // test.log(Status.INFO, "Logging In....");
	  app.log("Logging In....");
	  app.openBrowser("chromebrowser");
	  app.navigate("rediffurl");
	  app.click("signin_linktext");
	  app.type("useremail_id", "rediffuser");
	  //failure
	  app.reportFailure("Test is Incorrect",true);
	  app.type("userpassword_id", "rediffpassword");
	  app.click("submit_id");
	  app.assertAll();
  }
  
  @Test
  public void doLogout() 
  {
	  //test.log(Status.INFO, "Logging Out....");
	  app.log("Logging Out....");
  }
}
