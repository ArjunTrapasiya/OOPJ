//. WAP that calculates area of circle, triangle and square using method overloading.

import java.util.*;

public class FunctionFindArea
{
  public static void main(String[] s)
  {
  	Circle();
  	Triangle();
  	Square();
  }

  public static void Circle()
  {
  	Scanner scnr=new Scanner (System.in);

  	double ci,r,pi=3.14;
  	System.out.print("Enter Circle Radius: ");
  	r=scnr.nextDouble();
  	ci=pi*(r*r);
  	System.out.println("Area of Circle Is: "+ci);
  	System.out.println();
  }

   public static void Triangle()
  {
  	Scanner scnr=new Scanner (System.in);

  	double tr,h,b;
  	System.out.print("Enter Triangle Height: ");
  	h=scnr.nextDouble();
  	System.out.print("Enter Triangle Base: ");
  	b=scnr.nextDouble();
  	tr=(h*b)/2;
  	System.out.println("Area of Triangle Is: "+tr);
  	System.out.println();
  }

  public static void Square()
  {
  	Scanner scnr=new Scanner (System.in);

  	double sq,c;
  	System.out.print("Enter Square value: ");
  	c=scnr.nextDouble();
  	sq=(c*c);
  	System.out.println("Area of Square Is: "+sq);
  	System.out.println();
  }
}