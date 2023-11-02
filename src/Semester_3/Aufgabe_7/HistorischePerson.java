package Semester_3.Aufgabe_7;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HistorischePerson {
  private String name;
  private String beschreibung;
  private LocalDate geboren;
  private LocalDate gestorben;

  public String getName() {
    return name;
  }

  public String getBeschreibung() {
    return beschreibung;
  }

  public LocalDate getGeboren() {
    return geboren;
  }

  public LocalDate getGestorben() {
    return gestorben;
  }

  /* *** Aufgabe 2b *** */
  // 2
  public HistorischePerson(String infoStr) {

    String[] result = infoStr.split(";");
    this.name = result[0];
    this.beschreibung = result[1];

    int geburtsJahr = Integer.parseInt(result[2].substring(0, 4));
    int geburtsMonat = Integer.parseInt(result[2].substring(4, 6));
    int geburtsTag = Integer.parseInt(result[2].substring(6, 8));

    int todesJahr = Integer.parseInt(result[3].substring(0, 4));
    int todesMonat = Integer.parseInt(result[3].substring(4, 6));
    int todesTag = Integer.parseInt(result[3].substring(6, 8));

    this.geboren = LocalDate.of(geburtsJahr, geburtsMonat, geburtsTag);
    this.gestorben = LocalDate.of(todesJahr, todesMonat, todesTag);
  }

  /* *** Aufgabe 2c *** */
  // 1
  private Period alter() {
    return Period.between(getGeboren(), getGestorben());
  }

  /* *** Aufgabe 2d *** */
  // 2
  public String toString() {

    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d. MMM. yyyy");
    Period alter = alter();

    // String für die Repräsentation erstellen
    String representation =
        String.format(
            "%s (%s):\n%s - %s\nAlter: %d Jahr(e), %d Monat(e) und %d Tag(e)",
            getName(),
            getBeschreibung(),
            getGeboren().format(dateFormat),
            getGestorben().format(dateFormat),
            alter.getYears(),
            alter.getMonths(),
            alter.getDays());

    return representation;
  }

  /* *** Aufgabe 2e *** */
  // 1
  public long compareTo(HistorischePerson p2) {

    long daysThisPerson = ChronoUnit.DAYS.between(getGeboren(), getGestorben());
    long daysOtherPerson = ChronoUnit.DAYS.between(p2.getGeboren(), p2.getGestorben());

    if (daysThisPerson > daysOtherPerson) {
      return 1;
    } else if (daysThisPerson < daysOtherPerson) {
      return -1;
    } else {
      return 0;
    }
  }

  /* *** Aufgabe 2f *** */
  // 3
  public static void sort(HistorischePerson[] hp) {

    int n = hp.length;
    boolean getauscht;

    for (int i = 0; i < n - 1; i++) {
      getauscht = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (hp[j].compareTo(hp[j + 1]) > 0) {
          HistorischePerson temp = hp[j]; // merken Person
          hp[j] = hp[j + 1];
          hp[j + 1] = temp;
          getauscht = true;
        }
      }
      if (!getauscht) {
        break;
      }
    }
  }
}
