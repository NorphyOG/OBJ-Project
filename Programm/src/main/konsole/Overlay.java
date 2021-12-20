package main.konsole;

public class Overlay {

    private String panelName1 = " Big Pannel";
    private String panelName2 = " Small Pannel";

    private String option1 = " Option 1";
    private String option2 = " Option 2";
    private String option3 = " Option 3";

    private String show1 = " Show 1";
    private String show2 = " Show 2";
    private String show3 = " Show 3";

    public void o1() {


        String lineOben = "|%-65s|%n";
        String lineMain = "║%-65s║%n";
        System.out.format(                    "%n┌─────────────────────────────────────────────────────────────────┐%n");

        System.out.format(lineOben,               panelName1);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╣%n");

        System.out.format(lineMain,               option1);
        System.out.format(lineMain,               option2);
        System.out.format(lineMain,               option3);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╝%n");
        System.out.print(                       "╚-> ");

    }

    public void o2() {


        String lineOben = "|%-65s|%-28s|%n";
        String lineMain = "║%-65s║%-28s║%n";
        System.out.format(                    "%n┌─────────────────────────────────────────────────────────────────┬────────────────────────────┐%n");

        System.out.format(lineOben,               panelName1,                                                       panelName2);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╬════════════════════════════╣%n");

        System.out.format(lineMain,               option1,                                                          show1);
        System.out.format(lineMain,               option2,                                                          show2);
        System.out.format(lineMain,               option3,                                                          show3);

        System.out.format(                      "╠═════════════════════════════════════════════════════════════════╩════════════════════════════╝%n");
        System.out.print(                       "╚-> ");

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

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }
}
