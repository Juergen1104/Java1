package Michelle_1.Aufgabe_2;

public class Aufgabe_2_4 {

  // 1.5
  // naechsten Tausch von Bechern festlegen
  public static String nextSwap() {
    // ganzzahlige Zufallszahl aus dem Intervall [1,6]
    int zufall = (int) (Math.random() * 6) + 1;
    String action = ""; // gibt an, welche Becher getauscht werden sollen

    // TODO

    return action;
  }

  // 1
  // Position der Kugel bestimmen
  public static int getPosition(char a, char b, char c) {
    int pos = 0;

    // TODO

    return pos;
  }

  // 1.5
  // Position der Kugel raten
  public static int guess() {
    int pos = 0;

    // TODO

    return pos;
  }

  // 3
  public static void main(String[] args) {
    // Initialisierung der Becher (a und c leer, b belegt)
    char a = '-', b = 'x', c = '-';

    for (int i = 1; i <= 7; i++) {
      String action = nextSwap();

      // TODO
    }

    int guessPos = guess();
    int truePos = getPosition(a, b, c);

    // TODO

  }
}
