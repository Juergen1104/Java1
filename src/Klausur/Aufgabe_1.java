package Klausur;

public class Aufgabe_1 {

  /* ************************* (a) ************************** */
  // 4
  public static int folge(int a1) {

    return 0; // Dummy Return
  }

  // 4
  public static void laengsteFolge(int maxA1) {}

  /* ************************* (b) ************************** */

  // 2
  public static int laenge(int n) {

    return 0; // Dummy Return
  }

  // 4
  public static boolean istPrim(int n) {

    return false; // Dummy Return
  }

  // 2.5
  public static int rotiereZahl(int n, int k) {

    return 0; // Dummy Return
  }

  // 3
  public static boolean rotP(int p) {

    return false; // Dummy Return
  }

  // 2.5
  public static void testePrimzahlen() {}

  /* ************************* (c) ************************** */
  // 9
  public static boolean passwortOK(String pw) {

    return true; // Dummy Return
  }

  /* ************************* Test ************************** */

  public static void main(String[] args) {
    // Test (a)
    System.out.println("Test Aufgabenteil (a):");
    laengsteFolge(12);

    // Test (b)
    System.out.println("\nTest Aufgabenteil (b):");
    testePrimzahlen();

    // Test (c)
    System.out.println("\nTest Aufgabenteil (c):");

    for (String pw :
        new String[] {
          "A1B2C3D4", "A1B3C3D", "a1b2c3d4",
          "1ABCDEFG", "1ABCdef2", "1abcDEF1",
          "abC32Abc"
        }) {
      if (passwortOK(pw)) {
        System.out.println(pw + " ist ok!");
      } else {
        System.out.println(pw + " ist NICHT ok!");
      }
    }
  }
}
