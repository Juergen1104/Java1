package Semester_1.Aufgabe_3;

public class Aufgabe_3_3 {
  static int[][] mz = {
    {8, 2, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8},
    {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 4, 56, 62, 0},
    {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65},
    {52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91},
    {22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80},
    {24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50},
    {32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70},
    {67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21},
    {24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72},
    {21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95},
    {78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92},
    {16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57},
    {86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58},
    {19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40},
    {4, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66},
    {88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69},
    {4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36},
    {20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16},
    {20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54},
    {1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48}
  };

  /* Richtung der Werte: horizontal, vertikal oder diagonal von links nach rechts
  bzw. rechts nach links */
  public enum Richtung {
    HORIZONTAL,
    VERTIKAL,
    DIAGONAL_LR,
    DIAGONAL_RL
  };

  /* Aufgabenteil (a) */
  // 1
  public static int getValue(int[][] m, int i, int j) {

    int result = 0;
    if ((j < 0) || (i > mz.length - 1) || j > mz[i].length - 1) {
      return result;
    }
    result = m[i][j];
    return result;
  }

  /* Aufgabenteil (b) */
  // 5
  public static void main(String[] args) {
    int n = 4; // Anzahl der zu aufeinanderfolgenden Elemente
    // Default-Wert für Richtung, in der die Elemente aufeinanderfolgen, die das
    // maximale Produkt ergeben
    Richtung richtung = Richtung.HORIZONTAL;
    int maximalWert = 0;
    int wertHorizontal = 0;
    int wertVertikal = 0;
    int wertDiagonal_LR = 0;
    int wertDiagonal_RL = 0;
    int maxI = 0;
    int maxJ = 0;

    String ausgabe = "";

    for (int i = 0; i < mz.length; i++) {
      for (int j = 0; j < mz[i].length; j++) {

        int geleseneZahl = getValue(mz, i, j);

        wertHorizontal = geleseneZahl;
        wertVertikal = geleseneZahl;
        wertDiagonal_LR = geleseneZahl;
        wertDiagonal_RL = geleseneZahl;

        for (int h = 1; h < n; h++) {
          wertHorizontal = wertHorizontal * getValue(mz, i, j + h);
          wertVertikal = wertVertikal * getValue(mz, i + h, j);
          wertDiagonal_RL = wertDiagonal_RL * getValue(mz, i + h, j - h);
          wertDiagonal_LR = wertDiagonal_LR * getValue(mz, i + h, j + h);
        }

        if (wertHorizontal > maximalWert) {
          maximalWert = wertHorizontal;
          richtung = Richtung.HORIZONTAL;
          maxI = i;
          maxJ = j;
        }
        if (wertVertikal > maximalWert) {
          maximalWert = wertVertikal;
          richtung = Richtung.VERTIKAL;
          maxI = i;
          maxJ = j;
        }
        if (wertDiagonal_RL > maximalWert) {
          maximalWert = wertDiagonal_RL;
          richtung = Richtung.DIAGONAL_RL;
          maxI = i;
          maxJ = j;
        }
        if (wertDiagonal_LR > maximalWert) {
          maximalWert = wertDiagonal_LR;
          richtung = Richtung.DIAGONAL_LR;
          maxI = i;
          maxJ = j;
        }
      }
    }
    String ausgabeFaktoren = "";

    switch (richtung) {
      case HORIZONTAL:
        ausgabeFaktoren =
            maximalWert
                + " = "
                + getValue(mz, maxI, maxJ)
                + " * "
                + getValue(mz, maxI + 1, maxJ)
                + " *  "
                + getValue(mz, maxI + 2, maxJ)
                + " * "
                + getValue(mz, maxI + 3, maxJ);
        break;
      case VERTIKAL:
        ausgabeFaktoren =
            maximalWert
                + " = "
                + getValue(mz, maxI, maxJ)
                + " * "
                + getValue(mz, maxI, maxJ + 1)
                + " * "
                + getValue(mz, maxI, maxJ + 2)
                + " * "
                + getValue(mz, maxI, maxJ + 3);
        break;
      case DIAGONAL_LR:
        ausgabeFaktoren =
            maximalWert
                + " = "
                + getValue(mz, maxI, maxJ)
                + " * "
                + getValue(mz, maxI + 1, maxJ + 1)
                + " * "
                + getValue(mz, maxI + 2, maxJ + 2)
                + " * "
                + getValue(mz, maxI + 3, maxJ + 3);
        break;
      case DIAGONAL_RL:
        ausgabeFaktoren =
            maximalWert
                + " = "
                + getValue(mz, maxI, maxJ)
                + " * "
                + getValue(mz, maxI + 1, maxJ - 1)
                + " * "
                + getValue(mz, maxI + 2, maxJ - 2)
                + " * "
                + getValue(mz, maxI + 3, maxJ - 3);
        break;
    }
    System.out.println(ausgabeFaktoren);
  }
}
