//  WAP that create an array, take the size of array from the user, take the array member from the user and display it using loop. 

import java.util.*;

public class DisplayArrayMember
{
	public static void main(String[] s)
	{
		Scanner scnr=new Scanner (System.in);

		int n,i;
		System.out.print("Enter Number: ");
		n=scnr.nextInt();

		int ary[]= new int[n];
		System.out.println("Enter Array Elements.");
		for(i=0;i<n;i++)
		{
			ary[i]=scnr.nextInt();
		}

		System.out.println("----Array Elements Are Given Below----");
		for(i=0;i<n;i++)
		{
			System.out.println(ary[i]);
		}
	}
}