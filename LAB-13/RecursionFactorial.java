// WAP to find the factorial of given number using recursion

import java.util.*;

public class RecursionFactorial
{
	public static void main(String[] s)
	{
		Scanner scnr=new Scanner(System.in);
		int n;
		System.out.println("Enter The Number: ");
		n=scnr.nextInt();
		int factorial=f(n);
		System.out.println(factorial);
	}

	public static int f(int n)
	{
		int f=1;
		if(n!=1)
		{
			f=n*f(n-1);
			return f;
		}
		else
		  return f;
	}
}