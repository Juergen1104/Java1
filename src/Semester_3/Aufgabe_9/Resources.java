package Semester_3.Aufgabe_9;

import java.util.ArrayList;

public class Resources {
  /* Namen der verfuegbaren Bilddateien (im Unterverzeichnis bilder)
   */
  public static String[] dateinamen = {
    "src/Semester_3/Aufgabe_9/bilder/bowl1.png",
    "src/Semester_3/Aufgabe_9/bilder/calendar.png",
    "src/Semester_3/Aufgabe_9/bilder/muffin.png",
    "src/Semester_3/Aufgabe_9/bilder/snowflake.png",
    "src/Semester_3/Aufgabe_9/bilder/sweet3.png",
    "src/Semester_3/Aufgabe_9/bilder/bowl2.png",
    "src/Semester_3/Aufgabe_9/bilder/globe2.png",
    "src/Semester_3/Aufgabe_9/bilder/rentier.png",
    "src/Semester_3/Aufgabe_9/bilder/sweet1.png",
    "src/Semester_3/Aufgabe_9/bilder/tree.png",
    "src/Semester_3/Aufgabe_9/bilder/bowl3.png",
    "src/Semester_3/Aufgabe_9/bilder/globe.png",
    "src/Semester_3/Aufgabe_9/bilder/shoe.png",
    "src/Semester_3/Aufgabe_9/bilder/sweet2.png",
    "src/Semester_3/Aufgabe_9/bilder/window.png"
    // todo switch back to original path
    //    "bilder/bowl1.png",
    //    "bilder/calendar.png",
    //    "bilder/muffin.png",
    //    "bilder/snowflake.png",
    //    "bilder/sweet3.png",
    //    "bilder/bowl2.png",
    //    "bilder/globe2.png",
    //    "bilder/rentier.png",
    //    "bilder/sweet1.png",
    //    "bilder/tree.png",
    //    "bilder/bowl3.png",
    //    "bilder/globe.png",
    //    "bilder/shoe.png",
    //    "bilder/sweet2.png",
    //    "bilder/window.png",
  };

  public static ArrayList<Karte> alleKarten = new ArrayList<Karte>(dateinamen.length);

  /* generiert zu Beginn alle moeglichen Karten (ohne Positionen)
   */
  static {
    for (int i = 0; i < dateinamen.length; i++) {
      alleKarten.add(new Karte(dateinamen[i]));
    }
  }

  /* Die Methode initialisiert das Feld mit Karten:
   * jede Karte wird mit zwei Zufalls-Positionen angelegt und von zwei
   * Elementen des Felds referenziert.
   * Vorteil dabei: Der Vergleich, ob zwei gleiche Karten aufgedeckt
   * wurden, kann über einen Referenzvergleich stattfinden.
   */
  public static void initFeld(Karte[][] karten) {
    int nr = karten.length;
    int nc = karten[0].length;

    // alle moeglichen Positionen generieren
    ArrayList<Karte.Position> allePositionen = new ArrayList<Karte.Position>(nr * nc);
    int k = 0;
    for (int i = 0; i < nr; i++) {
      for (int j = 0; j < nc; j++) {
        allePositionen.add(new Karte.Position(i, j));
      }
    }
    while ((allePositionen.size() >= 2) && (alleKarten.size() > 0)) {
      // Zufallsposition 1 auswaehlen
      int p1 = (int) (Math.random() * allePositionen.size());
      Karte.Position pos1 = allePositionen.remove(p1);
      // Zufallsposition 2 auswaehlen
      int p2 = (int) (Math.random() * allePositionen.size());
      Karte.Position pos2 = allePositionen.remove(p2);
      // Zufallskarte auswaehlen
      Karte karte = alleKarten.remove((int) (Math.random() * alleKarten.size()));
      // Positionen auf Karte eintragen
      karte.setPositionen(pos1, pos2);
      // Karte im feld referenzieren
      karten[pos1.getZeile()][pos1.getSpalte()] = karte;
      karten[pos2.getZeile()][pos2.getSpalte()] = karte;
    }
  }
}
