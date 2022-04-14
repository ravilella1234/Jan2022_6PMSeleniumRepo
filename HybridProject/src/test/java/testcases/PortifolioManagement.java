package testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class PortifolioManagement extends BaseTest
{
  
  @Test
  public void createPortifolio() 
  {
	  test.log(Status.INFO, "Creating Portifolio....");
	  System.out.println("createPortifolio");
  }
  
  @Test
  public void modifyPortifolio() 
  {
	  System.out.println("modifyPortifolio");
  }
  
  @Test
  public void deletePortifolio() 
  {
	  System.out.println("deletePortifolio");
  }
  
}
