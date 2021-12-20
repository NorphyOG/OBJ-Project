package main;

import main.personen.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Function {

    private String firmanName;
    private Arbeiter[] arbeiterListe = new Arbeiter[17];
    private Manager[] managerListe = new Manager[2];
    private Geschaeftsfuehrer[] geschaeftsfuehrerListe = new Geschaeftsfuehrer[1];
    private ZeitArbeiter[] zeitArbeiterListe = new ZeitArbeiter[99];
    private ArrayList<Person[]> personArrayList = new ArrayList<>();

    public void setPersonArrayList() {
        personArrayList.add(arbeiterListe);
        personArrayList.add(managerListe);
        personArrayList.add(geschaeftsfuehrerListe);
        personArrayList.add(zeitArbeiterListe);
    }

    public void setID(Person person) {

        setPersonArrayList();

        String idString = firmanName.substring(0, 3).toUpperCase(Locale.ROOT);
        idString = idString + String.valueOf(person.getGeschlecht()).toLowerCase(Locale.ROOT);
        idString = idString + String.valueOf(person.getGeb().getYear()).substring(2,4);
        idString = idString + String.valueOf(person.getVorname().charAt(0)).toUpperCase(Locale.ROOT);
        idString = idString + person.getNachname().substring(0, 1).toLowerCase(Locale.ROOT);
        idString = idString + person.getClass().getSimpleName().substring(0,2).toUpperCase(Locale.ROOT);

        int z = 0;
        for (Person[] v : personArrayList) {
            if (v != null) {
                for (Person value : v) {
                    if (value != null) {
                        if (value.getId() != null) {
                            if (value.getId().equals(idString)) {
                                z++;
                            }
                        }
                    }
                }
            }
        }

        if (z != 0) {
            idString = idString + z;
        }

        person.setId(idString);
    }

    public boolean addArbeiter(Arbeiter arbeiter) {
        boolean r = false;
        for (int i = 0; i < arbeiterListe.length; i++) {
            if (arbeiterListe[i] == null) {
                arbeiterListe[i] = arbeiter;
                r = true;
            }
        }
        return r;
    }

    public boolean removeArbeiter(String id) {
        boolean r = false;
        for (int i = 0; i < arbeiterListe.length; i++) {
            if (arbeiterListe[i].getId().equals(id)) {
                arbeiterListe[i] = null;
                r = true;
            }
        }
        return r;
    }

    public boolean addManager(Manager manager) {
        boolean r = false;
        for (int i = 0; i < managerListe.length; i++) {
            if (managerListe[i] == null) {
                managerListe[i] = manager;
                r = true;
            }
        }
        return r;
    }

    public boolean addGeschaeftsfuehrer(Geschaeftsfuehrer geschaeftsfuehrer) {
        boolean r = false;
        for (int i = 0; i < geschaeftsfuehrerListe.length; i++) {
            if (geschaeftsfuehrerListe[i] == null) {
                geschaeftsfuehrerListe[i] = geschaeftsfuehrer;
                r = true;
            }
        }
        return r;
    }

    public boolean addZeitArbeiter(ZeitArbeiter zeitArbeiter) {
        boolean r = false;
        for (int i = 0; i < zeitArbeiterListe.length; i++) {
            if (zeitArbeiterListe[i] == null) {
                zeitArbeiterListe[i] = zeitArbeiter;
                r = true;
            }
        }
        return r;
    }


    public String getFirmanName() {
        return firmanName;
    }

    public void setFirmanName(String firmanName) {
        this.firmanName = firmanName;
    }
}
