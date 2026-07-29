// WAP to accept n numbers in an array. Display the sum of all the numbers which are divisible by either 3 or 5.

import java.util.*;

public class ArrayDivisibleBy3or5
{
	public static void main(String[] s)
	{
		Scanner scnr = new Scanner(System.in);

		int n,i,sum=0;

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
			if(arr[i]%3==0 || arr[i]%5==0)
			{
				sum=sum+arr[i];
			}
		}


		System.out.println();

		System.out.println("Sum of all the numbers which are divisible by either 3 or 5 : "+sum);

		System.out.println();

		System.out.print("Numbers Are Divided By 3 in Array is : ");


		for(i=0;i<n;i++)
		{
			if(arr[i]%3==0)
			{
				
				System.out.print(arr[i]+" ");
			}
		}

		System.out.println();

		System.out.print("Numbers Are Divided By 5 in Array is : ");
		for(i=0;i<n;i++)
		{
			if(arr[i]%5==0)
			{
				
				System.out.print(arr[i]+" ");
			}
		}

		System.out.println();
	}
}