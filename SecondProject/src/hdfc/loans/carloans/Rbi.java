package hdfc.loans.carloans;

public interface Rbi 
{
	int x = 100;
	
	public void withdrawl();
	public void deposit();
	
	public static void main(String[] args) 
	{
		//Rbi i = new Rbi();
		
		Rbi i;
		
		i = new ICICI();
		i.deposit();
		i.withdrawl();
		
		i = new HDFC();
		i.deposit();
		i.withdrawl();
	}

}
