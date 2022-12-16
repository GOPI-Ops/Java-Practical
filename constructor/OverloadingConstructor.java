package constructor;

public class OverloadingConstructor
{
	OverloadingConstructor()
	{
		System.out.println("Bike is created");
	}
	OverloadingConstructor(int a)
	{
		System.out.println("gopi");
		System.out.println("************");	
	}
	OverloadingConstructor(int a,int b)
	{
		System.out.println("chandiran");
		System.out.println("************");	
	}
	public static void main(String args[])
	{
		OverloadingConstructor a = new OverloadingConstructor();
		OverloadingConstructor b = new OverloadingConstructor(1);
		OverloadingConstructor c = new OverloadingConstructor(1,2);
		
	}
	

}
