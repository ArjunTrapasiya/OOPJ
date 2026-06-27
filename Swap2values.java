// . Write a program in java to swap 2 values taken from user with the use of 3rd variable.

import java.util.*;

public class Swap2values
{
 public static void main(String[] args)
  {
  	Scanner scnr = new Scanner(System.in);

  	System.out.println("Enter First Number:");
  	int a=scnr.nextInt();
  	System.out.println("Enter Second Number:");
  	int b=scnr.nextInt();
  	int temp;
  	temp=a;
  	a=b;
  	b=temp;

  	System.out.println("After Swap First Number: "+a);
  	System.out.println("After Swap Second Number: "+b);
  }
}