// pattern 1

public class pattern3
{
	public static void main(String[] s)
	{
		int i,j,k;
		char a='a';

		for(i=5;i>=1;i--)
		{
			for(k=i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(j=5;j>=i;j--)
			{
				if(i%2==0)
				{
				  System.out.print(a);
				}
				else
				{
				  System.out.print(j);
				}
			}
			if(i%2==0)
			{
				a++;
			}
			System.out.println();
		}

	}
}