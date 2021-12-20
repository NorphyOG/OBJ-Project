package main.personen;

import java.time.LocalDate;

public class Geschaeftsfuehrer extends Person{

    private double zuschlag;

    public Geschaeftsfuehrer(String vorname, String nachname, char geschlecht, String adresse, LocalDate geb, LocalDate eintritt, double lohnM, double zuschlag, int arbeitsStunden) {
        super(vorname, nachname, geschlecht, adresse, geb, eintritt, lohnM, arbeitsStunden);
        this.zuschlag = zuschlag;
    }

    public void setLohnGeschäftsführer(Geschaeftsfuehrer geschaeftsfuehrer) {
        double gehaltM = geschaeftsfuehrer.getLohnM();
        int arbeitsStunden = geschaeftsfuehrer.getArbeitsStunden();
        double zuschlag = geschaeftsfuehrer.getZuschlag();

        double gehalt = gehaltM * 12;
        if (arbeitsStunden <= 160) {
            gehalt = gehalt + ((gehaltM / 730) * überstunden(arbeitsStunden));
        } else {
            gehalt = gehalt - ((gehaltM / 730) * überstunden(arbeitsStunden));
        }
        gehalt = gehalt + zuschlag;

        geschaeftsfuehrer.setLohn(gehalt);
    }

    @Override
    public String toString() {
        return "Geschaeftsfuehrer{" +
                "zuschlag=" + zuschlag +
                '}';
    }

    public double getZuschlag() {
        return zuschlag;
    }

    public void setZuschlag(double zuschlag) {
        this.zuschlag = zuschlag;
    }
}
