package Michelle.Aufgabe_4;

public class Klassenmethoden {

    /* Aufgabenteil (a) */
    // 1
    public static boolean mehrheit(boolean b1, boolean b2, boolean b3) {

        if ((b1 && b2) || (b2 && b3) || (b1 && b3)) {
            return true;
        } else return false;
    }

    /* Aufgabenteil (b) */
    // 2

    public static int anteil(int... werte) {
        int gesamt = 0;

        for (int x : werte) {
            gesamt += x;
        }


        return gesamt / werte.length;
    }


    /* Aufgabenteil (c) */
    // 2

    public static int[] sammeln(int[][] ff1) {

        int anzahlElemente = 0;

        for (int[] ersteDimensiuon : ff1) {
            for (int wert : ersteDimensiuon
            ) {

                anzahlElemente++;
            }
        }

        int feld[] = new int[anzahlElemente];

        int zaehler = 0;

        for (int[] ersteDimensiuon : ff1) {
            for (int wert : ersteDimensiuon
            ) {
                feld[zaehler] = wert;
                zaehler++;
            }
        }
        return feld;
    }

    /*   Test */
    public static void main(String[] args) {
        System.out.println("Aufgabenteil (a) ");
        boolean b1 = true, b2 = false, b3 = true;
        mehrheit(b1, b2, b3);

        System.out.println(b1 + " " + b2 + " " + b3 + ": " + mehrheit(b1, b2, b3));
        b1 = false;
        b2 = true;
        b3 = true;
        System.out.println(b1 + " " + b2 + " " + b3 + ": " + mehrheit(b1, b2, b3));
        b1 = false;
        b2 = false;
        b3 = false;
        System.out.println(b1 + " " + b2 + " " + b3 + ": " + mehrheit(b1, b2, b3));
        b1 = true;
        b2 = false;
        b3 = false;
        System.out.println(b1 + " " + b2 + " " + b3 + ": " + mehrheit(b1, b2, b3));


        System.out.println("\nAufgabenteil (b) ");
        int k = 1;
        System.out.println("Anteil der Zahl " + k + ": ");
        //System.out.println("(1) " + Math.round(anteil(1))  +  "%");   0%
        //System.out.println("(1) " + Math.round(anteil(1,1,2)) +  "%");  50%
        //System.out.println("(2) " + Math.round(anteil(1,1,2,2,1)) +  "%"); 50 %
        //System.out.println("(3) " + Math.round(anteil(1,1,2,2,1,1,3,2,3)) +  "%");   38%

        System.out.println("\nAufgabenteil (c) ");
        int[][] ff1 = {{1}, {2, 3}, {4, 5, 6}, {7}, {}, {}, {8, 9, 10}};
        int[] feld = sammeln(ff1);
        for (int x : feld) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

