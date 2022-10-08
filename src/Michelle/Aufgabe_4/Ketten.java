package Michelle.Aufgabe_4;

public class Ketten {

    public static String[] perlen = {"xxx", "ooo", "[0]"};
    private static String ende = "#";
    private static String conn = "-";


    /* *** Aufgabenteil (a)  *** */
    // 4


    public static String abschluss(String kette) {

        String neueKette = ende + conn + kette + conn + ende;
        return neueKette;
    }

    public static String verbinden(String s1, String s2) {

        String verbundeneKette = s1 + conn + s2;
        return verbundeneKette;
    }

    public static String verbinden(String s1, String s2, String s3) {

        String verbundeneKette = s1 + conn + s2 + conn + s3;
        return verbundeneKette;
    }

    public static String verbinden(String s1, int wiederholung) {

        String verbundeneKette="";

        for (int i = 0; i < wiederholung; i++) {
            if (i < wiederholung-1) {
                verbundeneKette = verbundeneKette + s1 + conn;
            } else {
                verbundeneKette = verbundeneKette + s1;
            }
        }
        return verbundeneKette;
    }


}