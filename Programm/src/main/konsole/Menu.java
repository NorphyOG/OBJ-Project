package main.konsole;

import main.Function;
import main.History;
import main.personen.Geschaeftsfuehrer;
import main.personen.PersonData;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public void leer() {
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
    }

    public void setup() {
        Scanner sc = new Scanner(System.in);
        Overlay overlay = new Overlay();
        int input = 0;
        boolean run = true;
        boolean switch1 = false;


        overlay.setPanelName1(" OBJ Project - Setup");
        overlay.setPanelName2(" Info");

        overlay.setOption1(" 1 = Set Company Name");
        overlay.setShow1(" None");
        overlay.setOption2(" 2 = Toggle Preset Data");
        overlay.setShow2(" false");
        overlay.setOption3(" 3 = Confirm");
        overlay.setShow3(" ✗ -> ✓");

        overlay.o2(false);

        int a = 0;
        while (run) {
            try {
                if (a >= 1) {
                    overlay.o2(false);
                }
                input = sc.nextInt();
                a++;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o2(true);
                sc.next();
            }
            switch (input) {
                case 1 -> {
                    overlay.setErr("Input Company Name");
                    overlay.o2(true);
                    Function function = new Function();
                    String string = "Test Company";
                    string = sc.next();
                    function.setFirmenName(string);
                    overlay.setShow1(" " + string);
                }
                case 2 -> {
                    PersonData personData = new PersonData();
                    switch1 = !switch1;
                    overlay.setShow2(" " + switch1);
                    personData.setUseDataPresent(switch1);
                }
                case 3 -> run = false;
                default -> {
                    overlay.setErr("Error (Keine gültige Eingabe)");
                    overlay.o2(true);
                }
            }

        }
    }

    private boolean switchA = false;

    public void m1() {
        Scanner sc = new Scanner(System.in);
        Overlay overlay = new Overlay();
        int input = 0;
        boolean run = true;
        PersonData personData = new PersonData();

        if (!personData.dataPresent()) {
            overlay.setPanelName1(" OBJ Project - Main Menu with Data");
            personData.dataPresent();
        } else {
            overlay.setPanelName1(" OBJ Project - Main Menu");
        }
        overlay.setOption1(" 1 = Show Data");
        overlay.setOption2(" 2 = Manage Data");
        overlay.setOption3(" 3 = History");
        overlay.setOption4(" 4 = Exit");
        overlay.o1s(false);
        while (run) {
            if (switchA) {
                overlay.o1s(false);
            }
            try {
                input = sc.nextInt();
                switchA = true;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1s(true);
                sc.next();
            }
            switch (input) {
                case 1:
                    m2();
                    break;
                case 2:
                    m5();
                    break;
                case 3:
                    m3();
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    overlay.setErr("Error (Keine gültige Eingabe)");
                    overlay.o1s(true);
                    break;
            }

        }

    }
    public void m2() {
        Scanner sc = new Scanner(System.in);
        Overlay overlay = new Overlay();
        int input = 0;
        boolean run = true;

        Function function = new Function();
        PersonData personData = new PersonData();
        Geschaeftsfuehrer geschaeftsfuehrer = new Geschaeftsfuehrer("Günter","Gehindert", 'M', "Scheideweg 3", LocalDate.of(1988, 12,12), LocalDate.of(2010, 12, 22),8000,1.02,40);
        personData.setup(null, null, null , geschaeftsfuehrer, 1);

        System.out.println(function.getPersonArrayList());

        System.out.println(Arrays.toString(function.getZeitArbeiterListe()));
        System.out.println(Arrays.toString(function.getArbeiterListe()));
        System.out.println(Arrays.toString(function.getManagerListe()));
        System.out.println(Arrays.toString(function.getGeschaeftsfuehrerListe()));

        overlay.setPanelName1(" Show Menu");
        overlay.setOption1(" [3 = Exit Show Modus]");
        overlay.o1d(false);
        while (run) {
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1d(true);
                sc.next();
            }
            if (input == 3) {
                run = false;
            } else {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1d(true);
            }

        }

    }

    private boolean switchB = false;
    public void m3() {
        Scanner sc = new Scanner(System.in);
        Overlay overlay = new Overlay();
        int input = 0;
        boolean run = true;

        overlay.setPanelName1(" History Menu");
        overlay.setOption1(" 1 = History List");
        overlay.setOption2(" 2 = Last Removed Person");
        overlay.setOption3(" 3 = Back");
        overlay.o1(false);
        while (run) {
            if (switchB) {
                overlay.o1(false);
            }
            try {
                input = sc.nextInt();
                switchB = true;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1(true);
                sc.next();
            }
            switch (input) {
                case 1:
                    m4();
                    break;
                case 2:
                    m6();
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    overlay.setErr("Error (Keine gültige Eingabe)");
                    overlay.o1(true);
                    break;
            }

        }

    }

    public void m4() {
        Scanner sc = new Scanner(System.in);
        Overlay overlay = new Overlay();
        int input = 0;
        boolean run = true;

        overlay.setPanelName1(" History List");
        overlay.setOption1(" [3 = Exit Show Modus]");
        overlay.o1h(false);
        while (run) {
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1h(true);
                sc.next();
            }
            if (input == 3) {
                run = false;
            } else {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1h(true);
            }

        }

    }

    private boolean switchC = false;
    public void m5() {
        Scanner sc = new Scanner(System.in);
        Overlay overlay = new Overlay();
        int input = 0;
        boolean run = true;

        overlay.setPanelName1(" Manage Menu");
        overlay.setOption1(" 1 = Add/Remove Person");
        overlay.setOption2(" 2 = Gehalt Manage");
        overlay.setOption3(" 3 = Back");
        overlay.o1(false);
        while (run) {
            if (switchC) {
                overlay.o1(false);
            }
            try {
                input = sc.nextInt();
                switchC = true;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1(true);
                sc.next();
            }
            switch (input) {
                case 1:
                    m7();
                    break;
                case 2:

                    break;
                case 3:
                    run = false;
                    break;
                default:
                    overlay.setErr("Error (Keine gültige Eingabe)");
                    overlay.o1(true);
                    break;
            }

        }

    }

    public void m6() {
        Scanner sc = new Scanner(System.in);
        Overlay overlay = new Overlay();
        int input = 0;
        boolean run = true;

        overlay.setPanelName1(" Last Removed Persons");
        overlay.setOption1(" [3 = Exit Show Modus]");
        overlay.o1rp(false);
        while (run) {
            try {
                input = sc.nextInt();
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1rp(true);
                sc.next();
            }
            if (input == 3) {
                run = false;
            } else {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1rp(true);
            }

        }

    }

    private boolean switchD = false;
    public void m7() {
        Scanner sc = new Scanner(System.in);
        Overlay overlay = new Overlay();
        int input = 0;
        boolean run = true;

        overlay.setPanelName1(" Add/Remove Person");
        overlay.setOption1(" 1 = Add/Remove Zeit Arbeiter");
        overlay.setOption2(" 2 = Add/Remove Arbeiter");
        overlay.setOption3(" 3 = Add/Remove Manager");
        overlay.setOption4(" 4 = Add/Remove Geschäftsführer");
        overlay.setOption5(" 5 = Back");
        overlay.o1big(false);
        while (run) {
            if (switchD) {
                overlay.o1big(false);
            }
            try {
                input = sc.nextInt();
                switchD = true;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1big(true);
                sc.next();
            }
            switch (input) {
                case 1:
                    m8();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    run = false;
                    break;
                default:
                    overlay.setErr("Error (Keine gültige Eingabe)");
                    overlay.o1big(true);
                    break;
            }

        }

    }

    private boolean switchE = false;
    public void m8() {
        Scanner sc = new Scanner(System.in);
        Overlay overlay = new Overlay();
        int input = 0;
        boolean run = true;

        overlay.setPanelName1(" Add/Remove Zeit Arbeiter");
        overlay.setOption1(" 1 = Add Zeit Arbeiter");
        overlay.setOption2(" 2 = Remove Zeit Arbeiter");
        overlay.setOption3(" 3 = Back");
        overlay.o1(false);

        boolean a1 = false;
        while (run) {
            if (switchE) {
                if (a1) {
                    overlay.o1(true);
                } else {
                    overlay.o1(false);
                }
            }
            try {
                input = sc.nextInt();
                switchE = true;
            } catch (InputMismatchException e) {
                overlay.setErr("Error (Keine gültige Eingabe)");
                overlay.o1(true);
                sc.next();
            }
            Function function = new Function();
            Creator creator = new Creator();
            History history = new History();
            switch (input) {
                case 1:
                    creator.createPerson(0);
                    break;
                case 2:

                    overlay.setErr("ID eingeben um Person zu löschen");
                    overlay.o1(true);
                    String idString = sc.next();
                    boolean a = function.removeZeitArbeiter(idString);
                    if (a) {
                        overlay.setErr("Erfolgreich Removed");
                    } else {
                        overlay.setErr("Konnte nicht Removed werden");
                    }
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    overlay.setErr("Error (Keine gültige Eingabe)");
                    overlay.o1(true);
                    break;
            }

        }

    }

}
