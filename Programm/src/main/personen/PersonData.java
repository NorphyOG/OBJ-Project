package main.personen;

import main.Function;
import main.History;

public class PersonData {

    private boolean useDataPresent;


    public boolean dataPresent() {
        //Data TODO
        if (useDataPresent) {
            Function function = new Function();
            History history = new History();


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
