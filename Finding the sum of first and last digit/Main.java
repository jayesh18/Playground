#include <stdio.h>
int main() {
	int num,n,m,sum;
    scanf("%d",&num);
    m=num%10;
   while(num>=10)
   {
   num=num/10;
   }
   n=num%10;
   sum=n+m;
   printf("%d",sum);
	return 0;
}