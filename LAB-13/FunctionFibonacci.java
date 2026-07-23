// WAP to generate Fibonacci series of N given number using method

import java.util.*;

public class FunctionFibonacci
{
	public static void main(String[] s)
	{
		Fibonacci();
	}

	public static void Fibonacci()
	{
		Scanner scnr=new Scanner(System.in);
		int n,i,a=0,b=1,c;
		System.out.print("Enter The Number: ");
		n=scnr.nextInt();
	
		for(i=0;i<n;i++)
		{
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
		}
	}
}