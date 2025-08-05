import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.compareTo(b) < 0)
            System.out.println("-1");
        else if (a.compareTo(b) > 0)
            System.out.println("1");
        else
            System.out.println("0");

        sc.close();
    }
}
