package Klausur;

import java.time.LocalDate;

class BuechereiBuch extends Buch {
  private boolean ausgeliehen = false; // bei Initialisierung nicht ausgeliehen
  private LocalDate rueckgabe; // Wert null falls nicht ausgeliehen
  private String ausleiher = ""; // bei Initialisierung keine Ausleiher
  private static final char trenner = '|'; // Zeichen zum Trennen der Ausleihernamen

  public boolean istAusgeliehen() {
    return ausgeliehen;
  }
}
