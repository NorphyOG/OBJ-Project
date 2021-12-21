package main.personen;

import java.time.LocalDate;
import java.util.Arrays;

public class Manager extends Arbeiter {

    private Person[] gewPersonenListe;
    private double provision;

    public Manager(String vorname, String nachname, char geschlecht, String adresse, LocalDate geb, LocalDate eintritt, double lohnM, int arbeitsStunden, Person[] gewPersonenListe, double provision) {
        super(vorname, nachname, geschlecht, adresse, geb, eintritt, lohnM, arbeitsStunden);
        this.provision = provision;
        this.gewPersonenListe = gewPersonenListe;
    }

    public void setLohnManager(Manager manager) {
        double gehaltM = manager.getLohnM();
        int arbeitsStunden = manager.getArbeitsStunden();
        double provision = manager.getProvision();
        Person[] gewPersonenListe = manager.getGewPersonenListe();

        double gehalt = gehaltM * 12;
        if (arbeitsStunden <= 160) {
            gehalt = gehalt + ((gehaltM / 730) * ueberstunden(arbeitsStunden));
        } else {
            gehalt = gehalt - ((gehaltM / 730) * ueberstunden(arbeitsStunden));
        }

        for (Person person : gewPersonenListe) {
            gehalt = gehalt + (person.getLohn() * provision);
        }

        manager.setLohn(gehalt);
    }


    @Override
    public String toString() {
        return "Manager{" +
                "gewPersonenListe=" + Arrays.toString(gewPersonenListe) +
                ", provision=" + provision +
                '}';
    }

    public Person[] getGewPersonenListe() {
        return gewPersonenListe;
    }

    public void setGewPersonenListe(Person[] gewPersonenListe) {
        this.gewPersonenListe = gewPersonenListe;
    }

    public double getProvision() {
        return provision;
    }

    public void setProvision(double provision) {
        this.provision = provision;
    }
}
