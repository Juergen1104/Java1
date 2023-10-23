package Semester_3.Aufgabe_5;

public class Rekursion1 {
  public static int fr(int a, int b) {
    if (a > b) {
      return 0;
    } else if (a == b) {
      return b;
    } else {
      return a + b + fr(a + 1, b - 1);
    }
  }

  public static int f(int z) {
    return fr(1, z);
  }

  public static void main(String[] args) {
    int z;
    do {
      z = IOTools.readInteger("z = ");
    } while (z <= 0);

    System.out.println("Ergebnis: " + f(z));
  }
}
/*

(a) // 2 P


(b) // 1 P


(c) // 2 P


*/
