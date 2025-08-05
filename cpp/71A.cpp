// 71 A. Way Too Long Words   (strings)(800)

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    while(n--) {
        string s;
        cin >> s;
        if(s.length() > 10) {
            cout << s[0] << s.length() - 2 << s.back() << "\n";
        } else {
            cout << s << "\n";
        }
    }
    return 0;
}




// test cases
// 4
// word
// localization
// internationalization
// pneumonoultramicroscopicsilicovolcanoconiosis
