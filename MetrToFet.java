// WAP that reads a number in meters, converts it to feet, and displays the result. 

import java.util.*;

public class MetrToFet
{
	public static void main(String[] args)
	{
		Scanner scnr= new Scanner(System.in);

		double re,m;
		System.out.println("Enter Number How Many Meters Converts to Feet:");
		m=scnr.nextDouble();
		re=m*3.28084;
		System.out.println("Feet Is : "+re);
	}
}