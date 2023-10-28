import java.util.Scanner;

class Zad_2 {
    public static void main(String[] args) {
        boolean gitLiczba = false;
        boolean rokPrzestepny = false;
        do {
            try {
                gitLiczba = false;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Sprawdź czy twój rok jest przestępny");
                int rok = scanner.nextInt();

                if (rok % 400 == 0) {
                    rokPrzestepny = true;
                } else if (rok % 4 == 0) {
                    rokPrzestepny = true;
                } else {
                    if (rok % 100 == 0) {
                        rokPrzestepny = false;

                        switch(rok) {
                            case 2000:
                                rokPrzestepny = false;
                                break;
                            case 1700:
                                rokPrzestepny = false;
                                break;
                        }
                    }
                }

                if (rokPrzestepny) {
                    System.out.println("Ten rok jest przestępny");
                } else {
                    System.out.println("Ten rok jest nieprzestępny");
                }
            } catch (Exception e) {
                System.out.println("Podałeś złą liczbę");
                gitLiczba = true;
            }
        } while (gitLiczba == true);

    }
}
