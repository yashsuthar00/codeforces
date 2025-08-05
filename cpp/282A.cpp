#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, x = 0;
    cin >> n;
    while(n--) {
        string op;
        cin >> op;
        if(op.find("++") != string::npos)
            x++;
        else
            x--;
    }
    cout << x;
    return 0;
}


// 3
// ++X
// X++
// --X