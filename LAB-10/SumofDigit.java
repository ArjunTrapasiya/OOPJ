//Find Sum of Digits of a Number.

import java.util.*;

public class SumofDigit
{
	public static void main(String[] s)
	{
		Scanner scnr = new Scanner(System.in);

		int n,d,sum=0;
		System.out.print("Enter The Number: ");
		n=scnr.nextInt();

		while(n!=0)
		{
		  d=n%10;
		  sum+=d;
		  n/=10;
		}
		System.out.print("Sum Of Digit is: "+sum);
	}
}
