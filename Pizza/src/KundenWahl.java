import java.util.ArrayList;

public class KundenWahl {
    ArrayList<Pizza> wahlPizza;
    private ZahlungsArt wahlZahlung;

    public KundenWahl() {
        wahlPizza = new ArrayList<>();
    }


    public ArrayList<Pizza> getWahlPizza() {
        return wahlPizza;
    }

    public void setWahlPizza(Pizza wahlPizza) {
        this.wahlPizza.add(wahlPizza);
    }

    public void setWahlZahlung(ZahlungsArt wahlZahlung) {
        this.wahlZahlung = wahlZahlung;
    }

    public ZahlungsArt getZahlungsArt() {
        return wahlZahlung;
    }

}