// 469 A. I Wanna Be the Guy

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, p, q, level;
    cin >> n;

    set<int> levels;

    cin >> p;
    for (int i = 0; i < p; i++) {
        cin >> level;
        levels.insert(level);
    }

    cin >> q;
    for (int i = 0; i < q; i++) {
        cin >> level;
        levels.insert(level);
    }

    if ((int)levels.size() == n)
        cout << "I become the guy.";
    else
        cout << "Oh, my keyboard!";

    return 0;
}
