package Michelle_4;

class Fluss {
    public int laenge;
    public String name;
    public String kontinent;
    public String quellgebiet;
    public String muendung;

    /* *** Aufgabe 3a *** */
    /* Konstruktor mit Parametern fuer alle Attribute */
    // 1

    /**
     * @param laenge
     * @param name
     * @param kontinent
     * @param quellgebiet
     * @param muendung
     */

    public Fluss(int laenge, String name, String kontinent, String quellgebiet, String muendung) {
        this.laenge = laenge;
        this.name = name;

        this.kontinent = kontinent;
        this.quellgebiet = quellgebiet;
        this.muendung = muendung;
    }

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
    public String toString(int anzahl) {
        if (anzahl < 0) {
            return name + " (Länge: " + laenge + ")";
        } else {
            String leerzeichen = new String(new char[anzahl]).replace('\0', ' ');
            return leerzeichen + name + " (Länge: " + laenge + ")";
        }
    }
}

public class Fluesse {
    static Fluss[] fluesse = new Fluss[Data.flussDaten.length];

    public static void main(String[] args) {
        /* *** Aufgabe 3c *** */
        // 2
        Fluss[] fluesse = new Fluss[Data.flussDaten.length];

        for (int i = 0; i < Data.flussDaten.length; i++) {
            int laenge = Integer.parseInt(Data.flussDaten[i][0]);
            String name = Data.flussDaten[i][1];
            String kontinent = Data.flussDaten[i][2];

            String quellgebiet = Data.flussDaten[i][3];
            String muendung = Data.flussDaten[i][4];
            Fluss fluss = new Fluss(laenge, name, kontinent, quellgebiet, muendung);
            fluesse[i] = fluss;
        }

        /* *** Aufgabe 3d *** */
        // 3
        String[] kontinente = {"Afrika", "Asien", "Australien", "Europa", "Nordamerika", "Südamerika"};

        for (String kontinent : kontinente) {
            System.out.println(kontinent + ":");

            int anzahlFlussKontinent = 0;
            for (Fluss fluss : fluesse) {
                if (anzahlFlussKontinent >= 3) {
                    break;
                }
                if (fluss.aufKontinent(kontinent)) {
                    System.out.println("    " + fluss.toString(4));
                    anzahlFlussKontinent++;
                }
            }
            System.out.println();
        }
    }
}
