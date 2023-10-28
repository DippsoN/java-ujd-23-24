import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();
        
        int count = 0;
        
        System.out.println("Podaj " + n + " liczb naturalnych: ");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 3 == 0 && num % 5 != 0) {
                count++;
            }
        }
        
        System.out.println("Liczba liczb podzielnych przez 3 i niepodzielnych przez 5: " + count);
    }
}
