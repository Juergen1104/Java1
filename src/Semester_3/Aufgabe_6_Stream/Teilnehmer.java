package Semester_3.Aufgabe_6_Stream;

class Teilnehmer {
  private static int count = 0;
  private int startNr; // eindeutige Startnummer
  private String name; // Name des Teilnehmers (Vor + Nachname)
  private int zeit; // im Wettkampf gelaufene Zeit (in Sekunden)
  private int jahrgang; // Geburtsjahr des Teilnehmers

  public Teilnehmer(String name, int zeit, int jahrgang) {
    startNr = ++count;
    this.name = name;
    this.zeit = zeit;
    this.jahrgang = jahrgang;
  }

  public String getName() {
    return this.name;
  }

  public int getZeit() {
    return this.zeit;
  }

  public static int getCount() {
    return count;
  }

  public int getStartNr() {
    return startNr;
  }

  public int getJahrgang() {
    return jahrgang;
  }

  // String-Repraesentation fuer die Ausgabe eines Teilnehmers
  // name + (Startnr / Jahrgang) formatierte Zeit
  public String toString() {
    int min = this.zeit / 60;
    int sek = this.zeit % 60;
    return this.name
        + " ("
        + this.startNr
        + "/"
        + this.jahrgang
        + ") "
        + min
        + ":"
        + ((sek < 10) ? ("0" + sek) : sek);
  }

  /* *** Aufgabe 2a *** */

  public int compareTo(Teilnehmer teilnehmer) {

    if (this.zeit > teilnehmer.zeit) {
      return -1;
    } else if (this.zeit < teilnehmer.zeit) {
      return 1;
    } else return 0; // gleiche Zeiten
  }

  public int getKey() {
    return this.jahrgang;
  }
}
