package Michelle_1.Aufgabe_5;

public class Rekursion1 {
    public static void rek1(int n) {
        if (n != 0) {
            rek1(n / 2);
            System.out.print(n % 2);
        }
    }

    public static int rek2(int[] arr, int a, int b) {
        if (a == b) {
            return arr[a];
        } else {
            int x = (a + b) / 2;
            int w1 = rek2(arr, a, x);
            int w2 = rek2(arr, x + 1, b);
            return (w1 < w2) ? w1 : w2;
        }
    }


    public static void main(String[] args) {
        // .... Fuegen Sie hier ggf. Testaufrufe und Ausgaben ein
    }
}

