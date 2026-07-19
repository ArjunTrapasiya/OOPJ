#include<stdio.h>
void main(){
	int a[3][3],b[3][3],m[3][3],i,j,k;
	printf("Entre the number\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
				scanf("%d",&a[i][j]);
		}
	}
	printf("Entre the number\n");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
				
				scanf("%d",&b[i][j]);
		}
	}
	
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
				for(k=0;k<3;k++){
					m[i][j]=a[i][j]*b[i][j];
				}
		}
	}
	
	
	printf("\n");
	
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
				printf("%d ",m[i][j]);
		}
		
	}
	
	
	
}
