// 136 A. Presents

import java.util.*;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        int[] q = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
            q[p[i]] = i;  // invert mapping
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(q[i] + " ");
        }
    }
}
