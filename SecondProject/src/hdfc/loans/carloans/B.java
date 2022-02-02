package hdfc.loans.carloans;

public class B extends A  // ISA Relationship
{
	
	
	public void m2()
	{
		System.out.println("iam m2 from B");
	}

	public static void main(String[] args) 
	{
		A a = new A(); // HasA Relationship
		a.m1();
		
		//B b = new B();
		//b.m1();
		//b.m2();
		
		//We can use parent class reference variable to refer/hold child class object.
		A obj = new B();
		obj.m1();
		
		//B obj1 = new A();
	}

}
