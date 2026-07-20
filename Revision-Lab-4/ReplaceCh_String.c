#include<stdio.h>
void main()
{
	char str[100],str2;
	int i,n,position;
	printf("Enter The String:");
	gets(str);
	printf("Replace Character Write Here:");
	scanf("%c",&str2);
	printf("Which Position Replace Character:");
	scanf("%d",&position);
	str[position]=str2;
	puts(str);
}
