// WAP to print given number in reverse order.

import java.util.*;

public class ReverseNumber
{
	public static void main(String[] s)
	{
		Scanner scnr = new Scanner(System.in);

		int last,n;
		System.out.print("Enter The Number: ");
		n=scnr.nextInt();
		System.out.print("Reverse Number: ");
		while(n>0)
		{
			last=n%10;
			System.out.print(last);
			n=n/10;
		}
	}
}


