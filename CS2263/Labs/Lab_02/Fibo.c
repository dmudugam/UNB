#include<stdio.h>

int calFib(int m){

	int n1=0,n2=1,n3,i;     
	for(i=2; i < m; ++i)   
	{    
		n3 = n1 + n2;       
		n1 = n2;    
		n2 = n3;    
	} 
	return n3;  

}

int main(){

	printf("%d \n", calFib(10));
	return 0;

}
