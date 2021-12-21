package main;

import main.konsole.*;
import main.personen.PersonData;

public class main {
    public static void main(String[] args) {

        Function function = new Function();
        History history = new History();
        PersonData personData = new PersonData();
        Creator creator = new Creator();
        Menu menu = new Menu();

        menu.setup(function, personData);
        menu.m1(function, history, personData, creator);


    }
}
