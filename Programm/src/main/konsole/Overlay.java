package main.konsole;

import main.Function;
import main.History;
import main.personen.Person;

public class Overlay {

    private String panelName1 = " Big Pannel";
    private String panelName2 = " Small Pannel";

    private String option1 = " Option 1";
    private String option2 = " Option 2";
    private String option3 = " Option 3";
    private String option4 = " Option 4";
    private String option5 = " Option 5";

    private String show1 = " Show 1";
    private String show2 = " Show 2";
    private String show3 = " Show 3";

    private String err = "Error 404";
    private String lineError = "╚-> ";

    public void o1(boolean error) {

        String lineOben = "|%-65s|%n";
        String lineMain = "║%-65s║%n";
        System.out.format(                    "%n┌─────────────────────────────────────────────────────────────────┐%n");

        System.out.format(lineOben,               panelName1);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╣%n");

        System.out.format(lineMain,               option1);
        System.out.format(lineMain,               option2);
        System.out.format(lineMain,               option3);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╝%n");
        if (error) {
            lineError = "╠- " + err + "\n╚-> ";
        } else {
            lineError = "╚-> ";
        }
        System.out.print(                       lineError);

    }

    public void o1s(boolean error) {

        String lineOben = "|%-65s|%n";
        String lineMain = "║%-65s║%n";
        System.out.format(                    "%n┌─────────────────────────────────────────────────────────────────┐%n");

        System.out.format(lineOben,               panelName1);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╣%n");

        System.out.format(lineMain,               option1);
        System.out.format(lineMain,               option2);
        System.out.format(lineMain,               option3);
        System.out.format(lineMain,               option4);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╝%n");
        if (error) {
            lineError = "╠- " + err + "\n╚-> ";
        } else {
            lineError = "╚-> ";
        }
        System.out.print(                       lineError);

    }

    public void o1d(boolean error) {

        String lineOben = "|%-353s|%n";
        String lineMain = "║%-353s║%n";
        System.out.format(                    "%n┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐%n");

        System.out.format(lineOben,               panelName1);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣%n");

        Function function = new Function();
        for (Person[] p : function.getPersonArrayList()) {
            for (Person pv : p) {
                if (pv != null) {
                    System.out.println("o1d - Output");
                    option4 = pv.toString();
                    System.out.format(lineMain, option4);
                    System.out.println("║ " + pv);
                }
            }
        }

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣%n");

        System.out.format(lineMain,              option1);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝%n");
        if (error) {
            lineError = "╠- " + err + "\n╚-> ";
        } else {
            lineError = "╚-> ";
        }
        System.out.print(                       lineError);

    }

    public void o1h(boolean error) {

        String lineOben = "|%-353s|%n";
        String lineMain = "║%-353s║%n";
        System.out.format(                    "%n┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐%n");

        System.out.format(lineOben,               panelName1);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣%n");

        History history = new History();
        for (String p : history.getHistorySides()) {
            option4 = p;
            System.out.format(lineMain, option4);
        }

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣%n");

        System.out.format(lineMain,              option1);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝%n");
        if (error) {
            lineError = "╠- " + err + "\n╚-> ";
        } else {
            lineError = "╚-> ";
        }
        System.out.print(                       lineError);

    }

    public void o1rp(boolean error) {

        String lineOben = "|%-353s|%n";
        String lineMain = "║%-353s║%n";
        System.out.format(                    "%n┌─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┐%n");

        System.out.format(lineOben,               panelName1);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣%n");

        History history = new History();
        for (Person p : history.getPersonRemovedHistory()) {
            option4 = String.valueOf(p);
            System.out.format(lineMain, option4);
        }

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣%n");

        System.out.format(lineMain,              option1);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝%n");
        if (error) {
            lineError = "╠- " + err + "\n╚-> ";
        } else {
            lineError = "╚-> ";
        }
        System.out.print(                       lineError);

    }

    public void o2(boolean error) {


        String lineOben = "|%-65s|%-28s|%n";
        String lineMain = "║%-65s║%-28s║%n";
        System.out.format(                    "%n┌─────────────────────────────────────────────────────────────────┬────────────────────────────┐%n");

        System.out.format(lineOben,               panelName1,                                                       panelName2);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╬════════════════════════════╣%n");

        System.out.format(lineMain,               option1,                                                          show1);
        System.out.format(lineMain,               option2,                                                          show2);
        System.out.format(lineMain,               option3,                                                          show3);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╩════════════════════════════╝%n");
        if (error) {
            lineError = "╠- " + err + "\n╚-> ";
        } else {
            lineError = "╚-> ";
        }
        System.out.print(                       lineError);

    }

    public void o1big(boolean error) {

        String lineOben = "|%-65s|%n";
        String lineMain = "║%-65s║%n";
        System.out.format(                    "%n┌─────────────────────────────────────────────────────────────────┐%n");

        System.out.format(lineOben,               panelName1);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╣%n");

        System.out.format(lineMain,               option1);
        System.out.format(lineMain,               option2);
        System.out.format(lineMain,               option3);
        System.out.format(lineMain,               option4);
        System.out.format(lineMain,               option5);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╝%n");
        if (error) {
            lineError = "╠- " + err + "\n╚-> ";
        } else {
            lineError = "╚-> ";
        }
        System.out.print(                       lineError);

    }

    public void o1ss(boolean error) {

        String lineOben = "|%-65s|%n";
        String lineMain = "║%-65s║%n";
        System.out.format(                    "%n┌─────────────────────────────────────────────────────────────────┐%n");

        System.out.format(lineOben,               panelName1);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╣%n");

        System.out.format(lineMain,               option1);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╝%n");
        if (error) {
            lineError = "╠- " + err + "\n╚-> ";
        } else {
            lineError = "╚-> ";
        }
        System.out.print(                       lineError);

    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public String getLineError() {
        return lineError;
    }

    public void setLineError(String lineError) {
        this.lineError = lineError;
    }

    public String getShow1() {
        return show1;
    }

    public void setShow1(String show1) {
        this.show1 = show1;
    }

    public String getShow2() {
        return show2;
    }

    public void setShow2(String show2) {
        this.show2 = show2;
    }

    public String getShow3() {
        return show3;
    }

    public void setShow3(String show3) {
        this.show3 = show3;
    }

    public String getPanelName1() {
        return panelName1;
    }

    public void setPanelName1(String panelName1) {
        this.panelName1 = panelName1;
    }

    public String getPanelName2() {
        return panelName2;
    }

    public void setPanelName2(String panelName2) {
        this.panelName2 = panelName2;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption5() {
        return option5;
    }

    public void setOption5(String option5) {
        this.option5 = option5;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }
}
