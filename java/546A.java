// 546 A. Soldier and Bananas

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();

        int totalAmount = 0, requiredToBorrow = 0;

        totalAmount = k * (w * (w+1) / 2);

        if(totalAmount > n) {
            requiredToBorrow = totalAmount - n;
        } else {
            requiredToBorrow = 0;
        }

        System.out.println(requiredToBorrow);
        sc.close();        
    }
}