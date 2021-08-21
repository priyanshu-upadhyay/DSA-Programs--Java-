#include<iostream>
using namespace std;

#define int long long
int32_t main()
{
    int t;
    cin>>t;
    for (int test = 0; test < t; test++)
    {
        int n,k1,k2,w,b,whites,blacks;
        cin>>n>>k1>>k2>>w>>b;
        whites = k1+k2;
        blacks = n*2-whites;
        if (whites%2 == 1)
        {
            whites = whites - 1;
        }
        if (blacks%2 == 1)
        {
            blacks = blacks - 1;
        }
        if (whites >= w*2 && blacks >=b*2)
        {
            cout<<"YES\n";
        }
        else
        {
            cout<<"NO\n";
        }
    }
    
    return 0;
}
