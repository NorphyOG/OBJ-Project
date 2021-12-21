package main.personen;

import main.Function;
import main.History;

import java.time.LocalDate;

public class PersonData {

    private boolean useDataPresent;

    private Function function = new Function();
    private History history = new History();

    public void setup(ZeitArbeiter zeitArbeiter, Arbeiter arbeiter, Manager manager, Geschaeftsfuehrer geschaeftsfuehrer, int changedLevel) {

        if (zeitArbeiter != null) {
            zeitArbeiter.setLohnZeitArbeiter(zeitArbeiter);
            function.setID(zeitArbeiter);
            history.personChanged(zeitArbeiter ,changedLevel);
        } else if (arbeiter != null) {
            arbeiter.setLohnArbeiter(arbeiter);
            function.setID(arbeiter);
            history.personChanged(arbeiter ,changedLevel);
        } else if (manager != null) {
            manager.setLohnManager(manager);
            function.setID(manager);
            history.personChanged(manager ,changedLevel);
        } else if (geschaeftsfuehrer != null) {
            geschaeftsfuehrer.setLohnGeschäftsführer(geschaeftsfuehrer);
            function.setID(geschaeftsfuehrer);
            history.personChanged(geschaeftsfuehrer ,changedLevel);
        }
        
    }

    public boolean dataPresent() {
        if (useDataPresent) {

            System.out.println("dataPresent");

            Geschaeftsfuehrer geschaeftsfuehrer = new Geschaeftsfuehrer("Günter","Gehindert", 'M', "Scheideweg 3", LocalDate.of(1988, 12,12), LocalDate.of(2010, 12, 22),8000,1.02,40);
            setup(null, null, null , geschaeftsfuehrer, 1);



            Arbeiter arbeiter1 = new Arbeiter("Adrian","Wahlhäuser", 'M',"Steime 7",LocalDate.of(2003,12,01),LocalDate.of(2011, 12,01),3000,40);
            setup(null,arbeiter1,null,null, 1);
            Arbeiter arbeiter2 = new Arbeiter("Jerome","Weber", 'M',"Marshall 7",LocalDate.of(2005,02,01),LocalDate.of(2011, 12,01),3000,40);
            setup(null,arbeiter2,null,null, 1);
            Arbeiter arbeiter3 = new Arbeiter("Serome","Seber", 'M',"Marshall 8",LocalDate.of(2002,02,01),LocalDate.of(2012, 12,01),3000,40);
            setup(null,arbeiter3,null,null, 1);
            Arbeiter arbeiter4 = new Arbeiter("Berome","Beber", 'M',"Marshall 10",LocalDate.of(2008,02,01),LocalDate.of(2020, 12,01),3000,40);
            setup(null,arbeiter4,null,null, 1);
            Arbeiter arbeiter5 = new Arbeiter("Merome","Meber", 'M',"Marshall 11",LocalDate.of(2007,02,01),LocalDate.of(2011, 12,01),3000,40);
            setup(null,arbeiter5,null,null, 1);
            Arbeiter arbeiter6 = new Arbeiter("Nerome","Neber", 'M',"Marshall 21",LocalDate.of(2006,12,11),LocalDate.of(2021, 12,01),3000,40);
            setup(null,arbeiter6,null,null, 1);
            Arbeiter arbeiter7 = new Arbeiter("Nerome","Neber", 'M',"Marshall 21",LocalDate.of(2006,12,11),LocalDate.of(2021, 12,01),3000,40);
            setup(null,arbeiter7,null,null, 1);
            Arbeiter arbeiter8 = new Arbeiter("Aerome","Aeber", 'M',"Sarshall 51",LocalDate.of(2007,12,11),LocalDate.of(2021, 12,01),3000,40);
            setup(null,arbeiter8,null,null, 1);
            Arbeiter arbeiter9 = new Arbeiter("Derome","Deber", 'M',"Sarshall 21",LocalDate.of(2008,12,11),LocalDate.of(2031, 12,01),3000,40);
            setup(null,arbeiter9,null,null, 1);
            Arbeiter arbeiter10 = new Arbeiter("Zerome","Zeber", 'M',"Barshall 221",LocalDate.of(2006,05,21),LocalDate.of(2018, 12,01),3000,40);
            setup(null,arbeiter10,null,null, 1);
            Arbeiter arbeiter11 = new Arbeiter("Sebille","Neber", 'W',"Barshall 221",LocalDate.of(2005,12,11),LocalDate.of(2021, 12,01),3000,40);
            setup(null,arbeiter11,null,null, 1);
            Arbeiter arbeiter12 = new Arbeiter("Anna","Neber", 'W',"Marshall 221",LocalDate.of(2009,12,11),LocalDate.of(2021, 12,01),3000,40);
            setup(null,arbeiter12,null,null, 1);
            Arbeiter arbeiter13 = new Arbeiter("Lisa","Neber", 'W',"Marshall 221",LocalDate.of(2001,12,11),LocalDate.of(2021, 12,01),3000,40);
            setup(null,arbeiter13,null,null, 1);
            Arbeiter arbeiter14 = new Arbeiter("Justus","Neber", 'M',"Barshall 2121",LocalDate.of(2000,02,11),LocalDate.of(2021, 12,01),3000,40);
            setup(null,arbeiter14,null,null, 1);
            Arbeiter arbeiter15 = new Arbeiter("Sams","Deber", 'M',"Marshall 2311",LocalDate.of(2009,12,11),LocalDate.of(2021, 12,01),3000,40);
            setup(null,arbeiter15,null,null, 1);
            Arbeiter arbeiter16 = new Arbeiter("Sonja","Breber", 'W',"Marshall 2221",LocalDate.of(2008,10,11),LocalDate.of(2021, 12,01),3000,40);
            setup(null,arbeiter16,null,null, 1);
            Arbeiter arbeiter17 = new Arbeiter("Berome","Breber", 'X',"Marshall 2331",LocalDate.of(2010,12,01),LocalDate.of(2021, 12,01),3000,40);
            setup(null,arbeiter17,null,null, 1);

            ZeitArbeiter zeitArbeiter1 = new ZeitArbeiter("Marie","Becher",'W',"Drachsllerweg 5", LocalDate.of(2000,12,02),LocalDate.of(2020, 12,12), 1500, 38,120);
            setup(zeitArbeiter1, null,null,null,1);

            Person[] pArray1 = {arbeiter1, arbeiter2, arbeiter3, arbeiter4, arbeiter5};
            Person[] pArray2 = {arbeiter6, arbeiter7, arbeiter8,arbeiter9, zeitArbeiter1};

            Manager manager1 = new Manager("Burak","Amidala",'W',"Brandauerstraße 5",LocalDate.of(1977, 02,20), LocalDate.of(2010, 12, 23), 5000, 40, pArray1, 1.04);
            setup(null,null,manager1,null,1);
            Manager manager2 = new Manager("Zurak","Pamidala",'W',"Brandauerstraße 8",LocalDate.of(1979, 06,23), LocalDate.of(2010, 12, 25), 5000, 40, pArray2, 1.04);
            setup(null,null,manager2,null,1);



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
