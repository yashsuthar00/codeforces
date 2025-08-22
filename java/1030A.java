// 1030 A. In Search of an Easy Problem

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hard = false;

        while (n > 0){
            int i = sc.nextInt();
            if(i==1){
                hard = true;
            }
            n--;
        }
        if(hard) System.out.println("HARD");
        else System.out.println("EASY");
    }
}