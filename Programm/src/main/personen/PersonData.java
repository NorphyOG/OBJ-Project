package main.personen;

import main.Function;
import main.History;

public class PersonData {

    private boolean useDataPresent;

    private Function function = new Function();
    private History history = new History();

    public void setup(Person person, int personLevel, int changedLevel) {
        ZeitArbeiter zeitArbeiterUntil = null;
        Arbeiter arbeiterUntil = null;
        Manager managerUntil = null;
        Geschaeftsfuehrer geschaeftsfuehrerUntil = null;

        switch (personLevel) {
            case 0 -> {
                assert false;
                zeitArbeiterUntil.setLohnZeitArbeiter((ZeitArbeiter) person);
            }
            case 1 -> {
                assert false;
                arbeiterUntil.setLohnArbeiter((Arbeiter) person);
            }
            case 2 -> {
                assert false;
                managerUntil.setLohnManager((Manager) person);
            }
            case 3 -> {
                assert false;
                geschaeftsfuehrerUntil.setLohnGeschäftsführer((Geschaeftsfuehrer) person);
            }
        }
        function.setID(person);
        history.personChanged(person, changedLevel);
    }

    public boolean dataPresent() {
        //Data TODO
        if (useDataPresent) {


            Geschaeftsfuehrer geschaeftsfuehrer = new Geschaeftsfuehrer("Günter","");
            geschaeftsfuehrer.setLohnGeschäftsführer(geschaeftsfuehrer);
            function.setID(geschaeftsfuehrer);
            history.personChanged(geschaeftsfuehrer, 1);

            Manager manager1 = new Manager();
            Manager manager2 = new Manager();

            Arbeiter arbeiter1 = new Arbeiter();
            Arbeiter arbeiter2 = new Arbeiter();
            Arbeiter arbeiter3 = new Arbeiter();
            Arbeiter arbeiter1 = new Arbeiter();
            Arbeiter arbeiter2 = new Arbeiter();
            Arbeiter arbeiter3 = new Arbeiter();

            ZeitArbeiter zeitArbeiter1 = new ZeitArbeiter();

        }
        return useDataPresent;
    }


    public boolean isUseDataPresent() {
        return useDataPresent;
    }

    public void setUseDataPresent(boolean useDataPresent) {
        this.useDataPresent = useDataPresent;
    }
}
