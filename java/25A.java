// 25 A. IQ test

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int evenCount = 0, oddCount = 0, evenIndex = -1, oddIndex = -1;
        int[] arr = new int[n];

        for (int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0) {
                evenCount++;
                evenIndex = i;
            }
            else {
                oddCount++;
                oddIndex = i;
            }
        }
        if (evenCount == 1) System.out.println(evenIndex + 1);
        else System.out.println(oddIndex + 1);
    }
}
