import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        int count = 0;

        System.out.println("Podaj " + n + " liczb całkowitych: ");
        for (int k = 1; k <= n; k++) {
            int ak = scanner.nextInt();
            if (Math.abs(ak) < k * k) {
                count++;
            }
        }

        System.out.println("Liczba liczb spełniających warunek: " + count);
    }
}
