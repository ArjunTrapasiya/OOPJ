//  Write a method with following method header: public int gcd (int num1, int num2). Write a program that prompts the user to enter two integers and compute the gcd of two integers. [Note: The greatest common divisor (GCD) of two numbers is the largest number that divides them both.]

import java.util.*;

public class FunctionGcd
{
	public static void main(String[] s)
	{
		Scanner scnr=new Scanner(System.in);
		int a,b;
		System.out.print("Enter 1st Number: ");
		a=scnr.nextInt();
		System.out.print("Enter 2nd Number: ");
		b=scnr.nextInt();
		int ans=gcd(a,b);
		System.out.println(ans);
	}

	public static int gcd(int a, int b)
	{
		int i,gcd1=1,n=1;

		if(n>b)
		{
			n=b;
		}
		else
		{
			n=a;
		}

		for(i=1;i<=n;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd1=i;
			}
		}
		return gcd1;
	}
}