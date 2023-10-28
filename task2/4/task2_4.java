import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Podaj " + n + " liczb rzeczywistych: ");

            double min = Double.MAX_VALUE;
            double max = Double.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                double num = scanner.nextDouble();
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            System.out.println("Najmniejsza liczba: " + min);
            System.out.println("Największa liczba: " + max);
        } else {
            System.out.println("Podaj liczbę naturalną większą od zera.");
        }
    }
}
