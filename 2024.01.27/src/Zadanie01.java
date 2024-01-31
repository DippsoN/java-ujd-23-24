import java.util.*;

public class Zadanie01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> studentGrades = new HashMap<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Dodaj studenta");
            System.out.println("2. Usuń studenta");
            System.out.println("3. Zmień ocenę studenta");
            System.out.println("4. Wyświetl listę studentów i ocen");
            System.out.println("5. Wyjście");
            System.out.print("Wybierz opcję: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Podaj nazwisko studenta: ");
                    String name = scanner.nextLine();
                    System.out.print("Podaj ocenę studenta: ");
                    String grade = scanner.nextLine();
                    studentGrades.put(name, grade);
                    break;
                case 2:
                    System.out.print("Podaj nazwisko studenta do usunięcia: ");
                    String studentToRemove = scanner.nextLine();
                    studentGrades.remove(studentToRemove);
                    break;
                case 3:
                    System.out.print("Podaj nazwisko studenta do zmiany oceny: ");
                    String studentToChange = scanner.nextLine();
                    if (studentGrades.containsKey(studentToChange)) {
                        System.out.print("Nowa ocena: ");
                        String newGrade = scanner.nextLine();
                        studentGrades.put(studentToChange, newGrade);
                    } else {
                        System.out.println("Student o podanym nazwisku nie istnieje.");
                    }
                    break;
                case 4:
                    List<String> sortedNames = new ArrayList<>(studentGrades.keySet());
                    Collections.sort(sortedNames);
                    System.out.print("Lista studentów i ocen: ");
                    for (String studentName : sortedNames) {
                        System.out.print(studentName + " - " + studentGrades.get(studentName) + " ");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Dziękujemy! Program zakończył działanie.");
                    System.exit(0);
                default:
                    System.out.println("Niepoprawna opcja. Wybierz ponownie.");
                    break;
            }
        }
    }
}
