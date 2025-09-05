// 208 A. Dubstep

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String replaced = s.replaceAll("WUB", " ").trim();
        String result = replaced.replaceAll("\\s+", " ");

        System.out.println(result);
        sc.close();
    }
}
