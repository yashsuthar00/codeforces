// 467 A. George and Accommodation

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for(int i=0; i<n; ++i){
            int p = sc.nextInt();
            int q = sc.nextInt();

            if(q-p >= 2) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
