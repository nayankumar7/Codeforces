#include <bits/stdc++.h>
using namespace std;

#define fast_io ios::sync_with_stdio(false); cin.tie(nullptr);

void solve(){
    int x, y;
    for(int i = 1; i<=5; i++) {
        for(int j = 1; j<= 5; j++){
            int p; cin>>p;
            if(p==1){
                x =i;
                y =j;
            }
        }
    }
    int m = abs(x - 3);  // ✅ absolute difference
    int n = abs(y - 3);
    cout<<m+n;
}
int main() {
    fast_io;
    
    int t; 
    // cin >> t;
    t = 1;
    while (t--) {
        solve();
    }
    return 0;
}