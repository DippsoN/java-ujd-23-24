import java.util.Scanner;

public class Zadanie02 {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.print("Podaj rok: ");

        int rok = year.nextInt();

        if (rok % 400 == 0 || rok % 4 == 0 && rok % 100 != 0 ) {
            System.out.print("przestępny");
        } else {
            System.out.print("nie jest przestępny");
        }

        year.close();
    }
}
