import java.io.*;

public class Zadanie03 {
    public static void powielLinie(String sciezkaWejsciowegoPliku, String sciezkaNowegoPliku) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sciezkaWejsciowegoPliku));
             BufferedWriter writer = new BufferedWriter(new FileWriter(sciezkaNowegoPliku))) {


            String[] pierwszeLinie = new String[10];
            int i = 0;
            String line;
            while (i < 10 && (line = reader.readLine()) != null) {
                pierwszeLinie[i++] = line;
            }

            for (int j = 0; j < i; j++) {
                writer.write(pierwszeLinie[j]);
                writer.newLine();
                writer.write(pierwszeLinie[j]);
                writer.newLine();
            }

            System.out.println("Pomyślnie powielono linie do pliku: " + sciezkaNowegoPliku);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Podaj nazwę pliku tekstowego do odczytu (np. plik.txt): ");
            String nazwaPlikuWejsciowego = br.readLine();

            System.out.println("Podaj nazwę nowego pliku tekstowego (np. plikx2.txt): ");
            String nazwaPlikuWyjsciowego = br.readLine();

            powielLinie(nazwaPlikuWejsciowego, nazwaPlikuWyjsciowego);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
