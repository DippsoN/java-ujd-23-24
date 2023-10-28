import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        double sum = 0;

        System.out.println("Podaj " + n + " liczb rzeczywistych: ");
        for (int i = 0; i < n; i++) {
            double num = scanner.nextDouble();
            if (num > 0) {
                sum += num;
            }
        }

        double doubleSum = 2 * sum;

        System.out.println("Podwojona suma dodatnich liczb: " + doubleSum);
    }
}
