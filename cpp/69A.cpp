// 69 A. Young Physicist

#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int xSum = 0, ySum = 0, zSum = 0;

    for (int i = 0; i < n; i++) {
        int x, y, z;
        cin >> x >> y >> z;
        xSum += x;
        ySum += y;
        zSum += z;
    }

    if (xSum == 0 && ySum == 0 && zSum == 0)
        cout << "YES" << endl;
    else
        cout << "NO" << endl;

    return 0;
}
