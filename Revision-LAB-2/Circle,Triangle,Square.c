#include<stdio.h>
void main()
{
	int b,h,t;
	printf("Enter Height For Triangle: \n");
	scanf("%d",&h);
	printf("Enter Base For Triangle: \n");
	scanf("%d",&b);
	t=(b*h)/2;
	int pi=3.14,r,c;
	printf("Enter Radious For Circle: \n");
	scanf("%d",&r);
	c=pi*r*r;
	int s,h2;
	printf("Enter Size For Squre: \n");
	scanf("%d",&h2);
	s=h2*h2;
	
	printf("Area Of Circle Is :%d. \n",c);
	printf("Area Of Triangle Is :%d. \n",t);
	printf("Area Of Squre Is :%d. \n",s);
}
