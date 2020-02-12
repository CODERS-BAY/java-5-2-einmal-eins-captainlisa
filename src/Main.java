public class Main {

    public static void main(String[] args) {

        // formatting with printf
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "er-Reihe:");

            for (int k = 1; k <= 10; k++) {
                System.out.printf("%2d * %2d = %3d\n", i, k, (i * k));
            }
        }

    }
}

