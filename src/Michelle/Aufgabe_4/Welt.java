package Michelle.Aufgabe_4;

import static Michelle.Aufgabe_4.LaenderDaten.getIntValue;

class Groesse {
    public double wert;
    public String einheit;

    /* Aufgabenteil (a) */
    // 1

    public Groesse(double wert, String einheit) {

        this.wert=wert;
        this.einheit=einheit;
    }

}

class Land {
    public String name;
    public int einwohner;
    public Groesse flaeche;

    /* Aufgabenteil (b) */
    // 1.5

    public Land(String [] feld) {

        this.name=feld[0];
        this.einwohner= getIntValue(feld[1]);
        //todo
    }


    /* Aufgabenteil (c) */
    // 1

    public void printLand() {
        System.out.println(name + ": ");
        System.out.println(einwohner + "EW: ");
        System.out.println(flaeche);
    }

}

public class Welt {
    public static Land[] laender;

    /* Aufgabenteil (d) */
    // 1.5



    /* Aufgabenteil (e) */
    // 1


    /* Aufgabenteil (f) */
    // 2


    public static void main(String[] args){
        /* zum Testen die Zeilenkommentare entfernen */
        // initLaender();
        // System.out.println("Weltbevölkerung (2020): " + summeEinwohner());
        // System.out.println("Kleinstes Land der Welt: ");
        // Land minLand = kleinstesLand();
        //minLand.printLand();



    }
}
