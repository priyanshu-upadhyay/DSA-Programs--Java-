#include <stdio.h>
int main()
{
   int n;
   scanf("%d", &n);
   int arr[n];

   for (int i = 0; i < n; i++)
   {
      scanf("%d", &arr[i]);
   }
   int e1 = 0;
   int e2 = 0;
   for (int i = 0; i < n; i++)
   {
      if (arr[i] > e1)
      {
         e2 = e1;
         e1 = arr[i];
      }
      else if (arr[i] > e2 && arr[i] < e1)
      {
         e2 = arr[i];
      }
   }
   printf("%d %d", e1, e2);
}