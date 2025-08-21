// 677 A. Vanya and Fence

#include <iostream>
using namespace std;

int main() {
    int n, h;
    cin >> n >> h;
    int width = 0;
    
    for (int i = 0; i < n; i++) {
        int height;
        cin >> height;
        if (height > h) width += 2;
        else width += 1;
    }
    
    cout << width;
    return 0;
}