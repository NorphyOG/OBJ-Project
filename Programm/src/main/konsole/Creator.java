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
        int jahr = 0, monat = 0, tag = 0;
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

        overlay.setOption1("Adresse eigeben");
        overlay.o1ss(false);
        adresse = sc.next();

        boolean ff = false;
        run = true;
        while (run) {
            if (!ff) {
                overlay.setOption1("Geburtstag Jahr eigeben");
                overlay.o1ss(false);
            }
            try {
                jahr = sc.nextInt();
                run = false;
                ff = false;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1ss(true);
                ff = true;
                sc.next();
            }
        }

        ff = false;
        run = true;
        while (run) {
            if (!ff) {
                overlay.setOption1("Geburtstag Monat eigeben");
                overlay.o1ss(false);
            }
            try {
                monat = sc.nextInt();
                run = false;
                ff = false;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1ss(true);
                ff = true;
                sc.next();
            }
        }

        ff = false;
        run = true;
        while (run) {
            if (!ff) {
                overlay.setOption1("Geburtstag Tag eigeben");
                overlay.o1ss(false);
            }
            try {
                tag = sc.nextInt();
                run = false;
                ff = false;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1ss(true);
                ff = true;
                sc.next();
            }
        }

        geb = LocalDate.of(jahr, monat, tag);

        eintritt = LocalDate.now();

        ff = false;
        run = true;
        while (run) {
            if (!ff) {
                overlay.setOption1("Monats Gehalt eigeben");
                overlay.o1ss(false);
            }
            try {
                lohnM = sc.nextDouble();
                run = false;
                ff = false;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1ss(true);
                ff = true;
                sc.next();
            }
        }

        ff = false;
        run = true;
        while (run) {
            if (!ff) {
                overlay.setOption1("Arbeitsstunden eigeben");
                overlay.o1ss(false);
            }
            try {
                arbeitsStunden = sc.nextInt();
                run = false;
                ff = false;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1ss(true);
                ff = true;
                sc.next();
            }
        }

        ff = false;
        run = true;
        while (run) {
            if (!ff) {
                overlay.setOption1("Eintritts Jahr eigeben");
                overlay.o1ss(false);
            }
            try {
                jahr = sc.nextInt();
                run = false;
                ff = false;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1ss(true);
                ff = true;
                sc.next();
            }
        }

        ff = false;
        run = true;
        while (run) {
            if (!ff) {
                overlay.setOption1("Eintritts Monat eigeben");
                overlay.o1ss(false);
            }
            try {
                monat = sc.nextInt();
                run = false;
                ff = false;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1ss(true);
                ff = true;
                sc.next();
            }
        }

        ff = false;
        run = true;
        while (run) {
            if (!ff) {
                overlay.setOption1("Eintritts Tag eigeben");
                overlay.o1ss(false);
            }
            try {
                tag = sc.nextInt();
                run = false;
                ff = false;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1ss(true);
                ff = true;
                sc.next();
            }
        }

        eintritt = LocalDate.of(jahr, monat, tag);

        

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
