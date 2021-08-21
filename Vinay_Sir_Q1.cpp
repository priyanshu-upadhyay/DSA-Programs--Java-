#include <stdio.h>

int main()
{

    long long t;
    scanf("%lld", &t);
    while (t--)
    {
        long long n;
        scanf("%lld", &n);
        long long a[n];
        for (long long i = 0; i < n; i++)
            scanf("%lld ", &a[i]);
        long long m;
        scanf("%lld", &m);
        long long b[m];
        for (long long i = 0; i < m; i++)
            scanf("%lld ", &b[i]);
        long long f = 0;
        for (long long i = 0; i < m; i++)
        {
            f = 0;
            for (long long j = 0; j < n; j++)
            {
                if (b[i] == a[j])
                {
                    f = 1;
                    break;
                }
            }
            if (f == 0)
            {
                if (i % 2 == 0)
                {
                    printf("ANUJ\n");
                    break;
                }
                else
                {
                    printf("TANUJ\n");
                    break;
                }
            }
        }
        if (f == 1)
            printf("TIE\n");
    }
    return 0;
}
