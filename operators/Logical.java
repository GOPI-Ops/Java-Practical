package operators;

public class Logical
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=15;
		int d=20;
		System.out.println("Value of a "+a);
		System.out.println("Value of b "+b);
		System.out.println("Value of c "+c);
		System.out.println("Value of d "+d);
		// false true false
		boolean result = !((a<b) || (c>d));
		System.out.println(result);

	}

}
