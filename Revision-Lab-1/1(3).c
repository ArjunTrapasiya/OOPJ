#include<stdio.h>
void main()
{
	int interest,p,r,n;
	printf("Enter The Prize ");
	scanf("%d",&p);
	printf("\nEnter The Rate Of Interest ");
	scanf("%d",&r);
	printf("\nEnter The Time Period ");
	scanf("%d",&n);
	interest = (p*r*n)/100;
	printf("\nInterest Is %d",interest);
}
