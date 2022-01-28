package hdfc.loans.eduloans;

public class VariableTypes 
{
	//primitive variable
	int x = 100; //instance (or) non-static (or) global variable
	static String cname = "vmware"; //static (or) static-global variable
	static VariableTypes obj = new VariableTypes();
	
	public void m1()
	{
		int x = 200; // local variable
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void m2()
	{
		//obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);
	}
	
	public static void main(String[] args)
	{
		//obj = new VariableTypes(); // reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);		
	}

}
