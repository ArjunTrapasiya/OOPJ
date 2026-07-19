#include<stdio.h>
void main()
{
	int i,j,n,positive=0,Nagative=0,Zero=0;
	int ary[3][3];
	printf("Enter The Nine Number:\n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++){
			scanf("%d",&ary[i][j]);
		}
	}
	
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		if (ary[i][j]>0)
		positive++;
		else if (ary[i][j]<0)
		Nagative++;
		else
		Zero++;
		}
		
	}
	
	printf("Total Positive Numbers Are %d\n",positive);
	printf("Total Nagative Numbers Are %d\n",Nagative);
	printf("Total Zeros Are %d\n",Zero);
}
