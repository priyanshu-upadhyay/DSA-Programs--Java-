#include <bits/stdc++.h>
using namespace std;
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);
    int year;
    cin>>year;
    while (true)
    {
        year++;
        string s = to_string(year);
        set<int> digits(s.begin(), s.end());
        if(s.size() == digits.size()) { break; }
    }
    cout<<year;
    
    return 0;
}