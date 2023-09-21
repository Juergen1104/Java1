package Michelle_1.Aufgabe_5;


import java.io.FileNotFoundException;
import java.io.PrintStream;

class Groesse {
    public double wert;
    public String einheit;

    public Groesse(double w, String e) {
        wert = w;
        einheit = e;
    }
}

class Land {
    public String name;
    public int einwohner;
    public Groesse flaeche;

    public Land(String[] daten) {
        name = daten[0];
        einwohner = LaenderDaten.getIntValue(daten[1]);
        flaeche = new Groesse(LaenderDaten.getIntValue(daten[2]), "km^2");
    }

    public void print() {
        System.out.println(name + ": ");
        System.out.println("   " + einwohner + " EW");
        System.out.println("   " + flaeche.wert + flaeche.einheit);
        System.out.printf("Flaeche : %,.2f", flaeche.wert);
        System.out.println(" ");
    }
}

class Utils {
    public static Land[] getLaender() {
        Land[] laender = new Land[LaenderDaten.daten.length];
        for (int i = 0; i < laender.length; i++) {
            laender[i] = new Land(LaenderDaten.daten[i]);
        }
        return laender;
    }
}

class Listenelement {
    Land data;
    Listenelement next;
}


public class Liste {
    Listenelement head;
    Listenelement z;

    // leere Liste erzeugen
    public Liste() {
        head = new Listenelement();
        z = new Listenelement();
        head.data = null;
        head.next = z;
        z.data = null;
        z.next = z;
    }

    // Ausgabe aller Elemente der Liste
    public void printListe() {
        int count = 1;
        Listenelement ele = head.next;
        while (ele != z) {
            System.out.print(count++ + ". ");
            ele.data.print();
            ele = ele.next;
        }
    }

    // neues Element mit dem als Parameter übergebenen Daten-Objekt
    // am Kopf der Liste einfügen
    public void insert(Land land) {
        Listenelement newEle = new Listenelement();
        newEle.data = land; // nur Referenzkopie
        newEle.next = head.next;
        head.next = newEle;
    }

    // Länge der Liste bestimmen: iterativ
    private int length() {
        int zaehler = 0;
        Listenelement help = head.next;

        while (help != z) {
            ++zaehler;
            help = help.next;
        }
        return zaehler;
    }

    // Teilaufgabe (a)
    // 3
    public Liste filterListe(char c) {

        Liste filteredLaenderliste = new Liste(); // gefilterte Liste der Länder
        char cUppercase = Character.toUpperCase(c);
        Listenelement ele = head.next;
        while (ele != z) {
            if (cUppercase == ele.data.name.charAt(0)) {
                filteredLaenderliste.insert(ele.data);
            }
            ele = ele.next;
        }
        return filteredLaenderliste;
    }

    // Teilaufgabe (b)
    // 3
    public void sortListe() {

        int anzahlLaender = length();
        Listenelement ele = new Listenelement();

        for (int i = 0; i < anzahlLaender - 1; i++) {
            ele = head.next; // erstes Element der Liste
            while (ele != z && ele.next != z) {

                if (ele.data.einwohner > ele.next.data.einwohner) {
                    Listenelement currentEle = new Listenelement();
                    currentEle.data = ele.data;
                    ele.data = ele.next.data;
                    ele.next.data = currentEle.data;
                }
                ele = ele.next;
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Liste laenderliste = new Liste(); // neue Liste anlegen

        // Liste fuellen
        Land[] laenderFeld = Utils.getLaender();
        for (int i = 1; i < laenderFeld.length; i++) {
            laenderliste.insert(laenderFeld[i]);
        }

        laenderliste.sortListe();
        laenderliste.printListe();


        /* *** Aufgabenteil (c) *** */

        Liste[] laenderlisten = new Liste[26];

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int i = 0;

        for (char c : alphabet) {
            laenderlisten[i] = laenderliste.filterListe(c);
            i++;
        }
        PrintStream fileStream = new PrintStream("filename.txt");
        System.setOut(fileStream);

        i = 0;
        for (char c : alphabet) {
            System.out.println("Laender mit " + Character.toUpperCase(c) + ": " + laenderlisten[i].length());
            laenderlisten[i].printListe();
            i++;
        }
    }
}

