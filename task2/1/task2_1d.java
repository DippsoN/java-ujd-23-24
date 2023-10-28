import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę naturalną n: ");
        int n = scanner.nextInt();

        int count = 0;

        if (n >= 3) { 
            System.out.println("Podaj " + n + " liczb naturalnych: ");
            int prevNum = scanner.nextInt(); 
            for (int i = 2; i < n; i++) {  
                int currentNum = scanner.nextInt();
                int nextNum = scanner.nextInt();
                if (currentNum < (prevNum + nextNum) / 2) {
                    count++;
                }
                prevNum = currentNum;  
            }
        } else {
            System.out.println("Podaj co najmniej 3 liczby naturalne.");
        }

        System.out.println("Liczba liczb spełniających warunek: " + count);
    }
}
