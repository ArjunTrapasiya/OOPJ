//  WAP that prompts the user to enter a letter and check whether a letter is a vowel or consonants.

import java.util.*;

public class VowelConsonants
{
	public static void main(String[] s)
	{
		Scanner scnr = new Scanner(System.in);

		char a;
		System.out.print("Enter The Character:");
		a=scnr.next().charAt(0);


		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
		{
			System.out.println("Enter Character Is Vowel.");
		}
		else if(a!='a' || a!='e' || a!='i' || a!='o' || a!='u' || a!='A' || a!='E' || a!='I' || a!='O' || a!='U')
		{
			System.out.println("Enter Character Is Consonants.");
		}
	}
}
