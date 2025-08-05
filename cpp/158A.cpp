#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    vector<int> scores(n);
    for(int i = 0; i < n; i++) cin >> scores[i];

    int cutoff = scores[k - 1];
    int count = 0;
    for(int score : scores) {
        if(score >= cutoff && score > 0) count++;
    }

    cout << count;
    return 0;
}
