package testcasses;

import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PaymentManager 
{
	
  @Test
  public void applyDiscount() 
  {
	  System.out.println("applyDiscount");
  }
  
  @Parameters({"action"})
  @Test
  public void makePayment(String paymentType, ITestContext context) 
  {
	 // System.out.println("makePayment");
	  if(paymentType.equals("electronic media"))
		  System.out.println("Making payment through electronic media");
	  else
		  System.out.println("Making payment through pay@hotel");
	  
	  //Booking ID
	  String bookingID = "RRR25032022";
	  System.out.println("Booking ID : " +bookingID );
	  context.setAttribute("bID", bookingID);
  }
  
}
