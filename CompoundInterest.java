//  Write a program to find compound interest. All the necessory input will be given by the user. CI=P(1+(r/100))^nt

import java.util.*;

public class CompoundInterest
{
	public static void main(String[] args)
	{
		Scanner scnr= new Scanner(System.in);

		double ci,p,r,nt,amount;

		System.out.println("Enter The Price: ");
		p=scnr.nextDouble();
		System.out.println("Enter The Rate Of Interest: ");
		r=scnr.nextDouble();
		System.out.println("Enter The Number Of Time: ");
		nt=scnr.nextDouble();
		amount = p*Math.pow((1 + r / 100), nt);
        ci = amount - p;

		System.out.println("Compound Interest Is : "+ci);
	}
}