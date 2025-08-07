// 263 A. Beautiful Matrix

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++) {
                x = sc.nextInt();
                if(x == 1) {
                    System.out.println(Math.abs(i-2) + Math.abs(j-2));
                }
            }
        }
        sc.close();
    }
}