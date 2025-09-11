// 131 A. cAPS lOCK

#include <bits/stdc++.h>
using namespace std;

int main() {
    string s;
    cin >> s;
    bool condition = true;

    // Check if all characters except first are uppercase
    for (int i = 1; i < (int)s.size(); i++) {
        if (!isupper(s[i])) {
            condition = false;
            break;
        }
    }

    if (condition) {
        // Fix string
        for (int i = 0; i < (int)s.size(); i++) {
            if (i == 0 && islower(s[i]))
                s[i] = toupper(s[i]);
            else
                s[i] = tolower(s[i]);
        }
    }

    cout << s << "\n";
    return 0;
}
