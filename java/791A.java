// 791 A. Bear and Big Brother

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int years = 0;

        while (a <= b) {
            a *= 3;
            b *= 2;
            years++;
        }

        System.out.println(years);
    }
}