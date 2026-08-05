// WAP to converte an 2-d array into transpose array.

import java.util.*;

public class ArrayTranspose
{
	public static void main(String[] s)
	{
		
		System.out.println();
		Scanner scnr = new Scanner(System.in);

		int i,j,r,c,t;

		System.out.print("Enter Array's Rows Number: ");
		r=scnr.nextInt();
		System.out.print("Enter Array's Coloumn Number: ");
		c=scnr.nextInt();

		System.out.println();

		t=r*c;

		System.out.println("Enter " +t+ " Elements.");

		int ary[][] = new int [r][c];

		System.out.println();

		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				ary[i][j]=scnr.nextInt();
			}
		}

		System.out.println();

		System.out.println("----Original Array----");

		System.out.println();

		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("----Transpose Array----");

		System.out.println();

		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(ary[j][i]+" ");
			}
			System.out.println();
		}

		System.out.println();
	}
}
