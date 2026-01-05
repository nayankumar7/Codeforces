#include <bits/stdc++.h>
using namespace std;

#define fast_io ios::sync_with_stdio(false); cin.tie(nullptr);

void solve(){
    string a, b;
    cin>>a>>b;
    int p = 0;
    
    for(int i = 0; i < a.size();i++){
        char x = tolower(a[i]);
        char y = tolower(b[i]);
        if(a[i]-'a'==b[i]-'A' || a[i]-'A'==b[i]-'a' || a[i] == b[i]){
            p++;
        }else if(x>y){
            cout<<1;
            return;
        }
        else if(x<y){
            cout<<-1;
            return;
        }
    }
    if(p==a.size()){
        cout<<0;
    }
}
int main() {
    fast_io;
    
    int t; 
    t = 1;
    while (t--) {
        solve();
    }
    return 0;
}