package Michelle.Aufgabe_5;


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

        printListe();

//        int anzahlLaender = length();
//        Listenelement ele = head.next;
//
//
//        Listenelement ele0 = new Listenelement();
//        Listenelement ele1 = new Listenelement();
//        Listenelement ele3 = new Listenelement();
//
//
//        for (int i = 0; i < anzahlLaender - 1; i++) {
//
//            ele0=ele;
//            ele1=ele.next;
//            ele3=ele.next;
//
//            if (ele.data.einwohner > ele.next.data.einwohner) {
//                ele=ele1;
//                ele.next=ele0;
//            }
//            ele=ele3.next;
//        }

    }

    public static void main(String[] args) {
        Liste laenderliste = new Liste(); // neue Liste anlegen

        // Liste fuellen
        Land[] laenderFeld = Utils.getLaender();
        for (int i = 1; i < laenderFeld.length; i++) {
            laenderliste.insert(laenderFeld[i]);
        }
        laenderliste.filterListe('a');

        laenderliste.sortListe();
        laenderliste.printListe();


        /* *** Aufgabenteil (c) *** */


    }
}


//class Groesse {
//    public double wert;
//    public String einheit;
//
//
//    public Groesse(double w, String e){
//        wert = w;
//        einheit = e;
//    }
//}
//
//class Land {
//    public String name;
//    public int einwohner;
//    public Groesse flaeche;
//
//    public Land (String[] daten){
//        name = daten[0];
//        einwohner = LaenderDaten.getIntValue(daten[1]);
//        flaeche = new Groesse(LaenderDaten.getIntValue(daten[2]),"km^2");
//    }
//
//    public void print(){
//        System.out.println(name + ": ");
//        System.out.println("   " + einwohner + " EW");
//        System.out.println("   " + flaeche.wert + flaeche.einheit);
//    }
//
//}
//
//class Utils {
//    public static Land[] getLaender(){
//        Land[] laender = new Land[LaenderDaten.daten.length];
//        for (int i=0;i<laender.length;i++){
//            laender[i] = new Land(LaenderDaten.daten[i]);
//        }
//        return laender;
//    }
//}
//
//class Listenelement {
//    Land data;
//    Listenelement next;
//}
//
//
//public class Liste {
//    Listenelement head;
//    Listenelement z;
//
//    // leere Liste erzeugen
//    public Liste(){
//        head = new Listenelement();
//        z = new Listenelement();
//        head.data = null;
//        head.next = z;
//        z.data = null;
//        z.next = z;
//    }
//
//    // Ausgabe aller Elemente der Liste
//    public void printListe(){
//        int count = 1;
//        Listenelement ele = head.next;
//        while (ele != z){
//            System.out.print(count++ + ". ");
//            ele.data.print();
//            ele = ele.next;
//        }
//    }
//    // neues Element mit dem als Parameter übergebenen Daten-Objekt
//    // am Kopf der Liste einfügen
//    public void insert(Land land){
//        Listenelement newEle = new Listenelement();
//        newEle.data = land; // nur Referenzkopie
//        newEle.next = head.next;
//        head.next = newEle;
//    }
//
//
//    // Länge der Liste bestimmen: iterativ
//    private int length(){
//        int zaehler = 0;
//        Listenelement help = head.next;
//
//        while (help != z){
//            ++zaehler;
//            help = help.next;
//        }
//
//        return zaehler;
//    }
//
//    // Teilaufgabe (a)
//    // 3
//    public static Liste filterListe(char c){
//
//        char cUpperCAse = Character.toUpperCase(c);
//
//        Liste gefilterteliste = new Liste(); // neue Liste anlegen
//
//
//
//
//        return null;  // Dummy Return
//    }
//
//    // Teilaufgabe (b)
//    // 3
//    public void sortListe(){
//
//    }
//
//    public static void main(String[] args) {
//        Liste laenderliste = new Liste(); // neue Liste anlegen
//
//        // Liste fuellen
//        Land[] laenderFeld = Utils.getLaender();
//        for (int i=1;i<laenderFeld.length;i++){
//            laenderliste.insert(laenderFeld[i]);
//        }
//
//        laenderliste.
//
//        filterListe('a');
//
//        // laenderliste.sortListe();
//        // laenderliste.printListe();
//
//
//        /* *** Aufgabenteil (c) *** */
//        // 2
//
//
//    }
//}
