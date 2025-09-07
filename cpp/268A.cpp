// 268 A. Games

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<pair<int,int>> teams(n);

    for (int i = 0; i < n; i++) {
        cin >> teams[i].first >> teams[i].second; // home, away
    }

    int count = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i != j && teams[i].first == teams[j].second) {
                count++;
            }
        }
    }

    cout << count << endl;
    return 0;
}
