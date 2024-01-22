import java.util.Scanner;

public class Zadanie01A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę elementów w ciągu (n): ");
        int n = scanner.nextInt();

        int[] ciag = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Podaj element ciągu a" + (i + 1) + ": ");
            ciag[i] = scanner.nextInt();
            suma += ciag[i];
        }

        System.out.print("Suma = " + suma);

        scanner.close();
    }
}
