// 546 A. Soldier and Bananas

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
    int k,n,w;
    int totalAmount = 0, RequiretoBorrow = 0;
    cin >> k >> n >> w;

    totalAmount = k*(w*(w+1))/2;

    if(totalAmount > n) {
        RequiretoBorrow = totalAmount - n;
    } else {
        RequiretoBorrow = 0;
    }

    cout << RequiretoBorrow << endl;
    return 0;
}