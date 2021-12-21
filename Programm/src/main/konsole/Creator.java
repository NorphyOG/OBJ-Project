package main.konsole;

import main.Function;
import main.History;
import main.personen.Arbeiter;
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
        char geschlecht = 0;
        String adresse;
        int jahr = 0, monat = 0, tag = 0;
        LocalDate geb;
        LocalDate eintritt;
        double lohnM = 0;
        int arbeitsStunden = 0;

        //ZeitArbeiter
        int arbeitsZeitM = 0;

        //Manager
        Person[] gewPersonenListe;
        double provision = 0;

        //GFührer
        double zuschlag = 0;


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

        History history = new History();
        Function function = new Function();
        switch (switchLevel) {
            case 0:
                ff = false;
                run = true;
                while (run) {
                    if (!ff) {
                        overlay.setOption1("Arbeits zeit in Monaten eigeben");
                        overlay.o1ss(false);
                    }
                    try {
                        arbeitsZeitM = sc.nextInt();
                        run = false;
                        ff = false;
                    } catch (InputMismatchException e) {
                        overlay.setErr("Error (Keine gültige Eingabe)");
                        overlay.o1ss(true);
                        ff = true;
                        sc.next();
                    }
                }

                ZeitArbeiter zeitArbeiter = new ZeitArbeiter(vorname, nachname, geschlecht, adresse, geb, eintritt, lohnM, arbeitsStunden, arbeitsZeitM);
                zeitArbeiter.setLohnZeitArbeiter(zeitArbeiter);
                function.setID(zeitArbeiter);
                history.personChanged(zeitArbeiter, 1);
                return zeitArbeiter;
                break;
            case 1:
                Arbeiter arbeiter = new Arbeiter(vorname, nachname, geschlecht, adresse, geb, eintritt, lohnM, arbeitsStunden);
                arbeiter.setLohnArbeiter(arbeiter);
                function.setID(arbeiter);
                history.personChanged(arbeiter, 1);
                return arbeiter;
                break;
            case 2:
                int angeworben = 0;
                ff = false;
                run = true;
                while (run) {
                    if (!ff) {
                        overlay.setOption1("Wie viel leute hat er angeworben?");
                        overlay.o1ss(false);
                    }
                    try {
                        angeworben = sc.nextInt();
                        run = false;
                        ff = false;
                    } catch (InputMismatchException e) {
                        overlay.setErr("Error (Keine gültige Eingabe)");
                        overlay.o1ss(true);
                        ff = true;
                        sc.next();
                    }
                }


                break;
            case 3:
                break;
        }


    }

}
