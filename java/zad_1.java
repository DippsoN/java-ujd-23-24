import java.util.Scanner;

class Zad_2 {
    public static void main(String[] args) {
        int[] miesiace = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        boolean gitLiczba = false;

        do {
            try {
                gitLiczba = false;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj nr miesiąca od 1 do 12 ;)");
                int nrMiesiaca = scanner.nextInt();

                if (nrMiesiaca == 0) {
                    throw new Exception("Zły numer");
                }
                System.out.println("Twój miesiąc mam " + miesiace[nrMiesiaca] + " dni.");
            } catch (Exception e) {
                System.out.println("Podałeś złą liczbę");
                gitLiczba = true;
            }
        } while (gitLiczba == true);
    }
}