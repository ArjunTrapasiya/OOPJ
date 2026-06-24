import java.util.*;

 public class Bmi
 {
   public static void main(String[] args)
  {
   Scanner scnr= new Scanner(System.in);
   
   System.out.println("Enter Weight In Pound: ");
   double w=scnr.nextDouble();
   System.out.println("Enter Height In Inches: ");
   double h=scnr.nextDouble();
   double k=w*0.453592;
   double m=h*0.0254;
   double bmi=k/(m*m);
   System.out.println("Body Mass Index Is "+bmi);
   }
	
 }