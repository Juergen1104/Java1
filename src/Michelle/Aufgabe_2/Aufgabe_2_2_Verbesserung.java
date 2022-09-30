package Michelle.Aufgabe_2;


// Name: Michelle Felicitas Pohl

import static java.lang.String.valueOf;

public class Aufgabe_2_2_Verbesserung {

    public static void main(String[] args) {

        String eingabe = readValue();

        if (eingabe != "") {
            boolean monoton = checkMonoton(eingabe);
            if (monoton) {
                System.out.println("Deine Zahl ist monoton steigend");
            } else {
                System.out.println("Deine Zahl ist nicht monoton steigend");
            }
        } else System.out.println("ungültige Eingabe");
    }

    private static boolean checkMonoton(String eingabe) {

        int i = 0;
        while (i < eingabe.length() - 1) {

            int z1 = Integer.parseInt(eingabe.substring(i, i + 1));
            int z2 = Integer.parseInt(eingabe.substring(i + 1, i + 2));
            i++;

            if (z1 > z2) {
                return false;
            }
        }
        return true;
    }

    public static String readValue() {

        long a = 0;
        String feld = "";

        do {
            a = IOTools.readLong("Bitte Zahl eingeben: ");
            if (a < 10) {
                feld = feld + valueOf(a);
            }
        }
        while (a < 10);

        return feld;


    }


}
