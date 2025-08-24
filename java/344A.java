// 344 A. Magnets

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prev = sc.next();
        int groups = 1; // first magnet always starts a group

        for (int i = 1; i < n; i++) {
            String curr = sc.next();
            if (!curr.equals(prev)) {
                groups++;
            }
            prev = curr;
        }

        System.out.println(groups);
    }
}
