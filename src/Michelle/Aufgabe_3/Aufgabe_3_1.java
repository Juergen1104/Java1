package Michelle.Aufgabe_3;

public class Aufgabe_3_1 {

    /* füllt den Inhalt des Feld a mit Zufallszahlen
       aus dem Intervall [1,100000] */
    public static void fuellen(int[] a){
        for (int i=0;i<a.length;i++){
            a[i] = (int)(Math.random() * 100_000) + 1;
        }
    }


    /* gibt den Inhalt des Feld a in der Konsole aus */
    public static void ausgeben(int[] a){
        for (int i=0;i<a.length;i++){
            if (a[i] <= 0){
                break;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /* Aufgabenteil (a) */
    // 2
    public static void summeGeradeUngerade(int[] a){

    }

    /* Aufgabenteil (b) */
    // 2
    public static void filterGerade(int[] a){

    }

    /* Aufgabenteil (c) */
    // 3
    public static void findePrimzahlen(int[] a){
        int[] primzahlen = Primzahlen.prim; // Feld mit allen Primzahlen bis 100000

    }

    public static void main(String[] args){
        int n = 25;

        int[] a = new int[n];
        fuellen(a);
        //ausgeben(a);      // Ausgabe ggf. zur Kontrolle
        summeGeradeUngerade(a);
        filterGerade(a);
        findePrimzahlen(a);

    }
}
