package hdfc.loans.eduloans;

public class TypeCastings 
{

	public static void main(String[] args) 
	{
		//byte-1, short-2, int-4, long-8, float-4, double-8, char-2, boolean
		
		// 1-Liter  --->  500 ml     ---> There is no risk    ---> Widening
		// 1-Liter  --->  1.5 Liter  ---> There is a risk (water will overflow)  ---> Narrowing

		double x = 10.7;
		System.out.println(x);
		int y = (int) x;
		System.out.println(y);
		
		int a =20;
		System.out.println(a);
		double b = (double)a;
		System.out.println(b);
		
		int p = 65;
		System.out.println(p);
		char q = (char) p;
		System.out.println(q);
		
		System.out.println("------------------------");
		
		int x1 = 10;
		System.out.println(x1);
		//Integer x2 = x1;
		Integer x2 = Integer.valueOf(x1);
		System.out.println(x2);
		
		Integer y1 = 20;
		System.out.println(y1);
		//int y2 = y1;
		 int y2 = (int)y1;
		System.out.println(y2);
		
		System.out.println("-------------------------");
		
		String s1 = "417";
		String s2 = "420";
		
		System.out.println(s1+s2);
		
		int p1 = Integer.parseInt(s1);
		int p2 = Integer.parseInt(s2);
		int result = p1+p2;
		System.out.println(result);
		
		float f1 = Float.parseFloat(s1);
		float f2 = Float.parseFloat(s2);
		System.out.println(f1+f2);
				
	}

}
