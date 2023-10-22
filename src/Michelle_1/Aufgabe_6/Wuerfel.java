package Michelle_1.Aufgabe_6;

public class Wuerfel {
  private int nr;

  public Wuerfel(int nr) {
    this.nr = nr;
  }

  public void werfen() {} // Methode macht nichts;

  public String toString() {
    return "Wuerfel Nr. " + nr;
  }

  public int getNr() {
    return nr;
  }

  public void setNr(int nr) {
    this.nr = nr;
  }
}

/* *** Aufgabenteil (a) *** */
// 4

class ZahlenWuerfel extends Wuerfel {
  private int anzahlSeiten;
  private int wertWfuerfel;

  private static int nummerDesWuerfels = 1;

  public ZahlenWuerfel(int anzalSeiten) {

    super(0);
    super.setNr(nummerDesWuerfels); // wie kann ich die Nummer direkt mitgeben?
    nummerDesWuerfels++;
    this.anzahlSeiten = anzalSeiten;
  }

  public void werfen() {
    wertWfuerfel = 1 + (int) (Math.random() * ((anzahlSeiten - 1) + 1));
  }

  public String toString() {
    return "Wuerfel Nr. " + getNr() + " (" + anzahlSeiten + " Seiten)  -> " + wertWfuerfel;
  }
}

/* *** Aufgabenteil (b) *** */
// 4

class Farbwuerfel extends Wuerfel {
  enum Color {
    SCHWARZ,
    ROT,
    GRUEN,
    BLAU
  };

  private static int nummerDesWuerfels = 1;
  private Color color = Color.SCHWARZ;

  public Farbwuerfel() {
    super(0);
    super.setNr(nummerDesWuerfels); // wie kann ich die Nummer direkt mitgeben?
    nummerDesWuerfels++;
  }

  public void werfen() {
    int farbwert = 1 + (int) (Math.random() * ((4 - 1) + 1));
    switch (farbwert) {
      case 1:
        color = Color.SCHWARZ;
        break;
      case 2:
        color = Color.ROT;
        break;
      case 3:
        color = Color.GRUEN;
        break;
      case 4:
        color = Color.BLAU;
        break;
      default:
        System.out.println("Wert  liegt nicht zwischen eins und vier");
        break;
    }
  }

  public String toString() {
    return "Farb-Wuerfel Nr. " + getNr() + " -> " + color;
  }
}
