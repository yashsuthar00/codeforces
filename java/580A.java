// 580 A. Kefa and First Steps

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, maxCount = 0, prev = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(prev <= a) {
                count++;
            } else {
                count = 1;
            }
            if(maxCount < count) {
                maxCount = count;
            }
            prev = a;
        }
        System.out.println(maxCount);
    }
}
