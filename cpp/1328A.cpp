// 1328 A. Divisibility Problem

#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    while(n--){
        int a,b,result = 0;
        cin >> a >> b;

        if(a % b == 0){
            cout << result << endl; 
            continue;
        }
        else {
            result = b - (a % b);
        }

        cout << result << endl;
    }
    return 0;
}
