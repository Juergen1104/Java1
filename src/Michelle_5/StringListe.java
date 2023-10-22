package Michelle_5;

class StringListenelement {
    String data;
    StringListenelement next;
}

public class StringListe {
    StringListenelement head;
    StringListenelement z;

    // leere Liste erzeugen
    public StringListe() {
        head = new StringListenelement();
        z = new StringListenelement();
        head.data = null;
        head.next = z;
        z.data = null;
        z.next = z;
    }

    // Ausgabe aller Elemente der Liste
    public void printListe() {
        int count = 1;
        StringListenelement ele = head.next;
        while (ele != z) {
            System.out.println(count++ + ". " + ele.data);
            ele = ele.next;
        }
        System.out.println();
    }

    /* *** Aufgabe 3b *** */
    // Die Methode gibt den Wert true zurueck, wenn
    // die Liste den String s enthaelt und ansonsten
    // den Wert false
    // Hinweis: Vergleichen Sie zwei String-Werte s1 und s2 auf
    //          Gleichheit mit der Instanzmethode equals:
    //          s1.equals(s2)
    // 2P

    public boolean contains(String s) {
        StringListenelement current = head.next;
        while (current.data != null) {
            if (current.data.equals(s)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }




    /* *** Aufgabe 3c *** */
    // neues Element mit dem als Parameter übergebenen Daten-Objekt
    // am Ende der Liste einfügen, sofern das Element noch nicht
    // in der Liste gespeichert ist
    // 2P

    public void insertNoDuplicates(String str) {
        if (!contains(str)) {
            StringListenelement newElement = new StringListenelement();
            newElement.data = str;
            newElement.next = head.next;
            head.next = newElement;
        }
    }


}
