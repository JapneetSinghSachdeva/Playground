#include<stdio.h>
int main()
{
  int num;
  scanf("%d", &num);
  int firstDigit, secondDigit;
  firstDigit = num%10;
  secondDigit = num/10;
  int sum = firstDigit+secondDigit;
  printf("%d", sum);
  return 0;
}