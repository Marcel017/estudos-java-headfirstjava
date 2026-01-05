package capitulo1;

public class DooBeeDooBeeDo {
    static void main() {
        int x = 1;

        // Enquanto x for menor que 3 (vai rodar quando x for 1 e 2)
        while (x < 3) {
            System.out.println("Doo");
            System.out.println("Bee");
            x = x + 1; // Aumenta o x.
        }

        // Quando o loop acaba, x vale 3
        if (x == 3) {
            System.out.println("Do");
        }
    }
}