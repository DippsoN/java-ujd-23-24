import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Zadanie02 {
    private int dzien;
    private int miesiac;
    private int rok;

    public Zadanie02(int dzien, int miesiac, int rok) {
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }

    public void wypiszDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        Date date = new Date(rok - 1900, miesiac - 1, dzien);
        System.out.println(dateFormat.format(date));
    }

    public void nastepnyDzien() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(rok, miesiac - 1, dzien);
        calendar.add(Calendar.DAY_OF_MONTH, 1);

        this.dzien = calendar.get(Calendar.DAY_OF_MONTH);
        this.miesiac = calendar.get(Calendar.MONTH) + 1;
        this.rok = calendar.get(Calendar.YEAR);
    }

    public void poprzedniDzien() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(rok, miesiac - 1, dzien);
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        this.dzien = calendar.get(Calendar.DAY_OF_MONTH);
        this.miesiac = calendar.get(Calendar.MONTH) + 1;
        this.rok = calendar.get(Calendar.YEAR);
    }

    public int dzienRoku() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(rok, miesiac - 1, dzien);
        return calendar.get(Calendar.DAY_OF_YEAR);
    }

    public boolean czyPrzestepny() {
        return (rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0);
    }

    public int roznicaDni(Zadanie02 innaData) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        try {
            Date date1 = dateFormat.parse(this.dzien + "." + this.miesiac + "." + this.rok);
            Date date2 = dateFormat.parse(innaData.dzien + "." + innaData.miesiac + "." + innaData.rok);

            long roznicaMillis = Math.abs(date1.getTime() - date2.getTime());
            return (int) (roznicaMillis / (24 * 60 * 60 * 1000));

        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static void main(String[] args) {
        Zadanie02 data = new Zadanie02(15, 1, 2024);

        data.wypiszDate();
        data.nastepnyDzien();
        data.wypiszDate();
        data.poprzedniDzien();
        data.wypiszDate();

        System.out.println("Numer dnia roku: " + data.dzienRoku());
        System.out.println("Czy rok przestępny? " + data.czyPrzestepny());

        Zadanie02 innaData = new Zadanie02(1, 1, 2024);
        System.out.println("Różnica dni między datami: " + data.roznicaDni(innaData));
    }
}
