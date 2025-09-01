// 520 A. Pangram

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Set<Character> letters = new HashSet<>();
        for (char c : s.toCharArray()) {
            letters.add(Character.toLowerCase(c));
        }

        if (letters.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
