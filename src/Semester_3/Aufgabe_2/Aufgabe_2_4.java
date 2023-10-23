package Semester_3.Aufgabe_2;

public class Aufgabe_2_4 {
  // 3P
  public static void teil_a() {
    // TODO (Aufgabenteil (a))

    int zielwert1 = 2023;
    int zielwert2 = 2024;

    for (int a = 1; a <= 1000; a++) {
      for (int b = 1; b <= 1000; b++) {
        for (int c = 1; c <= 1000; c++) {
          if (a * b + c == zielwert1 && a + b * c == zielwert2) {
            System.out.println("a = " + a + "  b = " + b + "  c = " + c);
          }
        }
      }
    }
  }

  // 3P
  public static void teil_b() {
    // TODO (Aufgabenteil (b))
    // Formel x*x + y*y + z*z = 3 * x * y * z

    int max = 500;
    for (int x = 1; x <= max; x++) {
      for (int y = x; y < max; y++) {
        for (int z = y; z <= max; z++) {
          int ergebnis1 = x * x + y * y + z * z;
          int ergebnis2 = 3 * x * y * z;
          if (ergebnis1 == ergebnis2) {
            System.out.println("(" + x + ", " + y + ", " + z + ")");
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    teil_a();
    teil_b();
  }
}
