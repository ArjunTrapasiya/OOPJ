// WAP to find factorial of the given number

import java.util.*;

public class Factorial
{
	public static void main(String[] s)
	{
		Scanner scnr = new Scanner(System.in);

		int ans=1,n,i;

		System.out.print("Enter Number:");
		n=scnr.nextInt();

		for(i=1;i<=n;i++)
		{
			ans=ans*i;
		}
		System.out.print("Factorial Is: "+ans);
	}
}