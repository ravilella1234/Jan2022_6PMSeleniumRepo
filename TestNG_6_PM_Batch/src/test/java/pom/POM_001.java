package pom;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class POM_001
{
	WebDriver driver;
	
  @BeforeMethod
  public void startProcess() 
  {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
  }
  
  @Test
  public void login() 
  {
	  LoginPage page = new LoginPage(driver);
	  page.customerLogin();
	  Assert.assertEquals(page.verifyError(), "Authentication failed.");
  }

  @AfterMethod
  public void endProcess()
  {
	  
  }

}
