// 443 A. Anton and Letters

#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    getline(cin, s);   // read entire line including spaces & braces

    set<char> letters;
    for (char c : s) {
        if (isalpha(c)) {
            letters.insert(c);
        }
    }

    cout << letters.size();
    return 0;
}
