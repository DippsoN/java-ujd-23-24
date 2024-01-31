import java.util.*;

public class Zadanie06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Brak liczb pierwszych mniejszych lub równych " + n);
            return;
        }

        boolean[] liczbyPierwsze = new boolean[n + 1];
        Arrays.fill(liczbyPierwsze, true);
        liczbyPierwsze[0] = false;
        liczbyPierwsze[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (liczbyPierwsze[i]) {
                for (int j = i * i; j <= n; j += i) {
                    liczbyPierwsze[j] = false;
                }
            }
        }

        System.out.println("Liczby pierwsze nie większe od " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (liczbyPierwsze[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
