// 236 A. Boy or Girl

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> unique = new HashSet<>();

        for (char c : s.toCharArray())
            unique.add(c);

       if(unique.size() % 2 == 0) System.out.println("CHAT WITH HER!");
       else System.out.println("IGNORE HIM!");

       sc.close();
    }
}


// testcase
// wjmzbmr
// sevenkplus
// xiaodao