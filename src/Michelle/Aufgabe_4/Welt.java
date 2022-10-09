package Michelle.Aufgabe_4;

import static Michelle.Aufgabe_4.LaenderDaten.daten;
import static Michelle.Aufgabe_4.LaenderDaten.getIntValue;

class Groesse {
    public double wert;
    public String einheit;

    /* Aufgabenteil (a) */
    // 1
    public Groesse(double wert, String einheit) {

        this.wert = wert;
        this.einheit = einheit;
    }

}

class Land {
    public String name;
    public int einwohner;
    public Groesse flaeche;

    /* Aufgabenteil (b) */
    // 1.5

    public Land(String[] feld) {

        this.name = feld[0];
        this.einwohner = getIntValue(feld[1]);
        Groesse flaeche = new Groesse(0, " ");
        flaeche.wert = getIntValue(feld[2]);
        flaeche.einheit = "km^2";
        this.flaeche = flaeche;
    }

    /* Aufgabenteil (c) */
    // 1
    public void printLand() {
        System.out.println(name + ": ");
        System.out.println(einwohner + " EW ");
        System.out.println(flaeche.wert+ flaeche.einheit);
    }
}

public class Welt {
    //public static Land[] laender;
    public static Land[] laender = new Land[daten.length];


    /* Aufgabenteil (d) */
    // 1.5
    public static void initLaender() {


        int i = 0;
        for (String[] landDaten : daten) {
            Land land = new Land(landDaten);
            laender[i] = land;
            i++;
        }
    }

    /* Aufgabenteil (e) */
    // 1

    public static long summeEinwohner() {

        long einwohnerzahl = 0;
        for (Land land : laender) {
            einwohnerzahl = einwohnerzahl + Long.valueOf(land.einwohner);
        }
        return einwohnerzahl;
    }

    /* Aufgabenteil (f) */
    // 2

    public static Land kleinstesLand() {

        Land minland=null;

        double kleinsteFlaeche = 0;
        for (Land land : laender) {
            if ((kleinsteFlaeche > land.flaeche.wert) || (kleinsteFlaeche==0)) {
                kleinsteFlaeche = land.flaeche.wert;
                minland = land;
            }
        }
        return minland;
    }


    public static void main(String[] args) {
        /* zum Testen die Zeilenkommentare entfernen */
        initLaender();
        System.out.println("Weltbevölkerung (2020): " + summeEinwohner());
        System.out.println("Kleinstes Land der Welt: ");
        Land minLand = kleinstesLand();


        minLand.printLand();


    }
}