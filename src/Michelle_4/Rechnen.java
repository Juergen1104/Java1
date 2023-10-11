package Michelle_4;

public class Rechnen {

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    /* *** Aufgabe 2 *** */

    public static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return max(max(max(a, b), c), d);
    }

    public static void main(String[] args) {
        System.out.println("Maximum von 3,-3,2: " + max(3, -3, 2));
        System.out.println("Maximum von 2,1,0,3: " + max(2, 1, 0, 3));
    }
}
