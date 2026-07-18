#include<stdio.h>
void main()
{
	int i,n,count=0;
	printf("Enter The Number:");
	scanf("%d",&n);
	
	for(i=n;i!=0;i=i/10)
	{
		count++;	
	}
	printf("%d",count);
}
