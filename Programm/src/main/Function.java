package main;

import main.personen.*;

import java.util.ArrayList;
import java.util.Locale;

public class Function {

    private String firmenName = "Test Company";
    private Arbeiter[] arbeiterListe = new Arbeiter[17];
    private Manager[] managerListe = new Manager[2];
    private Geschaeftsfuehrer[] geschaeftsfuehrerListe = new Geschaeftsfuehrer[1];
    private ZeitArbeiter[] zeitArbeiterListe = new ZeitArbeiter[99];

    private ArrayList<Person[]> personArrayList = new ArrayList<>();

    private History history = new History();

    public void setPersonArrayList() {
        System.out.println("setPersonenArray");
        personArrayList.add(arbeiterListe);
        personArrayList.add(managerListe);
        personArrayList.add(geschaeftsfuehrerListe);
        personArrayList.add(zeitArbeiterListe);
    }

    public void setID(Person person) {

        setPersonArrayList();

        String idString = firmenName.substring(0, 3).toUpperCase(Locale.ROOT);
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
        System.out.println("addArbeiter - test");
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
            if (arbeiterListe[i] != null) {
                if (arbeiterListe[i].getId().equals(id)) {
                    arbeiterListe[i] = null;
                    history.personChanged(arbeiterListe[i], 2);
                    r = true;
                }
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

    public boolean removeManager(String id) {
        boolean r = false;
        for (int i = 0; i < managerListe.length; i++) {
            if (managerListe[i] != null) {
                if (managerListe[i].getId().equals(id)) {
                    managerListe[i] = null;
                    history.personChanged(managerListe[i], 2);
                    r = true;
                }
            }
        }
        return r;
    }

    public boolean addGeschaeftsfuehrer(Geschaeftsfuehrer geschaeftsfuehrer) {
        boolean r = false;
        for (int i = 0; i < geschaeftsfuehrerListe.length; i++) {
            if (geschaeftsfuehrerListe[i] == null) {
                geschaeftsfuehrerListe[i] = geschaeftsfuehrer;
                System.out.println("2 "+ geschaeftsfuehrer);
                System.out.println( i + " addGeschaeftsfuehrer - confirm");
                r = true;
                break;

            }
        }
        return r;
    }

    public boolean removeGeschaeftsfuehrer(String id) {
        boolean r = false;
        for (int i = 0; i < geschaeftsfuehrerListe.length; i++) {
            if (geschaeftsfuehrerListe[i] != null) {
                if (geschaeftsfuehrerListe[i].getId().equals(id)) {
                    geschaeftsfuehrerListe[i] = null;
                    history.personChanged(geschaeftsfuehrerListe[i], 2);
                    r = true;
                }
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

    public boolean removeZeitArbeiter(String id) {
        boolean r = false;
        for (int i = 0; i < zeitArbeiterListe.length; i++) {
            if (zeitArbeiterListe[i] != null) {
                if (zeitArbeiterListe[i].getId().equals(id)) {
                    zeitArbeiterListe[i] = null;
                    history.personChanged(zeitArbeiterListe[i], 2);
                    r = true;
                }
            }
        }
        return r;
    }


    public String getFirmenName() {
        return firmenName;
    }

    public void setFirmenName(String firmenName) {
        this.firmenName = firmenName;
    }

    public ArrayList<Person[]> getPersonArrayList() {
        return personArrayList;
    }

    public void setPersonArrayList(ArrayList<Person[]> personArrayList) {
        this.personArrayList = personArrayList;
    }

    public Arbeiter[] getArbeiterListe() {
        return arbeiterListe;
    }

    public void setArbeiterListe(Arbeiter[] arbeiterListe) {
        this.arbeiterListe = arbeiterListe;
    }

    public Manager[] getManagerListe() {
        return managerListe;
    }

    public void setManagerListe(Manager[] managerListe) {
        this.managerListe = managerListe;
    }

    public Geschaeftsfuehrer[] getGeschaeftsfuehrerListe() {
        return geschaeftsfuehrerListe;
    }

    public void setGeschaeftsfuehrerListe(Geschaeftsfuehrer[] geschaeftsfuehrerListe) {
        this.geschaeftsfuehrerListe = geschaeftsfuehrerListe;
    }

    public ZeitArbeiter[] getZeitArbeiterListe() {
        return zeitArbeiterListe;
    }

    public void setZeitArbeiterListe(ZeitArbeiter[] zeitArbeiterListe) {
        this.zeitArbeiterListe = zeitArbeiterListe;
    }
}
