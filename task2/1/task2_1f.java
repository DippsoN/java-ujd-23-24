import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        int count = 0;

        System.out.println("Podaj " + n + " liczb naturalnych: ");
        for (int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            if (i % 2 != 0 && num % 2 == 0) {
                count++;
            }
        }

        System.out.println("Liczba liczb spełniających warunek: " + count);
    }
}
