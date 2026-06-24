import java.util.*;

	public class Addition
	{
		public static void main(String[] args)
		{
		  Scanner scnr= new Scanner(System.in);
		  System.out.println("Enter 1st Number ");
		  int a=scnr.nextInt();
		  System.out.println("Enter 2nd Number ");
		  int b=scnr.nextInt();
		  System.out.println("Enter 3rd Number ");
		  int c=scnr.nextInt();
		  int d=a+b+c;
		  System.out.println("Sum Is "+d);
		}
	}