// Convert seconds into hours, minutes & seconds and print in HH:MM:SS

import java.util.*;

public class TimeConvert
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        int totalSeconds, hh, mm, ss;

        System.out.print("Enter seconds: ");
        totalSeconds = scnr.nextInt();

        hh = totalSeconds / 3600;
        mm = (totalSeconds % 3600) / 60;
        ss = totalSeconds % 60;

       System.out.println(+hh +":" +mm +":" +ss);
    }
}