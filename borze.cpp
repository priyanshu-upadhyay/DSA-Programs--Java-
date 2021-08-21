#include <bits/stdc++.h>
using namespace std;
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);
    string str;
    cin>>str;
    int i = 0;
    while (str.length()>i)
    {
        if (str[i] == '.')
        {
            cout<<0;
            i++;
        }
        else if(str[i] == '-')
        {
            if (str[i+1] == '.')
            {
                cout<<1;
            }
            if (str[i+1] == '-')
            {
                cout<<2;
            } 
            i = i + 2;
        }
        
    }
       
    return 0;
}