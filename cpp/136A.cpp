// 136 A. Presents

#include <iostream>
#include <unordered_map>
using namespace std;

int main() {\
    unordered_map<int,int> gift;
    int n;
    cin >> n;
    
    for(int i=1; i<=n; ++i){
        int p;
        cin >> p;
        gift[p] = i;
    }

    for (int i=1; i<=n; ++i) {
        cout << gift[i] << " ";
    }
    return 0;
}
