import java.util.*;
	
  public class Areacircle{
	public static void main(String[] args)
	 {
		Scanner scnr= new Scanner(System.in);
		System.out.println("Enter The Radious Of Circle:");
		float r=scnr.nextFloat();
		float pi=3.14f;
		float c=pi*r*r;
		System.out.print("Area Of Circle Is " +c);
	}
}