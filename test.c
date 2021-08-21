#include <stdio.h>
int main()
{

   long long int n;
   scanf("%d", &n);
   int digit;
   int a = 0, b = 0;
   while (n != 0)
   {
      digit = n % 10;
      if (digit == 9)
         a++;
      else if (digit == 3)
         b++;
      n = n / 10;
   }
   if (a > 0 && b > 0)
      printf("Yes");
   else
      printf("No");
}