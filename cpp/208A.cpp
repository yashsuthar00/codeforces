// 208 A. Dubstep

#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;

    string result;
    for (int i = 0; i < (int)s.size();) {
        if (i + 2 < s.size() && s.substr(i, 3) == "WUB") {
            if (!result.empty() && result.back() != ' ')
                result += ' ';
            i += 3;
        } else {
            result += s[i];
            i++;
        }
    }

    // Remove trailing space if any
    if (!result.empty() && result.back() == ' ')
        result.pop_back();

    cout << result;
    return 0;
}
