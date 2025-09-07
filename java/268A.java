// 268 A. Games

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] teams = new int[n][2];

        for (int i = 0; i < n; i++) {
            teams[i][0] = sc.nextInt(); // home
            teams[i][1] = sc.nextInt(); // away
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && teams[i][0] == teams[j][1]) {
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}
