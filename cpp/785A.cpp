// 785 A. Anton and Polyhedrons

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    unordered_map<string, int> faces = {
        {"Tetrahedron", 4},
        {"Cube", 6},
        {"Octahedron", 8},
        {"Dodecahedron", 12},
        {"Icosahedron", 20}
    };

    long long total = 0;
    string poly;
    for (int i = 0; i < n; i++) {
        cin >> poly;
        total += faces[poly];
    }
    
    cout << total;
    return 0;
}
