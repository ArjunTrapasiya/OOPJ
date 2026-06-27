// Perform Addition, Subtraction, Multiplication and Division of 2 numbers as per user’s choice.

import java.util.*;

public class ASMD2NO
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);

		int n1,n2;
		char sign;

		System.out.println("Enter First Number:");
		n1=scnr.nextInt();
		System.out.println("Enter Second Number:");
		n2=scnr.nextInt();
		System.out.println("Enter Sign '+','-','*','/' : ");
		sign=scnr.next().charAt(0);

		if(sign=='+')
		System.out.println("Sum Is: "+(n1 + n2));
		else if(sign=='-')
		System.out.println("Subtraction Is: "+(n1 - n2));
		else if(sign=='*')
		System.out.println("Multiplication Is: "+(n1 * n2));
		else if(sign=='/')
		System.out.println("Division Is: "+(n1 / n2));
		else
		System.out.println("Invalid Sign Enter");
	}
}