package Semester_3.Aufgabe_2;

import static java.lang.String.valueOf;

import Michelle_1.Aufgabe_2.IOTools;

public class Aufgabe_2_2 {

  public static void main(String[] args) {

    Long zahl = 0L;
    String feld = "";
    int geradeZiffern = 0;
    int ungeradeZiffern = 0;

    do {
      zahl = IOTools.readLong("Bitte Zahl eingeben: ");

      if (zahl < 10) {
        feld = feld + valueOf(zahl);
      }
    } while (zahl < 10);

    zahl = Long.parseLong(feld);

    System.out.println("Zahl = " + zahl);

    while (zahl > 0) {

      long letzteZiffer = zahl % 10; // Letzte Ziffer der Zahl extrahieren
      if (letzteZiffer % 2 == 0) {
        geradeZiffern++;
      } else {
        ungeradeZiffern++;
      }
      zahl /= 10;
    }

    System.out.println("Anzahl gerader Ziffern: " + geradeZiffern);
    System.out.println("Anzahl ungerader Ziffern: " + ungeradeZiffern);
  }
}
