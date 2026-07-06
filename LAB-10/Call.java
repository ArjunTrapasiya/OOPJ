//  WAP that prompts the user to input number of calls and calculate the monthly telephone bills as per the following rule: (B) Minimum Rs. 200 for up to 100 calls. Plus Rs. 0.60 per call for next 50 calls. Plus Rs. 0.50 per call for next 50 calls.Plus Rs. 0.40 per call for any call beyond 200 calls.

import java.util.*;

public class Call
{
 public static void main(String[] s)
 {
 	Scanner scnr = new Scanner(System.in);

 	double p,b;

 	System.out.print("Enter Total Phonecalls Number: ");
 	p=scnr.nextDouble();

 	if(p>200)
 	{
 		b=200+(0.6*50)+(0.5*50)+(0.4*(p-200));
 	}
 	else if(p>150)
 	{
 		b=200+(0.6*50)+(0.5*(p-150));
 	}
 	else if(p>100)
 	{
 		b=200+(0.6*(p-100));
 	}
 	else
 	{
 		b=200;
 	}

 	System.out.print("Total Bill: "+b);
 }
}