package Semester_3.Aufgabe_12;

import java.time.Year;

public enum Monat {
  JANUAR(31),
  FEBRUAR(28),
  MÄRZ(31),
  APRIL(30),
  MAI(31),
  JUNI(30),
  JULI(31),
  AUGUST(31),
  SEPTEMBER(30),
  OKTOBER(31),
  NOVEMBER(30),
  DEZEMBER(31);

  private int tage;

  private Monat(int tage) {
    this.tage = tage;
  }

  public int getAnzahlTageMonat(int year) {
    if (this == FEBRUAR && Year.isLeap(year)) {
      return 29;
    } else {
      return tage;
    }
  }

  public int getAnzahlTageMonat() {
    return getAnzahlTageMonat(Year.now().getValue());
  }

  @Override
  public String toString() {
    return name().charAt(0) + name().substring(1).toLowerCase();
  }
}
