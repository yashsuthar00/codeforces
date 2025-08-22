// 58 A. Chat room

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String target = "hello";
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
                if (j == target.length()) break;
            }
        }

        if (j == target.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}