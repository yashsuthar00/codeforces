// 144 A. Arrival of the General

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> a(n);
    for(int i=0; i<n; ++i) cin >> a[i];

    int maxIndex = 0, minIndex = 0;
    for(int i=0; i<n; ++i) {
        if(a[i] > a[maxIndex]) maxIndex = i;
        if(a[i] <= a[minIndex]) minIndex = i;
    }

    int swaps = maxIndex + ( n - 1 - minIndex);
    if(maxIndex > minIndex) swaps--;

    cout << swaps;

    return 0;
}
