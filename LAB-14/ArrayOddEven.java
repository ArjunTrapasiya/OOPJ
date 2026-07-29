// WAP to count number of even or odd number from an array of n number.

import java.util.*;

public class ArrayOddEven
{
	public static void main(String[] s)
	{
		Scanner scnr = new Scanner (System.in);

		int n,i,even=0,odd=0;

		System.out.println();

		System.out.print("Enter Number for Array Element: ");
		n=scnr.nextInt();
 		
 		System.out.println();

		System.out.println("Enter " +n+ " Array Element.");

		System.out.println();

		int arr[] = new int[n];

		for(i=0;i<n;i++)
		{
			arr[i]=scnr.nextInt();
		}

		for(i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}

		System.out.println();

		System.out.println("Total Odd Numbers Are : "+odd);
		System.out.println("Total Even Numbers Are : "+even);

		System.out.println();

		System.out.print("Odd Numbers Are : ");
		for(i=0;i<n;i++)
		{
			if(arr[i]%2!=0)
			{
				
				System.out.print(arr[i]+" ");
			}
		}

		System.out.println();

		System.out.print("Even Numbers Are : ");
		for(i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				
				System.out.print(arr[i]+" ");
			}
		}

		System.out.println();
	}
}