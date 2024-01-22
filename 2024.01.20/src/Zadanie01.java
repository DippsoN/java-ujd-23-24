import java.io.*;
import java.util.Arrays;

public class Zadanie01 {
    public static void zapiszDoPliku(double[] tablica, String nazwaPliku) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(nazwaPliku))) {
            dos.writeInt(tablica.length);

            for (double element : tablica) {
                dos.writeDouble(element);
            }

            System.out.println("Zapisano do pliku: " + nazwaPliku);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double[] odczytajZPliku(String nazwaPliku) {
        double[] tablica = null;
        try (DataInputStream dis = new DataInputStream(new FileInputStream(nazwaPliku))) {
            int rozmiar = dis.readInt();
            tablica = new double[rozmiar];

            for (int i = 0; i < rozmiar; i++) {
                tablica[i] = dis.readDouble();
            }

            System.out.println("Odczytano z pliku: " + nazwaPliku);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tablica;
    }

    public static void main(String[] args) {
        double[] mojaTablica = {1.5, 2.8, 3.0, 4.2, 5.7};


        zapiszDoPliku(mojaTablica, "plik_z_danymi.txt");


        double[] odczytanaTablica = odczytajZPliku("plik_z_danymi.txt");

        System.out.println("Odczytana tablica: " + Arrays.toString(odczytanaTablica));
    }
}
