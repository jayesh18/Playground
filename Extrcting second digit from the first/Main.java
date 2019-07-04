#include <stdio.h>
int main() {
	int num,n;
    scanf("%d",&num);
    while(num>=100)
    {
    num=num/10;
    
    }
    n=num%10;
    printf("%d",n);
	return 0;
}