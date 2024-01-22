public class Zadanie01 {
    private int godziny;
    private int minuty;
    private int sekundy;
    private boolean format24h;

    public Zadanie01() {
        this.godziny = 0;
        this.minuty = 0;
        this.sekundy = 0;
        this.format24h = true;
    }

    public Zadanie01(int godziny, int minuty, int sekundy, boolean format24h) {
        ustawCzas(godziny, minuty, sekundy);
        this.format24h = format24h;
    }

    public void ustawCzas(int godziny, int minuty, int sekundy) {
        if (godziny >= 0 && godziny < 24 && minuty >= 0 && minuty < 60 && sekundy >= 0 && sekundy < 60) {
            this.godziny = godziny;
            this.minuty = minuty;
            this.sekundy = sekundy;
        } else {
            System.out.println("Błąd: Niepoprawne wartości czasu.");
        }
    }

    public void wypiszCzas() {
        String format = format24h ? "%02d:%02d:%02d" : "%02d:%02d:%02d %s";
        int hour = format24h ? godziny : (godziny == 0 || godziny == 12) ? 12 : godziny % 12;
        String amPm = godziny < 12 ? "AM" : "PM";
        System.out.printf(format, hour, minuty, sekundy, format24h ? "" : amPm);
        System.out.println();
    }

    public int liczbaMinutOdPolnocy() {
        return godziny * 60 + minuty;
    }

    public void zmienCzas(int godziny, int minuty, int sekundy) {
        ustawCzas(this.godziny + godziny, this.minuty + minuty, this.sekundy + sekundy);
    }

    public void ustawFormat24h(boolean format24h) {
        this.format24h = format24h;
    }

    public void zmienCzasOIleSekund(int iloscSekund) {
        if (iloscSekund > 0) {
            int nowyCzas = (godziny * 3600 + minuty * 60 + sekundy + iloscSekund) % (24 * 3600);
            godziny = nowyCzas / 3600;
            minuty = (nowyCzas % 3600) / 60;
            sekundy = nowyCzas % 60;
        } else {
            System.out.println("Błąd: Ilość sekund musi być dodatnia.");
        }
    }

    public static void main(String[] args) {
        Zadanie01 zegarek = new Zadanie01(12, 30, 45, true);

        zegarek.wypiszCzas();
        System.out.println("Liczba minut od północy: " + zegarek.liczbaMinutOdPolnocy());

        zegarek.zmienCzas(1, 15, 10);
        zegarek.wypiszCzas();

        zegarek.ustawFormat24h(false);
        zegarek.wypiszCzas();

        zegarek.zmienCzasOIleSekund(3600);
        zegarek.wypiszCzas();
    }
}
