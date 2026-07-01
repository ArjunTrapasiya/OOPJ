import java.util.*;

class clockAngle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double h,m;
        System.out.println("Entre the h");
        h=sc.nextDouble();
        System.out.println("Entre the m");
        m=sc.nextDouble();
        
        double hh=(h*30)+(m*0.5);
        double mm=m*6;

        double clockAngle=hh-mm;
        if(clockAngle>180){
            clockAngle=clockAngle-360;
        }
        System.out.println("clockAngle="+Math.abs(clockAngle));
    }
}