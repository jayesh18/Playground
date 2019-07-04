#include <stdio.h>
int main() {
	int num,sum=0;
    int f;
    scanf("%d",&num);
   while(num>0){
   f=num%10;
   num=num/10;
   sum=sum+f;  
   
   }
  printf("%d",sum);
	return 0;
}