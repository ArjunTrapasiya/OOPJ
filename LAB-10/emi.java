import java.util.*;

class emi{
    public static void main(){
    Scanner sc = new Scanner(System.in);
    double p,r,n;
    System.out.print("Entre the p");
    p=sc.nextDouble();
    System.out.print("Entre the r");
    r=sc.nextDouble();
    System.out.print("Entre the n");
    n=sc.nextDouble();
    double  emi = (p*r*Math.pow(r+1,n))/(Math.pow(1+r,n)-1);
   System.out.println("emi"+emi);
    
    }
}