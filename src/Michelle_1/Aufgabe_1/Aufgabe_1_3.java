package Michelle_1.Aufgabe_1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Aufgabe_1_3 {

    public static void main(String[] args) {

        int a = readInt4("Kantenlaenge eingeben: ");  // vierstellige ganze Zahl einlesen
        int h = readInt4("Hoehe eingeben: ");  // vierstellige ganze Zahl einlesen

        // Grundfläche
        double g = berechneGrund(a, h);
        double grundflaeche = Math.round(g);

        // Mantelflaeche

        // Oberflaeche:

        // Volumen:4


        System.out.println("Bei einer Kantenlaenge von " + a + " und einer Hoehe von " + h + " betraegt die Grundflaeche " + grundflaeche + ".");


//        System.out.println("Mantelfläche: " + m);
//        System.out.println("Oberfläche: " + o);
//        System.out.println("Volumen: " + v);

    }


    public static double berechneGrund(int a, int h) {
        double g = (pow(a, 2) / 4) * sqrt(3);
        return g;
    }

    public static double berechneMantel(int a, int h) {
        double m = 3 * a * h;
        return m;
    }

    public static double berechneOber(int a, int h) {
        double o = 2 * (pow(a, 2) / 4) * sqrt(3) * h;
        return o;                                           /*Wie speicher ich das ergebnis der Grundfläche global in einer Variable ab*/
    }

    public static double berechneVolumen(int a, int h) {
        double v = ((pow(a, 2) / 4) * sqrt(3)) * h;
        return v;
    }

    /* Methode liest eine vierstellige Zahl ein */
    public static int readInt4(String text) {
        int x = 0;
        do {
            x = IOTools.readInteger(text);
        } while ((x < 0) || (x > 9999));
        return x;
    }
}


