package Michelle_1.Aufgabe_2_Loesung;

public class Aufgabe_2_3 {

    // Aufgabenteil (a)
    // 3 4 6 9 13 18 24 ...

    /*

    3 + 1 = 4
    4 + 2 = 6
    6 + 3 = 9
    9 + 4 = 13
    13 + 5 = 18
    18 + 6 = 24

    a = a + 1
    a = a + 2
    a = a + 3

     */

    // Schema:
    public static String folge_a() {

        int a = 3, n = 15;
        String ergebnis = "";

        for (int i = 1; i < n + 1; i++) {

            ergebnis = ergebnis + String.valueOf(a) + " ";
            a = a + i;
        }
        return ergebnis;


    }

    // Aufgabenteil (b)
    // 4 5 3 6 7 5 8 9 ...
    // Schema:

    // Aufgabenteil (c)
    // 3 4 6 3 7 12 6
    // Schema:

    /*
    a = a + 1
    a = a + 2
    a = a - 3

    a = a + 4
    a = a + 5
    a = a - 6
     */


    public static String folge_b() {

        int a = 4, n = 6;
        String ergebnis = String.valueOf(a) + " ";

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 4; j++) {
                if (j % 2 == 0) {
                    a = a - j;
                } else {
                    a = a + j;
                }
                ergebnis = ergebnis + String.valueOf(a) + " ";
            }
        }

        return ergebnis;

    }

    // Aufgabenteil (c)
    // 3 4 6 3 7 12 6 13 21
    // Schema:

    /*
    Zähler durch 3 teilbar, dann -


     */


    public static String folge_c() {

        int a = 3, n = 15;
        String ergebnis = String.valueOf(a) + " ";

        for (int i = 1; i < n; i++) {

            if (i % 3 == 0) {
                a = a - i;
            } else {
                a = a + i;
            }
            ergebnis = ergebnis + String.valueOf(a) + " ";
        }
        return ergebnis;
    }


    public static void main(String[] args) {
        System.out.println("Aufgabenteil (a)" + folge_a());
        folge_a();  // erste Folge berechnen und ausgeben
        System.out.println("Aufgabenteil (b) " + folge_b());
        folge_b();  // zweite Folge berechnen und ausgeben
        System.out.println("Aufgabenteil (c) " + folge_c());
        folge_c();  // dritte Folge berechnen und ausgeben
        System.out.println();
    }

}
