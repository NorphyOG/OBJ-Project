package main.personen;

import java.time.LocalDate;

public class Arbeiter extends Person{


    public Arbeiter(String vorname, String nachname, char geschlecht, String adresse, LocalDate geb, LocalDate eintritt, double lohnM, int arbeitsStunden) {
        super(vorname, nachname, geschlecht, adresse, geb, eintritt, lohnM, arbeitsStunden);
    }

    public void setLohnArbeiter(Arbeiter arbeiter) {
        double gehaltM = arbeiter.getLohnM();
        int arbeitsStunden = arbeiter.getArbeitsStunden();

        double gehalt = gehaltM * 12;
        if (arbeitsStunden <= 160) {
            gehalt = gehalt + ((gehaltM / 730) * ueberstunden(arbeitsStunden));
        } else {
            gehalt = gehalt - ((gehaltM / 730) * ueberstunden(arbeitsStunden));
        }

        arbeiter.setLohn(gehalt);
    }


}
