package Michelle_6;

// 2
class Wuerfel {
  private static int count = 0;
  private int wert = 1;
  private int nr;

  /* *** Aufgabe 1a *** */
}

// 2
class Punkte {
  private int anzahl;

  /* *** Aufgabe 1b *** */

}

// 3
class Spieler {
  private static int count = 0;
  private String name;
  private Punkte punkte;

  /* *** Aufgabe 1c *** */

}

// 5
public class WuerfelSpiel {
  private static int anzahlRunden = 5;
  private static int anzahlWuerfel = 3;

  private Wuerfel[] wuerfel;
  private Spieler sp1, sp2;

  public void ausgabeErgebnis() {
    /*
    System.out.println(sp1.getErgebnis());
    System.out.println(sp2.getErgebnis());
    if (sp1.compareTo(sp2) > 0) {
        System.out.println("Spieler 1 hat gewonnen");
    } else if (sp1.compareTo(sp2) < 0) {
        System.out.println("Spieler 2 hat gewonnen");
    } else {
        System.out.println("Unentschieden");
    }
    */
  }

  /* *** Aufgabe 1d *** */

  public void spielen() {}

  public static void main(String[] args) {
    WuerfelSpiel wSpiel = new WuerfelSpiel();
    wSpiel.spielen();
    wSpiel.ausgabeErgebnis();
  }
}
