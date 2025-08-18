// 734 A. Anton and Danik

#include <iostream>
#include <string>
using namespace std;

int main() {
    int n;
    string s;
    cin >> n >> s;

    int anton = 0, danik = 0;
    for (char c : s) {
        if (c == 'A') anton++;
        else if (c == 'D') danik++;
    }

    if (anton > danik) cout << "Anton";
    else if (danik > anton) cout << "Danik";
    else cout << "Friendship";

    return 0;
}
