// . WAP to print the score card of cricket match using the two dimensional array. Take all the input regarding score card from the user.

import java.util.*;

public class Arycricket
{
	public static void main(String[] s)
	{
		Scanner scnr=new Scanner(System.in);
		System.out.println();

		int i,n,p=1;

		System.out.print("Enter the Player Number: ");
		n=scnr.nextInt();

		System.out.println();

		int ary[][] = new int [n][4];

		for(i=0;i<n;i++)
		{
			System.out.println("Enter Player " + p + " Details.");
			p++;
			System.out.println();
			System.out.print("Enter Total Played Ball: ");
			ary[i][0]=scnr.nextInt();

			System.out.print("Enter Total Player Runs: ");
			ary[i][1]=scnr.nextInt();

			System.out.print("Enter Total Hits 4s: ");
			ary[i][2]=scnr.nextInt();

			System.out.print("Enter Total Hits 6s: ");
			ary[i][3]=scnr.nextInt();

			System.out.println();
		}

		System.out.println();

		System.out.println("----Players Details Given Below----");

		System.out.println();

		System.out.println("Player Balls Runs Fours Sixs");

		System.out.println();


		for(i=0;i<n;i++)
		{
			System.out.print(i+1+"      ");	
			System.out.print(ary[i][0]+"    ");
		
			System.out.print(ary[i][1]+"   ");
			
			System.out.print(ary[i][2]+"     ");
			
			System.out.print(ary[i][3]);
			System.out.println();
		}

		int totalruns=0;

		for(i=0;i<n;i++)
		{
			totalruns += ary[i][1];
		}

		System.out.println("-----------------------------------------");
		System.out.println("Total Runs Are: "+totalruns);
		System.out.println();


	}
}