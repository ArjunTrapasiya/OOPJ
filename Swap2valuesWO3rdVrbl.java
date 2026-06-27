//Write a program in java to swap 2 values taken from user without using 3rd variable.

import java.util.*;

public class Swap2valuesWO3rdVrbl
{
 public static void main(String[] args)
  {
  	Scanner scnr = new Scanner(System.in);

  	System.out.println("Enter First Number:");
  	int a=scnr.nextInt();
  	System.out.println("Enter Second Number:");
  	int b=scnr.nextInt();
  	a=a+b;
  	b=a-b;
  	a=a-b;

  	System.out.println("After Swap First Number: "+a);
  	System.out.println("After Swap Second Number: "+b);
  }
}