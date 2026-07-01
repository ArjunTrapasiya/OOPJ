import java.util.*;

class distance{
    public static void main(){
    Scanner sc = new Scanner(System.in);
    double x1,x2,y1,y2;
    System.out.print("Entre the x1");
    x1=sc.nextDouble();
    System.out.print("Entre the x2");
    x2=sc.nextDouble();
    System.out.print("Entre the y1");
    y1=sc.nextDouble();
    System.out.print("Entre the y2");
    y2=sc.nextDouble();
    double  distance= Math.sqrt(((x2-x1)*(x2-x1))+ ((y2-y1)*(y2-y1)));

    System.out.println("distance="+distance);
    
    }
}