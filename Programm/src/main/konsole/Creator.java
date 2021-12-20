package main.konsole;

import main.personen.Person;
import main.personen.ZeitArbeiter;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Creator {

    public Person createPerson(int switchLevel) {
        //0=ZeitArbeiter 1=Arbeiter 2=Manager 3=Geschaeftsfuehrer
        Scanner sc = new Scanner(System.in);
        Overlay overlay = new Overlay();

        //Person
        String vorname, nachname;
        char geschlecht;
        String adresse;
        LocalDate geb;
        LocalDate eintritt;
        double lohnM;
        int arbeitsStunden;

        //ZeitArbeiter
        int arbeitsZeitM;

        //Manager
        Person[] gewPersonenListe;
        double provision;

        //GFührer
        double zuschlag;


        overlay.setOption1("Vorname eigeben");
        overlay.o1ss(false);
        vorname = sc.next();

        overlay.setOption1("Nachname eigeben");
        overlay.o1ss(false);
        nachname = sc.next();

        overlay.setOption1("Geschlecht aussuchen | 1 = M | 2 = W | 3 = X |");
        overlay.o1ss(false);
        boolean run = true;
        while (run) {
            int input = 0;
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1ss(true);
                sc.next();
            }
            switch (input) {
                case 1 -> {
                    geschlecht = 'M';
                    run = false;
                }
                case 2 -> {
                    geschlecht = 'W';
                    run = false;
                }
                case 3 -> {
                    geschlecht = 'X';
                    run = false;
                }
                default -> {
                    overlay.setErr("Error (Keine gültige Eingabe)");
                    overlay.o1ss(true);
                }
            }
        }

        switch (switchLevel) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }


    }

}
