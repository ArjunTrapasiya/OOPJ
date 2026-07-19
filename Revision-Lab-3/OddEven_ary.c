#include<stdio.h>
void main()
{
	int i,n,odd=0,even=0;
	printf("Enter The Size Of Array:");
	scanf("%d",&n);
	printf("Enter The %d Numbers:\n",n);
	int ary[n];
	
	for(i=0;i<=n;i++)
	{
		scanf("%d",&ary[i]);
	}
	
	for(i=0;i<=n;i++)
	{
		if (ary[i]%2==0)
		even++;
		else
		odd++;
	}
	
	printf("Total Odds Are %d\n",odd);
	printf("Total Evens Are %d",even);
}
