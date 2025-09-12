#include <bits/stdc++.h>
using namespace std;

int main() {
    string guest, host, pile;
    cin >> guest >> host >> pile;

    // Combine guest and host names
    string combined = guest + host;

    // Sort both strings
    sort(combined.begin(), combined.end());
    sort(pile.begin(), pile.end());

    // Compare
    if (combined == pile) cout << "YES\n";
    else cout << "NO\n";

    return 0;
}
