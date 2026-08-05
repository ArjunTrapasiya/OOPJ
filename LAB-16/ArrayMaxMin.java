// WAP to find maximum and minimum number from an array.

import java.util.*;

public class ArrayMaxMin
{
	public static void main(String[] s)
	{
		
		System.out.println();
		Scanner scnr = new Scanner(System.in);

		int i,n;

		System.out.print("Enter Size Of An Array: ");
		n=scnr.nextInt();
		System.out.println();

		System.out.println("Enter " +n+ " Elements Here.");
		int ary[] = new int[n];

		System.out.println();

		for(i=0;i<n;i++)
		{
			ary[i]=scnr.nextInt();
		}

		System.out.println();

		int max=ary[0];
		int min=ary[0];

		for(i=0;i<n;i++)
		{
			if(max<ary[i])
			{
				max=ary[i];
			}

			if(min>ary[i])
			{
				min=ary[i];
			}
		}

		System.out.println("Maximum Number in Array is " +max+ ".");
		System.out.println("Minimum Number in Array is " +min+ ".");
	}
}