public class Zadanie03 {
    private int licznik;
    private int mianownik;

    public Zadanie03(int licznik, int mianownik) {
        if (mianownik != 0) {
            this.licznik = licznik;
            this.mianownik = mianownik;
            skroc();
        } else {
            System.out.println("Błąd: Mianownik nie może być równy 0.");
        }
    }

    public void wypisz() {
        System.out.println(licznik + "/" + mianownik);
    }

    public void wypiszCalosc() {
        if (licznik >= mianownik) {
            int calosc = licznik / mianownik;
            int reszta = licznik % mianownik;
            System.out.println(calosc + " " + reszta + "/" + mianownik);
        } else {
            System.out.println(licznik + "/" + mianownik);
        }
    }

    private int NWD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void skroc() {
        int nwd = NWD(Math.abs(licznik), Math.abs(mianownik));
        licznik /= nwd;
        mianownik /= nwd;

        if (mianownik < 0) {
            licznik = -licznik;
            mianownik = -mianownik;
        }
    }

    public static Zadanie03 dodaj(Zadanie03 u1, Zadanie03 u2) {
        int nowyLicznik = u1.licznik * u2.mianownik + u2.licznik * u1.mianownik;
        int nowyMianownik = u1.mianownik * u2.mianownik;
        return new Zadanie03(nowyLicznik, nowyMianownik);
    }

    public static Zadanie03 odejmij(Zadanie03 u1, Zadanie03 u2) {
        int nowyLicznik = u1.licznik * u2.mianownik - u2.licznik * u1.mianownik;
        int nowyMianownik = u1.mianownik * u2.mianownik;
        return new Zadanie03(nowyLicznik, nowyMianownik);
    }

    public static Zadanie03 pomnoz(Zadanie03 u1, Zadanie03 u2) {
        int nowyLicznik = u1.licznik * u2.licznik;
        int nowyMianownik = u1.mianownik * u2.mianownik;
        return new Zadanie03(nowyLicznik, nowyMianownik);
    }

    public static void main(String[] args) {
        Zadanie03 u1 = new Zadanie03(1, 2);
        Zadanie03 u2 = new Zadanie03(3, 4);

        System.out.print("Ułamek 1: ");
        u1.wypisz();

        System.out.print("Ułamek 2: ");
        u2.wypisz();

        System.out.print("Ułamek 1 jako całość: ");
        u1.wypiszCalosc();

        System.out.print("Ułamek 2 jako całość: ");
        u2.wypiszCalosc();

        Zadanie03 suma = dodaj(u1, u2);
        System.out.print("Suma: ");
        suma.wypisz();

        Zadanie03 roznica = odejmij(u1, u2);
        System.out.print("Różnica: ");
        roznica.wypisz();

        Zadanie03 iloczyn = pomnoz(u1, u2);
        System.out.print("Iloczyn: ");
        iloczyn.wypisz();
    }
}
