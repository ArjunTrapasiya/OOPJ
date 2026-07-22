// WAP to print numbers between two given numbers which is divisible by 2 but not divisible by 3.

import java.util.*;

public class DivisibleBy2
{
	public static void main(String[] s)
	{
		Scanner scnr = new Scanner(System.in);

		int a,b,i;

		System.out.print("Enter 1st Number:");
		a=scnr.nextInt();
		System.out.print("Enter 2nd Number:");
		b=scnr.nextInt();
		System.out.println("Given Below Numbers Are Divisible By 2 But Not Divisible By 3.");

		for(i=a;i<=b;i++)
		{
			if((i%2)==0 && (i%3)!=0)
			{
				System.out.println(i);
			}
		}
	}
}
