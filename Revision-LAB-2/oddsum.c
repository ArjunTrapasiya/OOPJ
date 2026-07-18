#include<stdio.h>
void main()
{
	int i,n,s=0;
	printf("Enter The Number:");
	scanf("%d",&n);
	
	for(i=1;i<=n;i=i+2)
	{
		s=s+i;
	}
	printf("Sum Is %d",s);
}
