// 110 A. Nearly Lucky Number

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = 0;

        for (char c : n.toCharArray()) {
            if (c == '4' || c == '7') {
                count++;
            }
        }

        if (count == 4 || count == 7)
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }
}
