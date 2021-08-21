#include<iostream>
using namespace std;
int main()
{
    int n,t;
    cin>>n>>t;
    string arr;
    cin>>arr;
    for (int i = 0; i < t; i++)
    {

        for (int j = 0; j < arr.length()-1; )
        {
            if (arr[j] == 'B' && arr[j+1] == 'G')
            {
                // arr.at(j) = ''
                arr[j] = 'G';
                arr[j+1] = 'B';
                j = j + 2;
            }
            else
            {
                j++;
            }
            
                
        }
        
    }
    cout<<arr;

    return 0;
}
