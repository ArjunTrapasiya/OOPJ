// pattern 1

public class pattern1
{
	public static void main(String[] s)
	{
		int i,j,k;

		for(i=1;i<=5;i++)
		{
			for(k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
				  System.out.print("@ ");
				}
				else
				{
				  System.out.print("# ");
				}
			}
			System.out.println();
		}

	}
}