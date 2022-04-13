package testcases;

import org.testng.annotations.Test;

public class Session extends BaseTest
{
	
  @Test
  public void doLogin() 
  {
	  System.out.println("doLogin");
	  app.openBrowser("chromebrowser");
	  app.navigate("rediffurl");
	  //app.click("signin_linktext");
	 // app.type("useremail_id", "rediffuser");
	 // app.type("userpassword_id", "rediffpassword");
	 // app.click("submit_id");
  }
  
  @Test
  public void doLogout() 
  {
	  System.out.println("doLogout");
  }
}
