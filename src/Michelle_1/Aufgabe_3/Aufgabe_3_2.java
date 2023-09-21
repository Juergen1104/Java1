package Michelle_1.Aufgabe_3;

public class Aufgabe_3_2 {

    // 3
    public static void canPartition(int[] a) {

        int produkt = 0;
        int faktorenErgebnis = 1;
        String faktorenAusgabe = "";

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j) {
                    produkt = a[i];
                    continue;
                }
                faktorenErgebnis = faktorenErgebnis * a[j];
                faktorenAusgabe = faktorenAusgabe + a[j] + " ";
            }
            if (produkt==faktorenErgebnis) {
                System.out.println(produkt+" /// " + faktorenAusgabe);
            }
            faktorenErgebnis=1;
            faktorenAusgabe="";
        }

    }


    public static void main(String[] args) {
        int[] a = {-1, -20, 5, -1, -2, 2};
        int[] b = {2, 8, 4, 1};
        int[] c = {-1, 1, -1};
        canPartition(a);
        canPartition(b);
        canPartition(c);
    }

    public static void ausgeben(int[] a) {
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

}
