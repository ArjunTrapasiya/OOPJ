#include<stdio.h>
void main()
{
	char str[100],str2[100];
	int i,j=0;
	printf("Enter The String:");
	gets(str);
	printf("Enter The Another String:");
	gets(str2);
	
	for(i=0;str[i]!='\0';i++)
	{
		
	}
	
	for(j=0;str2[j]!='\0';j++)
	{
		str[i]=str2[j];
		i++;
	}
	str[i]='\0';
	puts(str);
}
