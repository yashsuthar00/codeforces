// 281 A. Word Capitalization

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = s.substring(0, 1).toUpperCase() + s.substring(1);
        System.out.println(result);
        sc.close();
    }
}
