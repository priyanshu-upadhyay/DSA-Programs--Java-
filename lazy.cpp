#include<bits/stdc++.h>
#define ll          long long
#define Fast        ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(0);


// #ifndef ONLINE_JUDGE
//    freopen("input.txt", "r", stdin);
//    freopen("output.txt", "w", stdout);
// #endif

using namespace std;

void codeit()
{
    ll x, k, n; cin>>x>>k>>n; 
    ll a[n], b[n], c[n]; 
    for(ll i=0;i<n;i++)
    {
        cin>>a[i]; 
    }
    for(ll i=0;i<n;i++)
    {
        cin>>b[i]; 
    } 
    for(ll i=0;i<n;i++)
    {
        cin>>c[i]; 
    }
    ll sum[n+1]; 
    sum[0] = 0; 
    for(ll i=0;i<n;i++)
    {
        sum[i+1] = sum[i] + a[i] + b[i] + c[i]; 
        //cout<<sum[i]<<" "; 
    }
    ll ans = INT_MAX; 
    for(ll i=0;i<=n-k;i++)
    {
        ll ans1 = sum[k+i] - sum[i]; 
        ans = min(ans , ans1); 
    }
    ans = x - ans; 
    if(ans<0)
        ans = -1; 
    cout<<ans<<endl; 
    return;  
}

int main()
{
    Fast
    ll tt; tt = 1;
    //cin>>tt;
    for(ll i=0;i<tt;i++)
    {
        codeit();
    }
}
