package Semester_3.Aufgabe_6_Stream;

// 2
class Wuerfel {
  private static int count = 0;
  private int wert = 1;
  private int nr;

  /* *** Aufgabe 1a *** */
  public Wuerfel() {
    this.count++;
    this.nr = count;
  }

  public int getWert() {
    return this.wert;
  }

  public void werfen() {
    this.wert = (int) ((Math.random()) * 5 + 1);
  }

  @Override
  public String toString() {
    return (" W" + nr + " = " + wert);
  }
}

// 2
class Punkte {
  private int anzahl;

  /* *** Aufgabe 1b *** */

  public int getAnzahl() {
    return this.anzahl;
  }

  public void update(int p) {
    anzahl = anzahl + p;
    if (anzahl < 0) {
      anzahl = 0;
    }
  }

  @Override
  public String toString() {
    return (anzahl + " Punkte");
  }
}

// 3
class Spieler {

  private static int count = 0;

  private String name;
  public Punkte punkte;

  /* *** Aufgabe 1c *** */

  public Spieler() {
    count++;
    this.name = "Spieler-" + count;
    this.punkte = new Punkte();
  }

  public String getName() {
    return this.name;
  }

  public String getErgebnis() {
    return getName() + " hat " + punkte + " Punkte";
  }

  public int compareTo(Spieler eingabeSpieler) {

    if ((eingabeSpieler.punkte.getAnzahl()) > (this.punkte.getAnzahl())) {
      return -1;
    } else {
      return 1;
    }
  }

  public void wuerfeln(Wuerfel[] wuerfel) {

    int summeAugen = 0;

    for (Wuerfel wuerfel1 : wuerfel) {
      wuerfel1.werfen();
      summeAugen = summeAugen + wuerfel1.getWert();
    }
  }
}

// 5
public class WuerfelSpiel {
  private static int anzahlRunden = 5;
  private static int anzahlWuerfel = 3;

  private Wuerfel[] wuerfel;
  private Spieler sp1, sp2;

  public void ausgabeErgebnis() {

    System.out.println(sp1.getErgebnis());
    System.out.println(sp2.getErgebnis());
    if (sp1.compareTo(sp2) > 0) {
      System.out.println("Spieler 1 hat gewonnen");
    } else if (sp1.compareTo(sp2) < 0) {
      System.out.println("Spieler 2 hat gewonnen");
    } else {
      System.out.println("Unentschieden");
    }
  }

  /* *** Aufgabe 1d *** */

  public void spielen() {

    sp1 = new Spieler();
    sp2 = new Spieler();
    Wuerfel[] wuerfel = new Wuerfel[anzahlWuerfel];

    for (int i = 0; i < anzahlWuerfel; i++) {
      wuerfel[i] = new Wuerfel();
    }

    for (int i = 0; i < anzahlRunden; i++) {
      sp1.wuerfeln(wuerfel);
      System.out.println("Wurf Spieler 1: " + ausgabeWurf(wuerfel));

      for (int j = 0; j < anzahlWuerfel; j++) {
        sp1.punkte.update(wuerfel[j].getWert());
      }

      sp2.wuerfeln(wuerfel);
      System.out.println("Wurf Spieler 2: " + ausgabeWurf(wuerfel));
      System.out.println("---------------------------------------");
      for (int j = 0; j < anzahlWuerfel; j++) {
        sp2.punkte.update(wuerfel[j].getWert());
      }
    }
  }

  public String ausgabeWurf(Wuerfel[] wuerfel) {

    String ausgabe = "";

    for (Wuerfel wuerfel1 : wuerfel) {
      ausgabe = ausgabe + wuerfel1;
    }
    return ausgabe;
  }

  public static void main(String[] args) {
    WuerfelSpiel wSpiel = new WuerfelSpiel();
    wSpiel.spielen();
    wSpiel.ausgabeErgebnis();
  }
}
