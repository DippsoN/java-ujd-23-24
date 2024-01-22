import java.io.*;

public class Zadanie04 {
    public static void zamienWiersze(String sciezkaWejsciowegoPliku, String sciezkaNowegoPliku) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sciezkaWejsciowegoPliku));
             BufferedWriter writer = new BufferedWriter(new FileWriter(sciezkaNowegoPliku))) {

            String aktualnaLinia;
            String poprzedniaLinia = null;
            int numerWiersza = 1;

            while ((aktualnaLinia = reader.readLine()) != null) {
                if (numerWiersza % 2 == 0) {
                    
                    writer.write(aktualnaLinia);
                    writer.newLine();
                    writer.write(poprzedniaLinia);
                    writer.newLine();
                } else {
                    poprzedniaLinia = aktualnaLinia;
                }

                numerWiersza++;
            }

            
            if (numerWiersza % 2 == 0 && poprzedniaLinia != null) {
                writer.write(poprzedniaLinia);
                writer.newLine();
            }

            System.out.println("Pomyślnie zamieniono wiersze i zapisano do pliku: " + sciezkaNowegoPliku);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Podaj nazwę pliku tekstowego do odczytu (np. plik.txt): ");
            String nazwaPlikuWejsciowego = br.readLine();

            System.out.println("Podaj nazwę nowego pliku tekstowego (np. plik_zamieniony.txt): ");
            String nazwaPlikuWyjsciowego = br.readLine();

            zamienWiersze(nazwaPlikuWejsciowego, nazwaPlikuWyjsciowego);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
