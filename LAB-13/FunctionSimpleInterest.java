// . WAP to calculate simple interest using method. 

import java.util.*;

public class FunctionSimpleInterest
{
	public static void main(String[] s)
	{
		Scanner scnr=new Scanner(System.in);

		double t,p,r,n;

		System.out.print("Enter The Price: ");
		p=scnr.nextDouble();
		System.out.print("Enter The Rate Of Interest: ");
		r=scnr.nextDouble();
		System.out.print("Enter Number Of Time: ");
		n=scnr.nextDouble();

		t=interest(p,r,n);
		System.out.println("Simple Interest Is: "+t);
	}

	public static double interest(double a,double b,double c)
	{
		double bill;
		bill=(a*b*c)/100;
		return bill;
	}
}