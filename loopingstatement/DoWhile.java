package loopingstatement;

public class DoWhile
{

	private static int intsum;
	private static Object sum;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0; 
		do 
		{ // sum 0, 1,3,6,10,,15,21,28,,36,45,55
			// I =1 ,2,3,4,5,6,7,8,9,10,11
			sum = sum + i;
			i++;
			}while (i<=10);
		System.out.println("\n\n\tThe sum of 1 to 10 is .. " + sum);
		
	}

}
