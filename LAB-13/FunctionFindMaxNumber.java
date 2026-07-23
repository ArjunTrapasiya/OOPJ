//  WAP to find maximum number from given three numbers using method.

import java.util.*;

public class FunctionFindMaxNumber
{
	public static void main(String[] s)
	{
		max();
	}

	public static void max()
	{
		Scanner scnr=new Scanner(System.in);

		int a,b,c,d;

		System.out.print("Enter 1st Number: ");
		a=scnr.nextInt();
		System.out.print("Enter 2nd Number: ");
		b=scnr.nextInt();
		System.out.print("Enter 3rd Number: ");
		c=scnr.nextInt();
		System.out.println();

		if(a>b && a>c)
		{
			System.out.println("1st Number is Max Number.");
		}
		else if(b>a && b>c)
		{
			System.out.println("2nd Number is Max Number.");
		}
		else if(c>a && c>b)
		{
			System.out.println("3rd Number is Max Number.");
		}
		else if(a==b && b>c)
		{
			System.out.println("1st and 2nd Numbers are Equal and Higher than 3rd Number.");
		}
		else if(a==c && a>b)
		{
			System.out.println("1st and 3rd Numbers are Equal and Higher than 2nd Number.");
		}
		else if(b==c && b>a)
		{
			System.out.println("2nd and 3rd Numbers are Equal and Higher than 1st Number.");
		}
		else
		{
			System.out.println("All Numbers Are Same.");
		}
	}
}
