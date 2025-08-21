// 271 A. Beautiful Year

import java.util.*;

class Main {
    static boolean isBeautiful(int year) {
        String s = String.valueOf(year);
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size() == s.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        while(true){
            y++;
            if(isBeautiful(y)) {
                System.out.println(y);
                break;
            }
        }
        sc.close();
    }
}
