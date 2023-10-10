package Michelle_4;

public class Fluss {

    public int laenge;
    public String name;
    public String kontinent;
    public String quellgebiet;
    public String muendung;

    /* *** Aufgabe 3a *** */
    /* Konstruktor mit Parametern fuer alle Attribute */
    // 1


    /* Methode gibt true zurueck, wenn der Fluss auf dem Kontinent
       ist, der durch den String k spezifiziert wird, ansonsten
       false
    */
    public boolean aufKontinent(String k) {
        return kontinent.equals(k);
    }

    /* *** Aufgabe 3b *** */
    /* Methode gibt zunaechst k Leerzeichen aus und dann
       Namen und Laenge (in Klammern) des Flusses
    */
    // 1

}


public class Fluesse {
    static Fluss[] fluesse = new Fluss[Data.flussDaten.length];

    public static void main(String[] args) {
        /* *** Aufgabe 3c *** */
        // 2


        /* *** Aufgabe 3d *** */
        // 3


    }
}
