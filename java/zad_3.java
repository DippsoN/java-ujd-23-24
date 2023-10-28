import java.util.Scanner;

public class zad_3 {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        String[] miesiace = { "", "stycznia", "lutego", "marca", "kwietnia", "maj", "czerwieca", "lipieca", "sierpnia", "wrzesinia", "października", "listopada", "grudnia" };
        boolean gitLiczba = false;

        do {
            try {
                gitLiczba = false;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj dzień");
                int dzien = scanner.nextInt();
                System.out.println("Podaj miesiąc");
                int miesiac = scanner.nextInt();
                System.out.println("Podaj rok");
                int rok = scanner.nextInt();

                if (miesiac < 1 || miesiac > 12) {
                    throw new Exception("Podałeś nieprawidłowny numer miesiaca");
                }
                
                System.out.println(dzien + " " + miesiace[miesiac] + " " + rok);
                
            }
            catch(Exception err) {
                System.err.println();
                System.err.println(ANSI_RED + err.getMessage());
                System.err.println(ANSI_WHITE);
                gitLiczba = true;
            }
        } while (gitLiczba == true);
    }
}
