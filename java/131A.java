// 131 A. cAPS lOCK

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean condition = true;
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i))) {
                condition = false;
                break;
            }
        }

        if (condition) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i == 0 && Character.isLowerCase(s.charAt(i))) {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
            s = sb.toString();
        }

        System.out.println(s);
        sc.close();
    }
}

