// 344 A. Magnets

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    string prev, curr;
    int groups = 1;

    cin >> prev;
    for (int i = 1; i < n; i++) {
        cin >> curr;
        if (curr != prev) { 
            groups++;
        }
        prev = curr; 
    }
    cout << groups;
    return 0;
}
