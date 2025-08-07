import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long tiles_width = (n + a - 1) / a;
        long tiles_height = (m + a - 1) / a;

        System.out.println(tiles_width * tiles_height);
        sc.close();
    }
}
