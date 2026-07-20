#include<stdio.h>
void main()
{
	char str[100],ch;
	int i,count=0;
	printf("Enter String Here:");
	gets(str);
	printf("Which Character Do You Count ?:");
	scanf("%c",&ch);
	
	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]==ch)
		count++;
	}
	printf("Enter Character '%c' Is Repeted by %d Times.",ch,count);
}
