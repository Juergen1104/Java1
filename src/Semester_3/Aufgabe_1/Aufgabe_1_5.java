package Semester_3.Aufgabe_1;

import static Semester_3.Aufgabe_1.IOTools.readChar;

public class Aufgabe_1_5 {

  public static void main(String[] args) {

    char c1 = eingabeWahl();
    char c2 = eingabeWahl();
    char c3 = eingabeWahl();

    int dafuer = 0;
    int dagegen = 0;

    dafuer += (c1 == '+') ? 1 : 0;
    dafuer += (c2 == '+') ? 1 : 0;
    dafuer += (c3 == '+') ? 1 : 0;

    dagegen += (c1 == '-') ? 1 : 0;
    dagegen += (c2 == '-') ? 1 : 0;
    dagegen += (c3 == '-') ? 1 : 0;

    String ergebnis = (dafuer > dagegen) ? "Pro" : (dafuer < dagegen) ? "Contra" : "Fehler";

    System.out.println("Ergebnis: " + ergebnis);
  }

  public static char eingabeWahl() {
    return readChar("Ihre Wahl: ");
  }
}
