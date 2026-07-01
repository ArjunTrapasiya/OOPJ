//WAP to make a Simple Calculator using switch...case.

import java.util.*;

public class Calculator
{
	public static void main(String[] s)
	{
		Scanner scnr = new Scanner(System.in);

		int a,b;
		char si;

		System.out.print("Enter 1st Number: ");
		a=scnr.nextInt();
		System.out.print("Enter 2nd Number: ");
		b=scnr.nextInt();
		System.out.print("Enter Sign (+,*,/,-):");
		si=scnr.next().charAt(0);

		switch(si)
		{
		 case '+' :
		 {
		 	System.out.print("Sum is "+(a+b));
		 	break;
		 }
		 case '-' :
		 {
		 	System.out.print("Substarction is "+(a-b));
		 	break;
		 }
		 case '*' :
		 {
		 	System.out.print("Multiplication is "+(a*b));
		 	break;
		 }
		 case '/' :
		 {
		 	System.out.print("Division is "+(a/b));
		 	break;
		 }
		 default :
		 	System.out.print("Please! Enter Valid Sign.");
		}
	}
} 
