#include <stdio.h>
int main() {
	int first_digit, last_digit, num;
  scanf("%d", &num);
  last_digit = num % 10;
  first_digit = num;
  while(num>=10)
  {
  num = num /10;
  }
  first_digit = num;
  int sum = 0;
  sum = first_digit + last_digit;
  printf("%d", sum);
	return 0;
}