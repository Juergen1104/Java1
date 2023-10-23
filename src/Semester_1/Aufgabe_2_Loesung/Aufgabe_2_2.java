package Semester_1.Aufgabe_2_Loesung;

public class Aufgabe_2_2 {
  public static void main(String[] args) {

    String zahlenString = eingabeZahlen();

    Boolean monotonSteigend = pruefen(zahlenString);

    if (monotonSteigend) {
      System.out.println("Die Ziffern in der Zahl " + zahlenString + " steigen monoton.");
    } else {
      System.out.println("Die Ziffern in der Zahl " + zahlenString + " steigen nicht monoton.");
    }
  }

  private static Boolean pruefen(String zahlenString) {

    for (int i = 0; i < zahlenString.length() - 1; i++) {
      int zahl = Integer.parseInt(zahlenString.substring(i, i + 1));
      int zahl1 = Integer.parseInt(zahlenString.substring(i + 1, i + 2));
      if (zahl > zahl1) {
        return false;
      }
      ;
    }
    return true;
  }

  private static String eingabeZahlen() {

    long eingabe = 0;
    String text = "Bitte Zahl eingeben, exit= Eingabe > 9 ";
    int i = 0;
    String zahlenString = "";
    String zahlenString1 = "";

    do {
      eingabe = IOTools.readLong(text);

      if (eingabe < 10) {
        zahlenString = String.valueOf(eingabe);
        zahlenString1 = zahlenString1 + zahlenString;
        i++;
      }
    } while ((eingabe < 10));

    return zahlenString1;
  }
}
