// 160 A. Twins

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            total += coins[i];
        }

        Arrays.sort(coins); // ascending by default
        int mySum = 0, count = 0;

        for (int i = n - 1; i >= 0; i--) { // pick from largest
            mySum += coins[i];
            count++;
            if (mySum > total - mySum) break;
        }

        System.out.println(count);
    }
}
