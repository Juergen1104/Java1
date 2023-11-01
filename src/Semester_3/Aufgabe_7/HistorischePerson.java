package Semester_3.Aufgabe_7;

import java.time.*;

public class HistorischePerson {
  private String name;
  private String beschreibung;
  private LocalDate geboren;
  private LocalDate gestorben;

  /* *** Aufgabe 2b *** */
  // 2
  public HistorischePerson(String infoStr) {}

  /* *** Aufgabe 2c *** */
  // 1
  private Period alter() {

    return null; // Dummy Return
  }

  /* *** Aufgabe 2d *** */
  // 2
  public String toString() {

    return ""; // Dummy Return
  }

  /* *** Aufgabe 2e *** */
  // 1
  public long compareTo(HistorischePerson p2) {
    return 0; // Dummy Return
  }

  /* *** Aufgabe 2f *** */
  // 3
  public static void sort(HistorischePerson[] hp) {}
}
