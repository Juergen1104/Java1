package Michelle_1.Aufgabe_2;

public class Aufgabe_2_1 {

  public static void main(String[] args) {
    /* *** Aufgabenteil (a)  *** */
    /*
    // TODO
    */

    int n = IOTools.readInteger("n = ");

    int erg1 = 0;

    for (int i = n / 2; i > 0; i--) {
      erg1 += ((n % i) == 0) ? i : 0;
    }

    System.out.println("(a) Ergebnis:   = " + erg1 + "\n");

    /* *** Aufgabenteil (b)  *** */
    /*
    // TODO

    */

    n = IOTools.readInteger("n = ");
    int erg2 = 0;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        ++erg2;
      }
    }

    System.out.println("(b) Ergebnis:   = " + erg2 + "\n");

    /* *** Aufgabenteil (c)  *** */
    /*
    // TODO

    */

    n = IOTools.readInteger("n = ");
    int erg3 = 0;

    while (n > 0) {
      erg3 *= 10;
      erg3 += n % 10;
      n /= 10;
    }

    System.out.println("(c) Ergebnis:   = " + erg3);
  }
}
