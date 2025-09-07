// 4 C. Registration system

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n; 
    cin >> n;
    unordered_map<string, int> cnt;
    while (n--) {
        string s; 
        cin >> s;
        auto it = cnt.find(s);
        if (it == cnt.end()) {
            cout << "OK\n";
            cnt[s] = 1;
        } else {
            cout << s << it->second << "\n";
            it->second++;
        }
    }
    return 0;
}
