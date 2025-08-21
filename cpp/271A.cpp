// 271 A. Beautiful Year

#include <iostream>
#include <set>
using namespace std;

bool isBeautiful(int year) {
    string s = to_string(year);
    set<char> st(s.begin(), s.end());
    return st.size() == s.size();
}

int main() {
    int y;
    cin >> y;
    while (true) {
        y++;
        if (isBeautiful(y)) {
            cout << y;
            break;
        }
    }
    return 0;
}