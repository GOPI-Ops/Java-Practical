package controlstatement;

import java.util.Scanner;

public class IfElseStatement
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int marks;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your Marks:");
		marks=in.nextInt();
		if(marks>=36)
		{
			System.out.println("You are Pass.");
		}
		else
		{
			System.out.println("You are Fail.");
		}

	}

}
