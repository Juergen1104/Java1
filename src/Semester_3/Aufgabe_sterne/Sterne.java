package Semester_3.Aufgabe_sterne;

// Aufgabe 6: Dreieck

public class Sterne {
  public static void main(String[] args) {
    int rows = IOTools.readInteger("Anzahl Zeilen einlesen: ");

    if ((rows % 2) == 0) {
      ++rows;
      System.out.println("Die Zahl ist gerade, ich erhoehe um 1");
    }

    /* ****************************************** */
    System.out.println("\nVariante 1:\n");

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= rows - i; j++) { // n-1, n-2, n-3,..., 0 Leerzeichen
        System.out.print("x");
      }

      for (int j = 1; j <= 2 * i - 1; j++) { // 1.3,5,7,... Sterne
        System.out.print("*");
      }
      System.out.println();
    }

    /* ****************************************** */
    System.out.println("\nVariante 2:\n");

    int n = rows;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < 2 * n; j++) { // 2*n Zeichen: Leerzeichen, dann Sterne,
        // dann wieder Leerzeichen
        if ((j >= (n - i)) && (j <= (n + i))) {
          System.out.print('*');
        } else {
          System.out.print(' ');
        }
      }
      System.out.println();
    }
  }
}
