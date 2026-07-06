// WAP to find whether the given number is prime or not without using function.

import java.util.*;

public class Prime
{
	public static void main(String[] s)
	{
		Scanner scnr = new Scanner(System.in);

		int n,i,f=0;

		System.out.print("Enter Number:");
		n=scnr.nextInt();

		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				f++;
			}
		}
		if(f==2)
		{
			System.out.print("Number Is Prime");
		}
		else
		{
		System.out.print("Number Is Not Prime");
		}
	}
}