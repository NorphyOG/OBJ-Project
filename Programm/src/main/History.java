package main;

import main.personen.Person;
import java.time.LocalDate;
import java.util.ArrayList;

public class History {

    private ArrayList<String> historySides = new ArrayList<>();
    private ArrayList<Person> personRemovedHistory = new ArrayList<>();


    public void selfSet(String changed) {
        historySides.add(" " + LocalDate.now() + " " + changed);
    }


    public String lastRemovedPersonList() {
        String out = null;
        for (Person v : personRemovedHistory) {
            if (out == null) {
                out = v + "\n";
            } else {
                out = out + v + "\n";
            }
        }
        return out;
    }

    public void personChanged(Person person, int changedLevel) {
        String string;
        switch (changedLevel) {
            case 1:
                string = "[+] Added " + person.getClass().getSimpleName() + " (ID: " + person.getId() + ") > { Name: " + person.getVorname() + " " + person.getNachname() + " }";
                selfSet(string);
                break;
            case 2:
                string = "[-] Removed " + person.getClass().getSimpleName() + " (ID: " + person.getId() + ") > { Name: " + person.getVorname() + " " + person.getNachname() + " }";
                personRemovedHistory.add(person);
                selfSet(string);
                break;
            case 3:
                string = "[~] Changed " + person.getClass().getSimpleName() + " (ID: " + person.getId() + ") > { Name: " + person.getVorname() + " " + person.getNachname() + " }";
                selfSet(string);
                break;
        }
    }

    public void gehaltChnaged(Person person, double wert, int changedLevel) {
        String string;
        switch (changedLevel) {
            case 0:
                string = "[~] Changed Gehalt (ID: " + person.getId() + ") > { Name: " + person.getVorname() + " " + person.getNachname() + " } -> { " + (person.getLohn() - wert) + " to " + person.getLohn() + " }";
                selfSet(string);
                break;
            case 1:
                string = "[+] Changed Prämie (ID: " + person.getId() + ") > { Name: " + person.getVorname() + " " + person.getNachname() + " } -> { " + (person.getLohn() - wert) + " to " + person.getLohn() + " }";
                selfSet(string);
                break;
        }
    }




    public ArrayList<String> getHistorySides() {
        return historySides;
    }

    public void setHistorySides(ArrayList<String> historySides) {
        this.historySides = historySides;
    }

    public ArrayList<Person> getPersonRemovedHistory() {
        return personRemovedHistory;
    }

    public void setPersonRemovedHistory(ArrayList<Person> personRemovedHistory) {
        this.personRemovedHistory = personRemovedHistory;
    }

}
