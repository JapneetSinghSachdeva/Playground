#include<stdio.h>
#include<math.h>
int main()
{
  float radius;
  scanf("%f", &radius);
  float circum;
  circum = 3.14*radius*radius;
  printf("%.2f", circum);

return 0;
}