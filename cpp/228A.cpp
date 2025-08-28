// 228 A. Is your horseshoe on the other hoof?

#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    int n = 0;
    unordered_map<int, int> count;

    for (int i=0; i<4; ++i) {
        int c;
        cin >> c;

        if(count.find(c) == count.end()){
            count[c]++;
        }
    }

    cout << 4 - count.size();

    return 0;
}
