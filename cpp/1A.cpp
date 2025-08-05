// 1 A. Theatre Square

#include <bits/stdc++.h>
using namespace std;

int main() {
    long long n, m, a;
    cin >> n >> m >> a;

    long long tiles_width = (n + a - 1) / a;
    long long tiles_height = (m + a - 1) / a;

    cout << tiles_width * tiles_height;
    return 0;
}