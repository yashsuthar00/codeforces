import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[5]; // count groups 1..4

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            cnt[x]++;
        }

        int taxis = cnt[4]; // groups of 4

        // match 3s with 1s
        int match = Math.min(cnt[3], cnt[1]);
        taxis += cnt[3];
        cnt[1] -= match;

        // pair 2s
        taxis += cnt[2] / 2;
        if (cnt[2] % 2 == 1) {
            taxis++; // one taxi for leftover 2
            cnt[1] -= Math.min(2, cnt[1]);
        }

        // remaining 1s
        if (cnt[1] > 0) {
            taxis += (cnt[1] + 3) / 4;
        }

        System.out.println(taxis);
        sc.close();
    }
}