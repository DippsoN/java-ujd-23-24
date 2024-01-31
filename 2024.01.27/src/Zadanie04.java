import java.util.*;

public class Zadanie04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stos = new Stack<>();

        System.out.println("Wprowadzaj napisy, a program wypisze je w odwróconej kolejności.");
        System.out.println("Wprowadź 'end' aby zakończyć.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            stos.push(input);
        }

        System.out.println("Napisy w odwróconej kolejności:");

        while (!stos.isEmpty()) {
            System.out.println(stos.pop());
        }
    }
}