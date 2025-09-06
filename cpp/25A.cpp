// 25 A. IQ test

#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    int oddIndex = -1, evenIndex = -1, oddCount = 0, evenCount = 0;

    for (int i =0; i<n;i++) {
        cin >> arr[i];
        if(arr[i] % 2 == 0) {
            evenCount++;
            evenIndex = i + 1;
        } else {
            oddCount++;
            oddIndex = i + 1;
        }
    }
    if(evenCount == 1) cout << evenIndex;
    else cout << oddIndex;
    return 0;
}
