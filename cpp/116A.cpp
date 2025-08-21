// 116 A. Tram

#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int passangers = 0, maxCapacity = 0;

    for(int i=0; i<n; ++i) {
        int leave, enter;
        cin >> leave >> enter;
        passangers -= leave;
        passangers += enter;
    
        if(passangers > maxCapacity) {
            maxCapacity = passangers;
        }
    }

    cout << maxCapacity;
    return 0;
}

// 4
// 0 3
// 2 5
// 4 2
// 4 0