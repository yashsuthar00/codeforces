// 1030 A. In Search of an Easy Problem

#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    bool hard = false;
    
    while (n--){
        int i;
        cin >> i;

        if(i == 1) {
            hard = true;
        }
    }
    
    if(hard) cout << "HARD";
    else cout << "EASY";
}
