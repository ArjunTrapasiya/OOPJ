#include<stdio.h>
void main()
{
	int fact=1,n,i;
	printf("Enter The Number:");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		fact=i*fact;	
	}
	printf("Factorial Is:%d",fact);
}
