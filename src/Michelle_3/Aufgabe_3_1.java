package Michelle_3;

public class Aufgabe_3_1 {

  /* gibt eine Zufallszahl aus dem Intervall [a,e]
  zurueck. Es muss a < e gelten. */
  public static int randomInt(int a, int e) {
    return (int) (Math.random() * ((e - a) + 1)) + a;
  }

  /* füllt den Inhalt des Feld a mit Zufallszahlen
  aus dem Intervall [a,e] */
  public static void fuellen(int[] feld, int a, int e) {
    for (int i = 0; i < feld.length; i++) {
      feld[i] = randomInt(a, e);
    }
  }

  /* gibt den Inhalt des Feld a in der Konsole aus */
  public static void ausgeben(int[] feld) {
    for (int i = 0; i < feld.length; i++) {
      System.out.printf("%3d ", feld[i]);
      if ((i + 1) % 10 == 0) {
        System.out.println();
      }
    }
    System.out.println();
  }

  /* *** Aufgabe (1a) *** */

  /* generiert ein neues Feld, in dem die negativen Zahlen
     aus dem Feld a im linken Teil liegen und die positiven bzw. 0
     im rechten Teil
  */
  // 3P
  public static int[] verteilen(int[] feld) {
    int[] feld2 = new int[feld.length];

    int links = 0;
    int rechts = feld.length - 1;

    for (int i = 0; i < feld.length - 1; i++) {
      if (feld[i] < 0) {
        feld2[links] = feld[i];
        links++;
      } else {
        feld2[rechts] = feld[i];
        rechts--;
      }
    }
    return feld2;
  }

  /* *** Aufgabe (1b) *** */
  /* Histogramm (Haeufigkeiten von Zahlen in einem Feld)
  bestimmen und zeichnen */
  // 3P
  public static void histogramm(int[] feld, int min, int max) {

    int[] feld2 = new int[max - min + 1];

    for (int i = 0; i < feld.length - 1; i++) {
      feld2[feld[i] - 1]++;
    }

    for (int i = 0; i < feld2.length; i++) {
      System.out.print(i + 1 + ": ");

      for (int j = 0; j < feld2[i]; j++) {
        System.out.print("*");
      }
      System.out.println(" "); // neue Zeile
    }
  }

  /* *** Aufgabe (1c) *** */

  /* gibt die Summe der beiden kleinsten positiven Zahlen (> 0)
     in einem Feld zurueck.
     Voraussetzung: Das Feld enthält mindestens zwei positive
     Zahlen.
  */
  // 6P
  public static int sumTwoSmallestPosNums(int[] feld) {

    // Minimum und Maximum der beiden kleinsten pos. Feldelemente
    int m1 = 0, m2 = 0;
    int v1 = 0, v2 = 0;

    for (int i = 0; i < feld.length; i++) {

      if (feld[i] < 0) {
        continue;
      }

      if (v1 == 0 && feld[i] > 0) {
        v1 = feld[i];
        continue;
      }
      if (v2 == 0 && feld[i] > 0) {
        v2 = feld[i];

        if (v1 < v2) {
          m1 = v1;
          m2 = v2;
        } else {
          m1 = v2;
          m2 = v1;
        }
        continue;
      }
      if (m1 > feld[i]) {
        m2 = m1;
        m1 = feld[i];
      } else if (m2 > feld[i]) {
        m2 = feld[i];
      }
    }
    return m1 + m2; // Rueckgabe der Summe
  }

  public static void main(String[] args) {
    int n = 50;
    int[] feld = new int[n];

    /* Test Aufgabenteil (a) */
    System.out.println("Aufgabe 1a:\n");
    fuellen(feld, -99, 99);
    ausgeben(feld);
    ausgeben(verteilen(feld));

    /* Test Aufgabenteil (b) */
    System.out.println("\nAufgabe 1b:\n");
    fuellen(feld, 1, 9);
    ausgeben(feld);
    histogramm(feld, 1, 9);

    /* Test Aufgabenteil (c) */
    System.out.println("\nAufgabe 1c:\n ");

    int[] feld1 = {19, 5, 42, 2, 77};
    ausgeben(feld1);
    System.out.println("   ---> Summe: " + sumTwoSmallestPosNums(feld1));

    int[] feld2 = {2, 9, 6, -1};
    ausgeben(feld2);
    System.out.println("   ---> Summe: " + sumTwoSmallestPosNums(feld2));

    int[] feld3 = {-1, -1, 1, 1};
    ausgeben(feld3);
    System.out.println("   ---> Summe: " + sumTwoSmallestPosNums(feld3));

    int[] feld4 = {3683, 2902, 3951, -475, 1617, -2385};
    ausgeben(feld4);
    System.out.println("   ---> Summe: " + sumTwoSmallestPosNums(feld4));
  }
}
