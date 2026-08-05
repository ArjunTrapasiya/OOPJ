// WAP to display upper half and lower half of a triange. 

import java.util.*;

public class ArrayTriangleLowerUpper
{
	public static void main(String[] s)
	{
		
		System.out.println();
		Scanner scnr = new Scanner(System.in);

		int i,j,k,r,c,t;
		char a='a';

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

		System.out.println("----Lower Tringle Array----");

		System.out.println();

		for(i=0;i<r;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println();


		System.out.println("----Upper Tringle Array----");

		System.out.println();

		for(i=0;i<r;i++)
		{
			for(j=i;j<c;j++)
			{
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();		
	}
}