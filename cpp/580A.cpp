// 580 A. Kefa and First Steps

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    int count = 0;
    int maxCount = 0;
    int prev = INT_MIN;

    while (n--) {
        int a;
        cin >> a;

        if(prev <= a) {
            count++;
        } else {
            count = 1;
        }
        if(maxCount < count) {
            maxCount = count;
        }
        prev = a;
    }

    cout << maxCount << endl;
    return 0;
}
