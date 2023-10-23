package Semester_1.Aufgabe_1;

import static java.lang.String.valueOf;

public class Aufgabe_1_4 {
  public static void main(String[] args) {
    int zahl = readInt4(); // vierstellige ganze Zahl einlesen

    String feld = valueOf(zahl);

    int z1 = Integer.parseInt(feld.substring(0, 1));
    int z2 = Integer.parseInt(feld.substring(1, 2));
    int z3 = Integer.parseInt(feld.substring(2, 3));
    int z4 = Integer.parseInt(feld.substring(3, 4));

    boolean m = ((z1 <= z2) && (z2 <= z3) && (z3 <= z4)) ? true : false;

    if (m) {
      System.out.println("Die Ziffern der Zahl " + zahl + " sind monoton steigend.");
    } else {
      System.out.println("Die Ziffern der Zahl " + zahl + " sind nicht monoton steigend.");
    }
  }

  /* Methode liest eine vierstellige Zahl ein */
  public static int readInt4() {
    int x = 0;
    do {
      x = IOTools.readInteger("4-stellige ganze Zahl: ");
    } while ((x < 1000) || (x > 9999));

    return x;
  }
}
