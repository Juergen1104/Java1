package Michelle_4;

public class Klassenmethoden {


    /* Aufgabenteil (a) */
    // Bestimmt die Anzahl der Ziffern einer Zahl
    // n > 0
    // 2


    // Bestimmt, ob eine als Parameter uebergebene
    // Zahl n (mit n > 0) eine narzistische Zahl ist
    // 3




    /* Aufgabenteil (b) */
    // Bestimmt die kleinste Zahl aus einem Intervall [a,b], die
    // nicht in einem Feld enthalten ist und gibt diese zurueck
    // sind alle Zahlen aus [a,b] in dem Feld enthalten, wird
    // der Wert -1 zurueckgegeben
    // Das Feld sowie die Werte a, b werden der Methode als Parameter
    // uebergeben
    // Es darf vorausgesetzt werden, das a,b > 0 gilt und a >= b
    // 3




    /* Aufgabenteil (c) */
    /* Gibt ein Feld zurueck, welches die geraden Zahlen aus einem
       der Methode als Parameter uebergebenen Feld enthaelt */
    // 3



    /* ********************************************************* */


    /* gibt den Inhalt des Felds a in der aktuellen Zeile aus
       und trennt Elemente mit einem ,
       Das Feld wird mit geschweiften Klammern umgeben */
    public static void printFeld(int[] a) {
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < (a.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        /*
        System.out.println("Aufgabenteil (a) ");
        for (int n : new int[] {112, 153, 1634, 1643, 54748, 55555, 548834}) {
            if (istNarzistisch(n)) {
                System.out.printf("%6d  ist eine narz. Zahl mit ",n);
                System.out.println(anzStellen(n) + " Stellen");
            }
        }
        */

        /*
        System.out.println("\nAufgabenteil (b) ");
        int[][] felder = {{},
                          {1},
                          {1,3,2,5,6,7,1},
                          {4,2,1,5,6,8,2},
                          {7,6,5,4,3,2,1}};
        for (int[] f : felder) {
            int x = fehlendeZahl(f,1,7);

            if (x != -1) {
                System.out.print("Kleinste fehlende Zahl in dem Feld ");
                printFeld(f);
                System.out.println(" --> " + x);
            } else {
                System.out.print("In dem Feld ");
                printFeld(f);
                System.out.println(" fehlt keine Zahl");
            }
        }
        */

        /*
        System.out.println("\nAufgabenteil (c) ");
        int[][] felder2 = {{},
                           {1},
                           {1,2,3,4,5,6,7,8,9}};
        for (int[] f : felder2) {
            printFeld(f);
            int[] f2 = filterGerade(f);
            System.out.print(" --> ");
            printFeld(f2);
            System.out.println();
        }
        */

        System.out.println();
    }

}
