package Michelle_5;

public class TestListen {
  public static void main(String[] args) {
    Fluss[] flussFeld = FlussDaten.createFlussFeld();
    FlussListe fListe = new FlussListe();

    for (Fluss f : flussFeld) {
      fListe.insert(f);
    }

    /* *** Aufgabe 3e *** */
    // 1P
    // Liste mit Muendungen initialisieren und ausgeben
    StringListe mListe = fListe.getMuendungen();
    mListe.printListe();
    String muendung;

    do {
      // Muendungen einlesen und jeweils alle Fluesse dazu ausgeben
      muendung = IOTools.readLine("Mündung: ");

      FlussListe filteredList = fListe.filterNachMuendung(muendung);
      filteredList.printListe();

    } while (mListe.contains(muendung));
  }
}
