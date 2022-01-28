package hdfc.loans.carloans;

public class ICICI implements Rbi
{
	
	public static void main(String[] args) {
		ICICI i = new ICICI();
		i.deposit();
		i.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("iam withdrawl overriden in ICICI");
	}

	@Override
	public void deposit() {
		System.out.println("iam deposit overriden in ICICI");
	}

}
