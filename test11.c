// Write a program to find whether a number is Gandhi number or not. If the sum of fourth power of individual digits of a number is equal to the number itself, then it is called Gandhi number.
#include <stdio.h>
#include <math.h>
int main()
{
    int n, sum = 0;
    printf("Enter the Number: ");
    scanf("%d",&n);
    while (n>0)
    {
        sum = sum + pow(n%10,4);
        n = n / 10;
    }
    printf("Sum = %d",sum);
    return 0;
}