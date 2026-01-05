#include <bits/stdc++.h>
using namespace std;

#define fast_io ios::sync_with_stdio(false); cin.tie(nullptr);
    void solve() {
        int n, k;
        cin >> n >> k;int x, y, p;
        
        for(int i = 1; i <= n; i++) {
            cin>> p;
            if(i<=k){
                y=p;
            }else{
                x=p;
            }
            if(p==0){
                cout<< i-1;break;
            }
            if(i>k){
                if(x!=y){
                    cout<<i-1;
                    break;
                }
                else if(i==n){
                    cout<<i;
                    break;
                }
                else if (x==0){
                    cout<<0;
                    break;
                }
            }else if(i==n){
                cout<<i;
                break;
            }
        }

    }
int main() {
    fast_io;
    
    // int t; 
    // cin >> t; // Number of test cases

    // while (t--) {
    //     solve();
    // }
    solve();
    return 0;
}
