// Write a program in java to find area and perimeter of a sqare and rectangle.

import java.util.*;

public class AreaSq_Re
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);

		int a,l,w,s,r;

		System.out.println("Enter Lenth Of Sqare:");
		a=scnr.nextInt();
		s=a*a;
		System.out.println("Area Of Sqare Is: "+s);
		System.out.println("Enter Lenth Of Rectangle:");
		l=scnr.nextInt();
		System.out.println("Enter Width Of Rectangle:");
		w=scnr.nextInt();
		r=l*w;
		System.out.println("Area Of Sqare Is: "+r);

	}
}