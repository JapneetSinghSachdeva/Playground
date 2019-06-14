#include<stdio.h>
int main()
{
  int second_last, num;
  scanf("%d", &num);
  int new_num1, new_num2;
  new_num1 = num%1000;
  new_num2 = new_num1/10;
  num= new_num2%10;
  printf("%d", num);
  return 0;
}