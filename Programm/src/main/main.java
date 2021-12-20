package main;

import main.konsole.Overlay;
import main.personen.*;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        History history = new History();

        Function function = new Function();
        function.setFirmanName("KappaGen");

        Arbeiter arbeiter = new Arbeiter("Klaus", "Hurn", 'M', "Andika Str. 12", LocalDate.of(1988, 12, 8), LocalDate.of(2015, 10, 10), 5650, 164);
        Arbeiter arbeiter1 = new Arbeiter("Kali", "Hirn", 'M', "Frane Str. 812", LocalDate.of(1988, 9, 21), LocalDate.of(2001, 11, 24), 6120, 154);


        arbeiter.setLohnArbeiter(arbeiter);
        arbeiter1.setLohnArbeiter(arbeiter1);

        function.addArbeiter(arbeiter);
        function.addArbeiter(arbeiter1);

        function.setID(arbeiter);
        function.setID(arbeiter1);


        history.personChanged(arbeiter, 0);
        history.personChanged(arbeiter1, 0);


        System.out.println(arbeiter);
        System.out.println(arbeiter1);


        System.out.println(history.getHistorySides());



        Overlay test = new Overlay();
        test.o1();
        test.o2();
    }
}
