package Semester_3.Aufgabe_2;

public class Aufgabe_2_1 {
  public static void main(String[] args) {

    /* *** Aufgabenteil (a)  *** */
    // 1
    /*
       ist die Eingabe n < 0 wird n positiv gesetzt
       in der while schleife wird 1 subraiert
       dann nochmals -1
       bis n <= 0 ist
       erg1 ist true wenn es eine gerade zahl war und das Ergebnis = 0 ist

    */
    int n = IOTools.readInteger("n = ");

    boolean erg1;

    n = (n < 0) ? -n : n;

    while (n > 0) {
      n--;
      n--;
    }

    erg1 = (n == 0);

    System.out.println("(a) Ergebnis:   = " + erg1 + "\n");

    System.out.println("\n***********************\n");

    /* *** Aufgabenteil (b)  *** */
    // 2
    /*
       // TODO

       a und b werden eingegenben und in A und B gesichert

            wenn a und b kleiner gleich null sind, dann wird
            1 auf a und 1 auf b addiert solange a und b ungleich 0 sind
            sind beide werte
            wenn a = 0 dann wird A in erb2 übertragen, ansonsten B

      ansonsten wenn a und b größer gleich null sind,
            dann wird 1 von a und b subrtraiert
            solange a und b ungleich 0 sind
      wenn a gleich 0 ist, dann wird B in erg2 gespeichert, ansonsten A

      ansonsten wemm a kleiner 0 ist, dann wird B in erg2 gespeichert, ansonsten A

    */

    int a = IOTools.readInteger("a = ");
    int A = a; // Originalwert von a merken
    int b = IOTools.readInteger("b = ");
    int B = b; // Originalwert von b merken
    int erg2;

    if ((a <= 0) && (b <= 0)) {
      while ((a != 0) && (b != 0)) {
        a++;
        b++;
      }
      erg2 = (a == 0) ? A : B;
    } else if ((a >= 0) && (b >= 0)) {
      while ((a != 0) && (b != 0)) {
        a--;
        b--;
      }
      erg2 = (a == 0) ? B : A;
    } else if (a < 0) {
      erg2 = B;
    } else {
      erg2 = A;
    }

    System.out.println("(b) Ergebnis:   = " + erg2 + "\n");

    System.out.println("\n***********************\n");

    /* *** Aufgabenteil (c)  *** */
    // 2
    /*
      // TODO

    */

    /*
       /* Hier werden zunaechst zwei Werte a, b mit
      a und b >= 0 eingelesen Zahl muss positiuv sein
      x y und z initialisieren mit 0
      die erste schleife läuft von 1 bis zum wert a in 1er Schritten
      auf y wird b addiert und zwar a * Ergebnis von y = a * b
      die zweite innere Schleife läuft von j = 1 bis j <= a in einer Schritten. x wird ebenfalls um 1 erhöht und hat am Ende der Schleife den Wert von a * a

      die letzte Schleife läuft von i = 1 los bis i den Wert  von b erreicht
      y wird um den wert a erhöht

       die zweite innere Schleife läuft von j = 1 bis j <= b in einer Schritten. z wird ebenfalls um 1 erhöht und hat dan den Wert von b * b

       Ergebnis: x = a*a, y = a*b + b*a, z=b*b
       Ergebnis: a*a + (a*b + b*a) + b*b
    */

    do {
      a = IOTools.readInteger("a = ");
    } while (a <= 0);
    do {
      b = IOTools.readInteger("b = ");
    } while (b <= 0);

    int x = 0, y = 0, z = 0;

    for (int i = 1; i <= a; i++) {
      y += b;
      for (int j = 1; j <= a; j++, x++) {}
    }

    for (int i = 1; i <= b; i++) {
      y += a;
      for (int j = 1; j <= b; j++, z++) {}
    }

    int erg3 = x + y + z;

    System.out.println("(c) Ergebnis:   = " + erg3);

    System.out.println("\n***********************\n");
  }
}
