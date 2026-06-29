// Convert number of days into year, week & days. [e.g. 375 days = 1 year, 1 week and 3 days]

import java.util.*;

public class ConvertDays
{
	public static void main(String[] s)
	{
		Scanner scnr = new Scanner(System.in);

		int totaldays, yy, mm, dd;

        System.out.print("Enter Days: ");
        totaldays = scnr.nextInt();

        yy = totaldays / 365;
        mm = (totaldays % 365) / 30;
        dd = (totaldays % 365) % 30;

       System.out.println(+yy +":" +mm +":" +dd);
	}
}