// 236 A. Boy or Girl

#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;
    set<char> unique;

    for (char c : s)
        unique.insert(c);

    if (unique.size() % 2 == 0)
        cout << "CHAT WITH HER!" << endl;
    else
        cout << "IGNORE HIM!" << endl;

    return 0;
}


// testcase
// wjmzbmr
// sevenkplus
// xiaodao