#include <bits/stdc++.h>
#include <climits>  // INT_MIN, INT_MAX
using namespace std;

#define fast_io ios::sync_with_stdio(false); cin.tie(nullptr);
 
int check_polindrome(
    unsigned long long number
){
    string num = to_string(number);
    // 4/2 = 2 2 and 1 is mid value 1221
    // 5/2 = 2 it is mid value 12321
    int odd = 1;
    if(num.size()/2){
        odd = 0;
    }
    for(int i = num.size()/2 + odd; i < num.size(); i++){
        if(num[i]!= num[num.size()-i-1]){
            return 0;
        }
    }
    return 1;
}

void solve(){
    unsigned long long n;
    cin >> n;
    for(unsigned long long i = 0; i<= n; i= i + 12){
        unsigned long long a = i;
        unsigned long long b = n - i;
        if(check_polindrome(b)==1){
            cout<<b;
            cout<<" ";
            cout<<a<<endl;
            return;
        }
    }
    cout<<-1<<endl;
}

int main() {
    fast_io;
 
    int t; 
    cin >> t;
    // t = 1;
    while (t--) {
        solve();
    }
    return 0;
}