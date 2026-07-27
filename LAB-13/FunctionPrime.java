//  WAP to accept a number and check whether the number is prime or not. Use method name check (int n). The method returns 1, if the number is prime otherwise, it returns 0.

import java.util.*;

public class FunctionPrime
{
	public static void main(String[] s)
	{
		Scanner scnr=new Scanner(System.in);

		int n,ans;

		System.out.print("Enter A Number: ");
		n=scnr.nextInt();
		ans=prime(n);
		if(ans==0)
		{
			System.out.println("Number is Not Prime.");
		}
		else
		{
			System.out.println("Number is Prime.");
		}
	}

	public static int prime(int n)
	{
		int i,flag=0;

		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				flag++;
			}
		}

		if(flag==2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}