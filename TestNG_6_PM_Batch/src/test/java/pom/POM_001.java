package pom;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project.BaseTest;

public class POM_001 extends BaseTest
{
	
	
  @BeforeMethod
  public void startProcess() throws Exception 
  {
	  init();
	  launcher("chromebrowser");
	  navigateUrl("practiceurl");
  }
  
  @Test(enabled = false)
  public void login() 
  {
	  LoginPage page = new LoginPage(driver);
	  page.customerLogin();
	  Assert.assertEquals(page.verifyError(), "Authentication failed.");
  }
  
  @Test
  public void customerRegistration() throws Exception
  {
	 
	  CustomerRegistrationPage page = new CustomerRegistrationPage(driver);
	  page.customerRegistration();
  }

  @AfterMethod
  public void endProcess()
  {
	  
  }

}
