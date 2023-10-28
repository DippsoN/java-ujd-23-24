import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        int count = 0;

        System.out.println("Podaj " + n + " liczb naturalnych: ");
        for (int k = 1; k <= n; k++) {
            int ak = scanner.nextInt();
            if (2 * k < ak && ak < factorial(k)) {
                count++;
            }
        }

        System.out.println("Liczba liczb spełniających warunek: " + count);
    }

    private static int factorial(int k) {
        if (k == 0) {
            return 1;
        } else {
            return k * factorial(k - 1);
        }
    }
}
