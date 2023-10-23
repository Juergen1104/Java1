package Semester_3.Aufgabe_2;

public class Aufgabe_2_3 {
  // Aufgabenteil (a)
  // 0 1 2 3 6 11 20 37 68  ...
  // Schema:

  // an = an-1+an-2+an-3

  public static void folge_a() {
    int[] intArray = new int[15];
    // setze die ersten drei Werte
    intArray[0] = 0;
    intArray[1] = 1;
    intArray[2] = 2;

    for (int i = 3; i < 15; i++) {
      intArray[i] = intArray[i - 1] + intArray[i - 2] + intArray[i - 3];
    }

    for (int i = 0; i < 15; i++) {
      System.out.print(intArray[i] + " ");
    }
  }

  // Aufgabenteil (b)
  // 1 6 4 9 7 12 10 15  ...
  // Schema:
  // erste Zahl + 3 ergibt die dritte Zahl,
  // zweite Zahl + 3 ergibt die vierte Zahl usw.
  public static void folge_b() {

    int[] intArray = new int[15];

    intArray[0] = 1;
    intArray[1] = 6;

    for (int i = 2; i < 15; i++) {
      intArray[i] = intArray[i - 2] + 3;
    }
    for (int i = 0; i < 15; i++) {
      System.out.print(intArray[i] + " ");
    }
  }

  // Aufgabenteil (c)
  // 2 2 5 11 20 32 47 65  ...
  // Schema:
  // 1 Zahl = 2
  // zweite Zahl = 1 Zahl + 0 *3
  // dritte Zahl = 2 Zahl + 1 * 3

  public static void folge_c() {

    int[] intArray = new int[15];

    intArray[0] = 2;

    for (int i = 1; i < 15; i++) {
      intArray[i] = intArray[i - 1] + (i - 1) * 3;
    }
    for (int i = 0; i < 15; i++) {
      System.out.print(intArray[i] + " ");
    }
  }

  public static void main(String[] args) {
    System.out.println("Aufgabenteil (a)");
    folge_a(); // erste Folge berechnen und ausgeben
    System.out.println("\nAufgabenteil (b)");
    folge_b(); // zweite Folge berechnen und ausgeben
    System.out.println("\nAufgabenteil (c)");
    folge_c(); // dritte Folge berechnen und ausgeben
    System.out.println();
  }
}
