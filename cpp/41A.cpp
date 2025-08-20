#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    string s, t;
    cin >> s >> t;

    string rev = s;
    reverse(rev.begin(), rev.end());

    if (rev == t) cout << "YES";
    else cout << "NO";

    return 0;
}
