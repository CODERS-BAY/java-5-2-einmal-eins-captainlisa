public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "er-Reihe:");

            for (int k = 1; k <= 10; k++) {
                System.out.println(i + "*" + k + "=" + (i * k));
            }
        }
    }
}

