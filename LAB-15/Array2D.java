// WAP to read values in two-dimensional array and print them in matrix form.

import java.util.*;

public class Array2D
{
	public static void main(String[] s)
	{
		Scanner scnr=new Scanner(System.in);
		System.out.println();

		int i,j,r,c;

		System.out.print("Enter the Row Number: ");
		r=scnr.nextInt();
		System.out.print("Enter the Coloumn Number: ");
		c=scnr.nextInt();
		
		System.out.println();
		System.out.println("Enter Array Element.");

		int ary[][] =new int[r][c];

		System.out.println();

		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				ary[i][j]=scnr.nextInt();
			}
		}		

		System.out.println();
		System.out.println("2D Array Given Below.");
		System.out.println();

		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(ary[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println();
	}
}