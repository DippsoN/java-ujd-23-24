import java.util.*;

public class Zadanie02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaZakupow = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Dodaj pozycję na listę zakupów");
            System.out.println("2. Wyświetl wszystkie pozycje z listy zakupów");
            System.out.println("3. Wyświetl posortowane pozycje z listy zakupów");
            System.out.println("4. Usuń pozycję z listy zakupów");
            System.out.println("5. Wstaw pozycję na listę zakupów");
            System.out.println("6. Wyjście");
            System.out.print("Wybierz opcję: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Podaj pozycję do dodania na listę zakupów: ");
                    String item = scanner.nextLine();
                    listaZakupow.add(item);
                    break;
                case 2:
                    System.out.println("Wszystkie pozycje na liście zakupów:");
                    for (String zakup : listaZakupow) {
                        System.out.println(zakup);
                    }
                    break;
                case 3:
                    List<String> posortowanaLista = new ArrayList<>(listaZakupow);
                    Collections.sort(posortowanaLista);
                    System.out.println("Posortowane pozycje na liście zakupów:");
                    for (String zakup : posortowanaLista) {
                        System.out.println(zakup);
                    }
                    break;
                case 4:
                    System.out.print("Podaj pozycję do usunięcia z listy zakupów: ");
                    String pozycjaDoUsuniecia = scanner.nextLine();
                    if (listaZakupow.contains(pozycjaDoUsuniecia)) {
                        listaZakupow.remove(pozycjaDoUsuniecia);
                        System.out.println("Pozycja została usunięta.");
                    } else {
                        System.out.println("Podana pozycja nie istnieje na liście zakupów.");
                    }
                    break;
                case 5:
                    System.out.print("Podaj pozycję do wstawienia na listę zakupów: ");
                    String pozycjaDoWstawienia = scanner.nextLine();
                    System.out.print("Podaj pozycję, przed którą chcesz wstawić nową pozycję (lub zostaw puste, jeśli na początek): ");
                    String pozycjaPrzedWstawieniem = scanner.nextLine();

                    int indexWstawienia = 0;
                    if (!pozycjaPrzedWstawieniem.isEmpty()) {
                        indexWstawienia = listaZakupow.indexOf(pozycjaPrzedWstawieniem);
                        if (indexWstawienia == -1) {
                            System.out.println("Podana pozycja, przed którą chcesz wstawić nową pozycję, nie istnieje na liście zakupów.");
                            continue;
                        }
                    }

                    listaZakupow.add(indexWstawienia, pozycjaDoWstawienia);
                    System.out.println("Pozycja została wstawiona na listę zakupów.");
                    break;
                case 6:
                    System.out.println("Dziękujemy! Program zakończył działanie.");
                    System.exit(0);
                default:
                    System.out.println("Niepoprawna opcja. Wybierz ponownie.");
                    break;
            }
        }
    }
}
