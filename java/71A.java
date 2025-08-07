// // 71 A. Way Too Long Words   (strings)(800)


import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            if (s.length() > 10) {
                System.out.println(s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1));
            } else {
                System.out.println(s);
            }
        }
        sc.close();
    }
}



// test cases
// 4
// word
// localization
// internationalization
// pneumonoultramicroscopicsilicovolcanoconiosis