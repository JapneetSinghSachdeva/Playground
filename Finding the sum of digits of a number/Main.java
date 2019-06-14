#include <stdio.h>
int main() {
	int num;
  scanf("%d", &num);
  int temp,rem=0;
  while(num!=0)
  {
    temp=num%10;
    rem = rem+temp;
    num = num/10;
  }
  printf("%d", rem);
	return 0;
}