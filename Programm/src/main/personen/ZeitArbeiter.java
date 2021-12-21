package main.personen;

import java.time.LocalDate;

public class ZeitArbeiter extends Person{
    private int arbeitsZeitM;
    public ZeitArbeiter(String vorname, String nachname, char geschlecht, String adresse, LocalDate geb, LocalDate eintritt, double lohnM, int arbeitsStunden, int arbeitsZeitM) {
        super(vorname, nachname, geschlecht, adresse, geb, eintritt, lohnM, arbeitsStunden);
        this.arbeitsZeitM = arbeitsZeitM;
    }

    public void setLohnZeitArbeiter(ZeitArbeiter zeitArbeiter) {
        double gehaltM = zeitArbeiter.getLohnM();
        int arbeitsStunden = zeitArbeiter.getArbeitsStunden();

        double gehalt = gehaltM * arbeitsZeitM;
        if (arbeitsStunden <= 160) {
            gehalt = gehalt + ((gehaltM / 730) * ueberstunden(arbeitsStunden));
        } else {
            gehalt = gehalt - ((gehaltM / 730) * ueberstunden(arbeitsStunden));
        }

        zeitArbeiter.setLohn(gehalt);
    }


    @Override
    public String toString() {
        return "ZeitArbeiter{" +
                "arbeitsZeitM=" + arbeitsZeitM +
                '}';
    }
}
