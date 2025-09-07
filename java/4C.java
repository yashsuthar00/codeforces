// 4 C. Registration system

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> cnt = new HashMap<>();

        while (n-- > 0) {
            String s = sc.next();
            Integer c = cnt.get(s);
            if (c == null) {
                System.out.println("OK");
                cnt.put(s, 1);
            } else {
                System.out.println(s + c);
                cnt.put(s, c + 1);
            }
        }
        sc.close();
    }
}
