// 118 A. String Task

import java.util.Scanner;

class Main {
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'o' || c == 'y' || c == 'e' || c == 'u' || c == 'i');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(!isVowel(c)) {
                result.append('.');
                result.append(Character.toLowerCase(c));
            }
        }
        System.out.println(result.toString());
    }
}