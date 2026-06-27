// WAP to read marks of five subjects calculate total and percentage. 

import java.util.*;

public class Result
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);

		double s1,s2,s3,s4,s5;
		

		System.out.println("Enter 1st Subject Mark:");		
		s1=scnr.nextDouble();
		System.out.println("Enter 2nd Subject Mark:");
		s2=scnr.nextDouble();
		System.out.println("Enter 3rd Subject Mark:");
		s3=scnr.nextDouble();
		System.out.println("Enter 4th Subject Mark:");
		s4=scnr.nextDouble();
		System.out.println("Enter 5th Subject Mark:");
		s5=scnr.nextDouble();

		System.out.println("Sum Of Total Subject Marks Are: " +(s1+s2+s3+s4+s5));
		System.out.println("Percentage Is: " +((s1+s2+s3+s4+s5)/5));
	}
}