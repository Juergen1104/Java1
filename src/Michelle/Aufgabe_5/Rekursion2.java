package Michelle.Aufgabe_5;

public class Rekursion2 {


    /* *** Aufgabenteil (a) *** */

    // 2
    public static void reverseArray(int [] a, int l, int r){

    }

    /* *** Aufgabenteil (b) *** */

    // 3
    public static boolean isFactorial(int n, int i) {
        return false; /// Dummy Return
    }

    /* *** Aufgabenteil (c) *** */

    // 2
    public static int multRek(int a, int b){
        return 0; /// Dummy Return
    }

    // 2
    public static int multByAdd(int a, int b) {
        return 0; /// Dummy Return
    }



    public static void main(String[] args){
        /* Test Aufgabenteil (a) */
        System.out.println("\nTest Aufgabenteil (a)");
        int[] arr1 = {1,3,5,7,6,4,2};
        for (int x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println();
        reverseArray(arr1,0,arr1.length-1);
        for (int x : arr1) {
            System.out.print(x + " ");
        }
        System.out.println();
        int[] arr2 = {0,-1,-10,-100};
        for (int x : arr2) {
            System.out.print(x + " ");
        }
        System.out.println();
        reverseArray(arr2,0,arr2.length-1);
        for (int x : arr2) {
            System.out.print(x + " ");
        }
        System.out.println();

        /* Test Aufgabenteil (b) */
        /* prueft alle Zahlen im Intervall [2,10000], ob diese eine Fakultatetszahl
           darstellen
        */
        System.out.println("\nTest Aufgabenteil (b)");
        for (int i=2;i<10000;i++){
            if (isFactorial(i,2)){
                System.out.println(i + " ist eine Fakultätszahl");
            }
        }

        /* Test Aufgabenteil (c) */
        System.out.println("\nTest Aufgabenteil (c)");
        int a = 12, b = 5;
        System.out.println(a + " * " + b + " = " + multByAdd(a,b));
        a = -21; b = 5;
        System.out.println(a + " * " + b + " = " + multByAdd(a,b));
        a = -51; b = -4;
        System.out.println(a + " * " + b + " = " + multByAdd(a,b));
        a = 273; b = -6;
        System.out.println(a + " * " + b + " = " + multByAdd(a,b));

    }
}
