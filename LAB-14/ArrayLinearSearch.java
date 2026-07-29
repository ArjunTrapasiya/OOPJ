// 57. WAP to accept n numbers in an array. Now, enter a number and search whether the number is present or not in the list of
// array elements by using linear search. (C)

import java.util.*;

public class ArrayLinearSearch
{
	public static void main(String[] s)
	{
		Scanner scnr = new Scanner(System.in);

		System.out.println();

		int i,t=0;
		System.out.print("Enter Number for Array Element: ");
		int n = scnr.nextInt();

		System.out.println();

		System.out.println("Entre "+n+" Array Element.");

		System.out.println();

		int arr[]=new int[n];

		for(i=0;i<n;i++)
		{
			arr[i]=scnr.nextInt();
		}

		System.out.println();

		System.out.print("Entre The Number For Search: ");
		int search = scnr.nextInt();
		

		System.out.println();

		for(i=0;i<n;i++)
		{
			if(search==arr[i])
			{
				t++;
			}
		}

		

		if(t!=0){
			System.out.println("Number is Present in Array For "+t+" Times.");
		}
		else{
			System.out.println("Number is Not Present in Array.");
		}

		System.out.println();
	}
}