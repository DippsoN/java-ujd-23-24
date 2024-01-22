import java.io.*;

public class Zadanie02 {
    public static void zapiszDoPliku(char[][] tablica, String nazwaPliku) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nazwaPliku))) {
            int rows = tablica.length;
            int columns = tablica[0].length;

            writer.write(rows + " " + columns);

            for (int i = 0; i < rows; i++) {
                writer.newLine();
                for (int j = 0; j < columns; j++) {
                    writer.write(tablica[i][j]);
                }
            }

            System.out.println("Zapisano do pliku: " + nazwaPliku);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static char[][] odczytajZPliku(String nazwaPliku) {
        char[][] tablica = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
            String rozmiar = reader.readLine();
            String[] rozmiarArray = rozmiar.split(" ");
            int rows = Integer.parseInt(rozmiarArray[0]);
            int columns = Integer.parseInt(rozmiarArray[1]);

            tablica = new char[rows][columns];

            for (int i = 0; i < rows; i++) {
                String line = reader.readLine();
                for (int j = 0; j < columns; j++) {
                    tablica[i][j] = line.charAt(j);
                }
            }

            System.out.println("Odczytano z pliku: " + nazwaPliku);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tablica;
    }

    public static void main(String[] args) {
        char[][] mojaTablica = {
                {'a', 'b', 'c'},
                {'x', 'y', 'z'},
                {'1', '2', '3'}
        };

        zapiszDoPliku(mojaTablica, "plik_z_danymi.txt");

        char[][] odczytanaTablica = odczytajZPliku("plik_z_danymi.txt");

        for (char[] row : odczytanaTablica) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
