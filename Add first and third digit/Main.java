#include<stdio.h>
int main()
{
 int num;
  scanf("%d", &num);
  int first_digit = num/100;
  int last_digit = num%10;
  int sum = first_digit+last_digit;
  printf("%d", sum);
  return 0;
}