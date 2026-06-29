// WAP to find out largest number from given three numbers without using Logical Operator.

import java.util.*;

public class MaxNumberFind
{
	public static void main()
	{
		Scanner scnr= new Scanner(System.in);

		int a,b,c;

		System.out.print("Enter First Number: ");
		a=scnr.nextInt();
		System.out.print("Enter Second Number: ");
		b=scnr.nextInt();
		System.out.print("Enter Third Number: ");
		c=scnr.nextInt();

		if(a>b)
		{
			if(a>c)
			System.out.println("A Is Max.");
			else
			System.out.println("C Is Max.");
		}
		else if(b>a)
		{
			if(b>c)
			System.out.println("B Is Max.");
			else
			System.out.println("C Is Max.");
		}
		else
			System.out.println("All Numbers Are Same.");
	}
}