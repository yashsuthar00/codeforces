// 1328 A. Divisibility Problem

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n > 0) {
            n--;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = 0;

            if (a % b == 0) {
                System.out.println(result);
                continue;
            } else {
                result = b - (a % b);
            }

            System.out.println(result);
        }
    }
}
