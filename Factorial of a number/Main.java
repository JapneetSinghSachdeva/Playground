#include <stdio.h>
int main() {
	int num;
  scanf("%d", &num);
  int factorial=1;
  for(int i=1; i<=num; i++)
  {
    factorial = factorial*i;
  }
  printf("%d", factorial);
	return 0;
}