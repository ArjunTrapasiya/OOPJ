#include<stdio.h>
void main()
{
	int i,j,n,Temp; 
	printf("Enter The Size Of Array:");
	scanf("%d",&n);
	int ary[n+1];
	printf("Enter %d Numbers:\n");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&ary[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(ary[i]>ary[j])
			{
				Temp=ary[i];
				ary[i]=ary[j];
				ary[j]=Temp;
			}
		}
	}
	
	printf("Sorted Value In Assanding Order\n");
	
	for(i=0;i<n;i++)
	{
		printf("%d\n",ary[i]);
	}
	
	printf("Enter New Number:");
	scanf("%d",&ary[i]);
	
	printf("\n");
	
	for(i=0;i<=n;i++)
	{
		for(j=i+1;j<=n;j++)
		{
			if(ary[i]>ary[j])
			{
				Temp=ary[i];
				ary[i]=ary[j];
				ary[j]=Temp;
			}
		}
	}
	
	printf("New Value Add In Sorted Assanding Array\n");
	
	for(i=0;i<=n;i++)
	{
		printf("%d\n",ary[i]);
	}

}
