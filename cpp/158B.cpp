#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> cnt(5, 0); // count groups of size 1..4

    for (int i = 0; i < n; i++) {
        int x; cin >> x;
        cnt[x]++;
    }

    int taxis = cnt[4]; // groups of 4

    // match 3s with 1s
    int match = min(cnt[3], cnt[1]);
    taxis += cnt[3];
    cnt[1] -= match;

    // pair 2s
    taxis += cnt[2] / 2;
    if (cnt[2] % 2) {
        taxis++; // one taxi for leftover 2
        cnt[1] -= min(2, cnt[1]);
    }

    // remaining 1s
    if (cnt[1] > 0) {
        taxis += (cnt[1] + 3) / 4;
    }

    cout << taxis << endl;
    return 0;
}