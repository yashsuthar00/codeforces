// 1335 A. Candies and Two Sisters

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println((n - 1) / 2);
        }
        sc.close();
    }
}
