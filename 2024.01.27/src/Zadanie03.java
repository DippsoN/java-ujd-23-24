import java.util.*;

public class Zadanie03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> zliczenieLiter = new HashMap<>();

        System.out.println("Wprowadzaj napisy, a program zliczy wystąpienia liter.");
        System.out.println("Wprowadź 'end' aby zakończyć.");

        while (true) {
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("end")) {
                break;
            }

            for (char znak : input.toCharArray()) {
                if (Character.isLetter(znak)) {
                    zliczenieLiter.put(znak, zliczenieLiter.getOrDefault(znak, 0) + 1);
                }
            }
        }

        System.out.println("Wystąpienia liter:");
        for (Map.Entry<Character, Integer> entry : zliczenieLiter.entrySet()) {
            char litera = entry.getKey();
            int wystapienia = entry.getValue();
            System.out.println(litera + ": " + wystapienia);
        }
    }
}
