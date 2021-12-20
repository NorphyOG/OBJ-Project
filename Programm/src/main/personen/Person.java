package main.personen;

import java.time.LocalDate;

public class Person {
    private String id;
    private String vorname;
    private String nachname;
    private char geschlecht;
    private String adresse;
    private LocalDate geb;
    private LocalDate eintritt;
    private double lohn;
    private double lohnM;
    private int arbeitsStunden;

    public Person(String vorname,String nachname, char geschlecht, String adresse, LocalDate geb, LocalDate eintritt, double lohnM, int arbeitsStunden) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geschlecht = geschlecht;
        this.adresse = adresse;
        this.geb = geb;
        this.eintritt = eintritt;
        this.lohnM = lohnM;
        this.arbeitsStunden = arbeitsStunden;
    }

    public void givePrämie(Person person, double wert) {
        person.setLohn(getLohn() + wert);
    }

    public int überstunden(int arbeitsStunden) {
        return arbeitsStunden - 160;
    }

    public void gehaltsErhöhung(double lohnM, double prozent) {
        setLohnM(lohnM * prozent);
    }


    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geschlecht=" + geschlecht +
                ", adresse='" + adresse + '\'' +
                ", geb=" + geb +
                ", eintritt=" + eintritt +
                ", lohn=" + lohn +
                ", lohnM=" + lohnM +
                ", arbeitsStunden=" + arbeitsStunden +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public double getLohnM() {
        return lohnM;
    }

    public void setLohnM(double lohnM) {
        this.lohnM = lohnM;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public LocalDate getGeb() {
        return geb;
    }

    public void setGeb(LocalDate geb) {
        this.geb = geb;
    }

    public LocalDate getEintritt() {
        return eintritt;
    }

    public void setEintritt(LocalDate eintritt) {
        this.eintritt = eintritt;
    }

    public double getLohn() {
        return lohn;
    }

    public void setLohn(double lohn) {
        this.lohn = lohn;
    }

    public int getArbeitsStunden() {
        return arbeitsStunden;
    }

    public void setArbeitsStunden(int arbeitsStunden) {
        this.arbeitsStunden = arbeitsStunden;
    }
}


