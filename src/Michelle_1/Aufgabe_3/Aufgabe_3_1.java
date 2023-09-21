package Michelle_1.Aufgabe_3;

public class Aufgabe_3_1 {

    /* füllt den Inhalt des Feld a mit Zufallszahlen
       aus dem Intervall [1,100000] */
    public static void fuellen(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100_000) + 1;
        }
    }


    /* gibt den Inhalt des Feld a in der Konsole aus */
    public static void ausgeben(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                break;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /* Aufgabenteil (a) */
    // 2
    public static void summeGeradeUngerade(int[] a) {

        int summeGerade = 0;
        int summeUngerade = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                summeGerade = summeGerade + a[i];
            } else {
                summeUngerade = summeUngerade + a[i];
            }
        }

        System.out.println("Summe gerader Zahlen: " + summeUngerade);
        System.out.println("Summe ungerader Zahlen: " + summeGerade);

    }

    /* Aufgabenteil (b) */
    // 2
    public static void filterGerade(int[] a) {

        int[] b = new int[a.length];
        int j = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0) {
                continue;
            }
            b[j] = a[i];
            j++;
        }
        System.out.println("Gerade Zahlen: ");
        ausgeben(b);
    }

    /* Aufgabenteil (c) */
    // 3
    public static void findePrimzahlen(int[] a) {

        int[] primzahlen = Primzahlen.prim; // Feld mit allen Primzahlen bis 100000
        String ausgabePrimzahlen = "Primzahlen: ";

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                continue;
            }

            for (int j = 0; j < primzahlen.length; j++) {

                if (primzahlen[j] > a[i]) {
                    break;
                }
                if (a[i] == primzahlen[j]) {
                    ausgabePrimzahlen = ausgabePrimzahlen + a[i];
                    System.out.println(a[i]);

                }

            }


        }

    }

    public static void main(String[] args) {
        int n = 25;

        int[] a = new int[n];
        fuellen(a);
//        ausgeben(a);      // Ausgabe ggf. zur Kontrolle
        summeGeradeUngerade(a);
        filterGerade(a);
        findePrimzahlen(a);

    }
}
