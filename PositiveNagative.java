// WAP to check whether the given number is positive or negative.

import java.util.*;

public class PositiveNagative
{
	public static void main(String[] s)
	{
		Scanner scnr = new Scanner(System.in);

		int n;
		System.out.print("Enter The Number: ");
		n=scnr.nextInt();

		if(n>0)
		{
		 System.out.print("Number Is Positive.");
		}
		else if (0>n)
		{
		 System.out.print("Number Is Negative.");
		}
		else
		System.out.print("Number Is Zero.");

	}
}