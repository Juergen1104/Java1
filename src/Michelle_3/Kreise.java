package Michelle_3;

class Punkt {
  int x, y;

  public Punkt(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

class Kreis {
  Punkt mitte;
  int radius;

  public Kreis(Punkt mitte, int radius) {
    this.mitte = mitte;
    this.radius = radius;
  }
}

public class Kreise {

  // liefert eine Zufallszahl aus dem Intervall[1,n]
  // n muss dabei eine positive, ganze Zahl sein
  public static int randomInt(int n) {
    return (int) (Math.random() * n) + 1;
  }

  /* Ausgabe eines Felds von Kreisen */
  public static void ausgeben(Kreis[] kreise) {
    /* ***  Aufgabenteil (b) *** */

    for (int i = 0; i < kreise.length; i++) {
      System.out.println((i + 1) + ". Kreis:");
      System.out.println("Mittelpunkt: (" + kreise[i].mitte.x + "|" + kreise[i].mitte.y + ")");
      System.out.println("Radius: " + kreise[i].radius);
    }
  }

  /* Sortieren eines Felds von Kreisen */
  public static void sortieren(Kreis[] kreise) {
    /* ***  Aufgabenteil (c) *** */

    for (int j = 0; j < kreise.length - 1; j++) {
      for (int i = 0; i < kreise.length - 1; i++) {
        if (kreise[i].radius > kreise[i + 1].radius) {
          Kreis kreisgesichter = kreise[i];
          kreise[i] = kreise[i + 1];
          kreise[i + 1] = kreisgesichter;
        }
      }
    }

    System.out.println();
  }

  public static void main(String[] args) {
    int N = 4;

    /* *** Aufgabenteil (a) *** */

    Kreis[] kreise = new Kreis[N];

    for (int i = 0; i < N; i++) {
      kreise[i] = new Kreis(new Punkt(randomInt(50), randomInt(50)), randomInt(20));
    }

    ausgeben(kreise);

    sortieren(kreise);

    ausgeben(kreise);
  }
}
