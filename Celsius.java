import java.util.*;
	
  public class Celsius
  {
    public static void main(String[] args)
    {
      Scanner scnr = new Scanner(System.in);
	
      System.out.println("Enter The Fahrenheit Temperature: ");
      double f=scnr.nextDouble();
      double c=(f-32)*5/9;
      System.out.println("converted temperature Fahrenheit to Celsius Temperature Is: "+c);

    }
  }