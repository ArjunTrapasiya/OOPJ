// Modify program number 3 of Lab number 8. Calculate grade of a student depending on percentage. (If >90% then A+ grade,80-90% then A grade, 70-80% then B+ grade, 60-70% then B grade, 50-60% then C grade, 35-50% then P grade and <35 then FT)

import java.util.*;

public class ResultGrade
{
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);

		double s1,s2,s3,s4,s5,t,p;
		

		System.out.println("Enter 1st Subject Mark:");		
		s1=scnr.nextDouble();
		System.out.println("Enter 2nd Subject Mark:");
		s2=scnr.nextDouble();
		System.out.println("Enter 3rd Subject Mark:");
		s3=scnr.nextDouble();
		System.out.println("Enter 4th Subject Mark:");
		s4=scnr.nextDouble();
		System.out.println("Enter 5th Subject Mark:");
		s5=scnr.nextDouble();

		t=s1+s2+s3+s4+s5;
		p=(s1+s2+s3+s4+s5)/5;

		System.out.println("Sum Of Total Subject Marks Are: " +t);
		System.out.println("Percentage Is: " +p);

		if(p>90)
		{
		  System.out.println("Student Got Grade A+.");
		}
		else if(p>=80 && p<=90)
		{
		  System.out.println("Student Got Grade A.");
		}
		else if(p>=70 && p<80)
		{
		  System.out.println("Student Got Grade B+.");
		}
		else if(p>=60 && p<70)
		{
		  System.out.println("Student Got Grade B.");
		}
		else if(p>=50 && p<60)
		{
		  System.out.println("Student Got Grade C.");
		}
		else if(p>=35 && p<50)
		{
		  System.out.println("Student Got Grade P.");
		}
		else
		{
		  System.out.println("Student Got Grade FT.");
		}
	}
}