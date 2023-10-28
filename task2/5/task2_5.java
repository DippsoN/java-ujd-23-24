import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        if (n >= 2) {
            System.out.println("Podaj " + n + " liczb rzeczywistych: ");
            double prevNum = scanner.nextDouble();
            double currentNum;
            int count = 0;

            for (int i = 1; i < n; i++) {
                currentNum = scanner.nextDouble();
                if (prevNum > 0 && currentNum > 0) {
                    count++;
                }
                prevNum = currentNum;
            }

            System.out.println("Ilość sąsiadujących par (a; b) takich, że a > 0 i b > 0: " + count);
        } else {
            System.out.println("Podaj liczbę naturalną większą lub równą 2.");
        }
    }
}
