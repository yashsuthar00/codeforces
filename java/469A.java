// 469 A. I Wanna Be the Guy

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> levels = new HashSet<>();

        int p = sc.nextInt();
        for (int i = 0; i < p; i++) {
            levels.add(sc.nextInt());
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            levels.add(sc.nextInt());
        }

        if (levels.size() == n) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");

        sc.close();
    }
}
