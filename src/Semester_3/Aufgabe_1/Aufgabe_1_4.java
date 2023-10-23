package Semester_3.Aufgabe_1;

import static Michelle_2.IOTools.readDouble;

public class Aufgabe_1_4 {

  public static void main(String[] args) {

    int anzahlBits = eingabe();

    int megabyte = anzahlBits / (1024 * 1024 * 8);
    int rest1 = anzahlBits % (1024 * 1024 * 8);

    int kilobyte = rest1 / (1024 * 8);
    int byteRest = rest1 % (1024 * 8);

    int bitrest = byteRest / 8;
    int rest2 = byteRest % 8;

    System.out.println(
        megabyte
            + " Mebibyte, "
            + kilobyte
            + " Kibibyte, "
            + bitrest
            + " Byte und "
            + rest2
            + " Bit");
  }

  public static int eingabe() {
    double x = 0;
    do {
      x = readDouble("Zahl eingeben: ");
    } while (x > 2147483647);
    return (int) x;
  }
}
