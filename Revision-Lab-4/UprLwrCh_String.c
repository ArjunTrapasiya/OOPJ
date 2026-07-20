#include<stdio.h>
void main()
{
	char str[100],str2[100];
	int i;
	printf("Enter The String:");
	gets(str);
	for(i=0;str[i] != '\0';i++)
	{
		if(str[i]>= 'a' && str[i]<= 'z')
		{
			str2[i]=str[i]-32;	
		}
		else
			str2[i]=str[i];
		
	}
	puts(str2);	
}
