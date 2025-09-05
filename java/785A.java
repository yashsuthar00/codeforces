// 785 A. Anton and Polyhedrons

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> faces = new HashMap<>();
        faces.put("Tetrahedron", 4);
        faces.put("Cube", 6);
        faces.put("Octahedron", 8);
        faces.put("Dodecahedron", 12);
        faces.put("Icosahedron", 20);

        long total = 0;
        for (int i = 0; i < n; i++) {
            String poly = sc.next();
            total += faces.get(poly);
        }

        System.out.println(total);
    }
}
