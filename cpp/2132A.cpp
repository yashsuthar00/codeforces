// 2132A

#include <iostream>
using namespace std;

int main() {
    int run;
    cin >> run;

    while (run--){
        string a,b,c;
        int n,m;

        cin >> n >> a >> m >> b >> c;
        string result = a;
        for(int i=0; i<m; ++i) {
            if(c[i] == 'D') {
                result = result + b[i];
            } else {
                result = b[i] + result;
            }
        }
        cout << result << endl;        
    }

    return 0;
}
