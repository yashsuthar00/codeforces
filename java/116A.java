// 116 A. Tram

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int passanger = 0, maxCapacity = 0;

        for(int i=0; i<n; ++i) {
            int leave = sc.nextInt();
            int enter = sc.nextInt();

            passanger -= leave;
            passanger += enter;

            if(passanger > maxCapacity) {
                maxCapacity = passanger;
            }
        }
        System.out.println(maxCapacity);
        sc.close();
    }
}

// 4
// 0 3
// 2 5
// 4 2
// 4 0