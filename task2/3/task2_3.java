import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Podaj " + n + " liczb rzeczywistych: ");
        for (int i = 0; i < n; i++) {
            double num = scanner.nextDouble();
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Liczba liczb dodatnich: " + positiveCount);
        System.out.println("Liczba liczb ujemnych: " + negativeCount);
        System.out.println("Liczba zer: " + zeroCount);
    }
}
